package DAO;

import br.edu.iftm.sistemahospitalarpt2.Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDAO {

    private Connection connect = null;

    public PacienteDAO() {
        connect = Conexao.getConexao();
    }

    public void cadastro(Paciente p) {
        String sql;
        PreparedStatement ps = null;

        int pessoaid = 0;
        sql = "INSERT INTO Pessoa(nome, cpf, rg, dataNasc, idade, telefone) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getRg());
            ps.setDate(4, new java.sql.Date(p.dataNasc().getTime()));
            ps.setInt(5, p.getIdade());
            ps.setString(6, p.getTelefone());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            pessoaid = -1;
            if (rs.next()) {
                pessoaid = rs.getInt(1);
            }

            ps.close();

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir registro de pessoa: " + e.getMessage());
        }

        sql = "INSERT INTO Paciente(idPessoa, endereco, plano) VALUES (?, ?, ?)";

        try {
            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pessoaid);
            ps.setString(2, p.getEndereco());
            ps.setBoolean(3, p.isPlano());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            int pacienteid = -1;
            if (rs.next()) {
                pacienteid = rs.getInt(1);
            }

            ps.close();

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir registro de paciente: " + e.getMessage());
        }

    }

    public void excluir(String nome) {
        int idPessoa = 0;

        try {

            String query = ("SELECT id FROM Pessoa WHERE nome = '" + nome + "'");
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                idPessoa = rs.getInt("id");
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao selecionar pessoa do banco de dados: " + ex.getMessage());
        }

        try {

            String query = ("DELETE FROM Paciente WHERE idPessoa = " + idPessoa);
            PreparedStatement ps = connect.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao excluir paciente do banco de dados: " + ex.getMessage());
        }

        try {
            String query = ("DELETE FROM Pessoa WHERE id = " + idPessoa);
            PreparedStatement ps = connect.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao excluir pessoa do banco de dados: " + ex.getMessage());
        }
    }

    public void alterar(String nome, Paciente p) {

        int idPessoa = 0;

        try {

            String query = ("SELECT id FROM Pessoa WHERE nome = '" + nome + "'");
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                idPessoa = rs.getInt("id");
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao selecionar pessoa no banco de dados: " + ex.getMessage());
        }

        try {

            String query = ("UPDATE Pessoa SET nome = ?, cpf = ?, rg = ?, dataNasc = ?, idade = ?, telefone = ? WHERE id = ?");

            PreparedStatement ps = connect.prepareStatement(query);

            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getRg());
            ps.setDate(4, new java.sql.Date(p.dataNasc().getTime()));
            ps.setInt(5, p.getIdade());
            ps.setString(6, p.getTelefone());
            ps.setInt(7, idPessoa);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao alterar pessoa do banco de dados: " + ex.getMessage());
        }

        try {

            String query = ("UPDATE Paciente SET endereco = ?, plano = ? WHERE idPessoa = ?");

            PreparedStatement ps = connect.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, p.getEndereco());
            ps.setBoolean(2, p.isPlano());
            ps.setInt(3, idPessoa);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao alterar paciente do banco de dados: " + ex.getMessage());
        }
    }

    private ArrayList<Paciente> carregarPacientesDoBanco() {

        ArrayList<Paciente> pacientes = new ArrayList<>();

        String query = ("SELECT * FROM Paciente");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente pac = new Paciente();

                //ATRIBUTOS DO PACIENTE
                int idPessoa = rs.getInt("idPessoa");
                pac.setEndereco(rs.getString("endereco"));
                pac.setPlano(rs.getBoolean("plano"));

                //ATRIBUTOS PESSOA
                String query2 = ("SELECT * FROM Pessoa WHERE id = " + idPessoa);

                PreparedStatement ps2 = connect.prepareStatement(query2);
                ResultSet rs2 = ps2.executeQuery();
                rs2.next();

                pac.setNome(rs2.getString("nome"));
                pac.setCpf(rs2.getString("cpf"));
                pac.setRg(rs2.getString("rg"));
                pac.setDataNasc(rs2.getDate("dataNasc"));
                pac.setIdade(rs2.getInt("idade"));
                pac.setTelefone(rs2.getString("telefone"));

                pacientes.add(pac);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar médicos do banco de dados: " + e.getMessage());
        }

        return pacientes;
    }

    public ArrayList<String> listarPacientes() {
        ArrayList<Paciente> pacientes = carregarPacientesDoBanco();

        ArrayList<String> nomes = new ArrayList<>();
        for (Paciente m : pacientes) {
            nomes.add(m.getNome());
        }

        return nomes;

    }

    public ArrayList<String> listarPessoas() {

        ArrayList<String> nomes = new ArrayList<>();

        String query = ("SELECT nome FROM Pessoa");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                nomes.add(rs.getString("nome"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar médicos do banco de dados: " + e.getMessage());
        }

        return nomes;
    }

    public Paciente retornaPaciente(String nome) {
        ArrayList<Paciente> pacientes = carregarPacientesDoBanco();
        for (Paciente p : pacientes) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean testeContem(String nome) {
        try {
            int idPessoa = 0;
            
            String query = ("SELECT id FROM Pessoa WHERE nome = '" + nome + "'");
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                idPessoa = rs.getInt("id");
            }
            
            query = ("SELECT idPaciente FROM Consulta");
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                if(idPessoa == rs.getInt("idPaciente"))
                return true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao realizar teste: " + ex.getMessage());
        }
        return false;
    }
}
