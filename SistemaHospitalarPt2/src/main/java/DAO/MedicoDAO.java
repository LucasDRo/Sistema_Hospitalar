package DAO;

import br.edu.iftm.sistemahospitalarpt2.Model.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicoDAO {

    private Connection connect = null;

    public MedicoDAO() {
        connect = Conexao.getConexao();
    }

    public void cadastro(Medico m) {
        String sql;
        PreparedStatement ps = null;

        int pessoaid = 0;
        sql = "INSERT INTO Pessoa(nome, cpf, rg, dataNasc, idade, telefone) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, m.getNome());
            ps.setString(2, m.getCpf());
            ps.setString(3, m.getRg());
            ps.setDate(4, new java.sql.Date(m.dataNasc().getTime()));
            ps.setInt(5, m.getIdade());
            ps.setString(6, m.getTelefone());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            pessoaid = -1;
            if (rs.next()) {
                pessoaid = rs.getInt(1);
            }

            ps.close();

            sql = "INSERT INTO Medico(idPessoa, crm, salario, especializacao) VALUES (?, ?, ?, ?)";

            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pessoaid);
            ps.setString(2, m.getCrm());
            ps.setDouble(3, m.getSalario());
            ps.setString(4, m.getEspecializacao());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            int medicoid = -1;
            if (rs.next()) {
                medicoid = rs.getInt(1);
            }

            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro na operação de incluir registro de médico: " + e.getMessage());
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

            String query = ("DELETE FROM Medico WHERE idPessoa = " + idPessoa);
            PreparedStatement ps = connect.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao excluir médico do banco de dados: " + ex.getMessage());
        }

        try {
            String query = ("DELETE FROM Pessoa WHERE id = " + idPessoa);
            PreparedStatement ps = connect.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao excluir pessoa do banco de dados: " + ex.getMessage());
        }
    }

    public void alterar(String nome, Medico m) {

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

            ps.setString(1, m.getNome());
            ps.setString(2, m.getCpf());
            ps.setString(3, m.getRg());
            ps.setDate(4, new java.sql.Date(m.dataNasc().getTime()));
            ps.setInt(5, m.getIdade());
            ps.setString(6, m.getTelefone());
            ps.setInt(7, idPessoa);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao alterar pessoa do banco de dados: " + ex.getMessage());
        }

        try {

            String query = ("UPDATE Medico SET crm = ?, salario = ?, especializacao = ? WHERE idPessoa = ?");

            PreparedStatement ps = connect.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, m.getCrm());
            ps.setDouble(2, m.getSalario());
            ps.setString(3, m.getEspecializacao());
            ps.setInt(4, idPessoa);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao alterar médico do banco de dados: " + ex.getMessage());
        }
    }

    private ArrayList<Medico> carregarMedicosDoBanco() {

        ArrayList<Medico> medicos = new ArrayList<>();

        String query = ("SELECT * FROM Medico");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Medico med = new Medico();

                //ATRIBUTOS DO MÉDICO
                int idPessoa = rs.getInt("idPessoa");
                med.setCrm(rs.getString("crm"));
                med.setSalario(rs.getDouble("salario"));
                med.setEspecializacao(rs.getString("especializacao"));

                //ATRIBUTOS PESSOA
                String query2 = ("SELECT * FROM Pessoa WHERE id = " + idPessoa);

                PreparedStatement ps2 = connect.prepareStatement(query2);
                ResultSet rs2 = ps2.executeQuery();
                rs2.next();

                med.setNome(rs2.getString("nome"));
                med.setCpf(rs2.getString("cpf"));
                med.setRg(rs2.getString("rg"));
                med.setDataNasc(rs2.getDate("dataNasc"));
                med.setIdade(rs2.getInt("idade"));
                med.setTelefone(rs2.getString("telefone"));

                medicos.add(med);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar médicos do banco de dados: " + e.getMessage());
        }

        return medicos;
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

    public ArrayList<String> listarMedicos() {
        ArrayList<Medico> medicos = carregarMedicosDoBanco();
        ArrayList<String> nomes = new ArrayList<>();

        for (Medico m : medicos) {
            nomes.add(m.getNome());
        }
        return nomes;
    }

    public Medico retornaMedico(String nome) {
        ArrayList<Medico> medicos = carregarMedicosDoBanco();
        for (Medico m : medicos) {
            if (m.getNome().equals(nome)) {
                return m;
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
            
            if(rs.next()) {
                idPessoa = rs.getInt("id");
            }
            
            query = ("SELECT idMedico FROM Consulta");
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                if(idPessoa == rs.getInt("idMedico"))
                    return true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao realizar teste: " + ex.getMessage());
        }
        return false;
    }
}
