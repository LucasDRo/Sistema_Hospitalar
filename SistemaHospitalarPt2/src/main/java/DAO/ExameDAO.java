package DAO;

import br.edu.iftm.sistemahospitalarpt2.Model.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExameDAO {

    private Connection connect = null;

    public ExameDAO() {
        connect = Conexao.getConexao();
    }

    public void cadastro(Exame e) {
        String sql;
        PreparedStatement ps = null;
        int exameid = 0;

        sql = "INSERT INTO Exame(nome, tipo, valor) VALUES (?, ?, ?)";

        try {
            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, e.getNome());
            ps.setString(2, e.getTipo());
            ps.setFloat(3, e.getValor());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            exameid = -1;
            if (rs.next()) {
                exameid = rs.getInt(1);
            }

            ps.close();

        } catch (Exception ex) {
            System.out.println("Erro na operação de incluir registro de exame: " + ex.getMessage());
        }
    }

    public void excluir(String nome) {
        try {

            String sql = ("DELETE FROM Exame WHERE nome = ?");
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setString(1, nome);

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao deletar exame do banco: " + ex.getMessage());
        }

    }

    public void alterar(String nome, Exame e) {
        try {

            String query = ("UPDATE Exame SET nome = ?, tipo = ?, valor = ? WHERE nome = ?");

            PreparedStatement ps = connect.prepareStatement(query);

            ps.setString(1, e.getNome());
            ps.setString(2, e.getTipo());
            ps.setDouble(3, e.getValor());
            ps.setString(4, nome);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao alterar medicamento do banco de dados: " + ex.getMessage());
        }
    }

    public ArrayList<Exame> carregarExamesDoBanco(){

        ArrayList<Exame> exames = new ArrayList<>();

        String query = ("SELECT * FROM Exame");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Exame exa = new Exame();

                exa.setNome(rs.getString("nome"));
                exa.setTipo(rs.getString("tipo"));
                exa.setValor((float) rs.getDouble("valor"));

                exames.add(exa);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar exames do banco de dados: " + e.getMessage());
        }

        return exames;
    }

    public ArrayList<String> listarExames() {
        ArrayList<Exame> exames = carregarExamesDoBanco();
        ArrayList<String> nomes = new ArrayList<>();

        for (Exame e : exames) {
            nomes.add(e.getNome());
        }

        return nomes;

    }

    public Exame retornaExame(String nome) {
        ArrayList<Exame> exames = carregarExamesDoBanco();
        for (Exame e : exames) {
            if (e.getNome().equals(nome)) {
                return e;
            }
        }
        return null;
    }

    public int getID(String nome) {
        int id = 0;
        try {

            String query = ("SELECT id FROM exame WHERE nome = ?");

            PreparedStatement ps = connect.prepareStatement(query);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            

            if (rs.next()) {
                id = rs.getInt("id");
            }
            ps.close();

            return id;

        } catch (SQLException ex) {
            System.out.println("Erro ao consultar id de exame: " + ex.getMessage());
        }

        return id;
    }
    
    public boolean testeContem(String nome) {
        try {
            int idExame = 0;
            
            String query = ("SELECT id FROM Exame WHERE nome = '" + nome + "'");
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                idExame = rs.getInt("id");
            }
            
            query = ("SELECT idExame FROM examesconsulta");
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                if(idExame == rs.getInt("idExame"))
                return true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao realizar teste: " + ex.getMessage());
        }
        return false;
    }

}
