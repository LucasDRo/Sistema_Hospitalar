package DAO;

import br.edu.iftm.sistemahospitalarpt2.Model.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MedicamentoDAO {
    private Connection connect = null;
    public MedicamentoDAO(){
        connect = Conexao.getConexao();
    }
    
    public void cadastro(Medicamento m){
       String sql;
       PreparedStatement ps = null;
       int medicamentoid = 0; 
       
       sql = "INSERT INTO Medicamento(nome, dataValidade, laboratorio, valor) VALUES (?, ?, ?, ?)";
       
        try {
            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, m.getNome());
            ps.setDate(2, new java.sql.Date(m.getDataValidade().getTime()));
            ps.setString(3, m.getLaboratorio());
            ps.setFloat(4, m.getValor());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            medicamentoid=-1;
            if(rs.next()){
                medicamentoid = rs.getInt(1);
            }
            
            ps.close();
            
            
        } catch (Exception e) {
            System.out.println("Erro na operação de incluir registro de medicamento: " + e.getMessage());
        }
    }
    
    public void excluir(String nome){
        try {
            
            String sql = ("DELETE FROM Medicamento WHERE nome = ?");
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setString(1, nome);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar medicamento do banco: "+ex.getMessage());
        }
        
        
    }
    
    public void alterar(String nome, Medicamento m){
        try{
            
            String query = ("UPDATE Medicamento SET nome = ?, dataValidade = ?, laboratorio = ?, valor = ? WHERE nome = ?");
           
            PreparedStatement ps = connect.prepareStatement(query);

            ps.setString(1, m.getNome());
            ps.setDate(2, new java.sql.Date(m.getDataValidade().getTime()));
            ps.setString(3, m.getLaboratorio());
            ps.setDouble(4, m.getValor());
            ps.setString(5, nome);

            ps.executeUpdate();
            ps.close();
            
        }catch (SQLException ex) {
            System.out.println("Erro ao alterar medicamento do banco de dados: " + ex.getMessage());
        }
    }
    
    public ArrayList<Medicamento> carregarMedicamentosDoBanco() {

        ArrayList<Medicamento> medicamentos = new ArrayList<>();

        String query = ("SELECT * FROM Medicamento");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Medicamento med = new Medicamento();

                med.setNome(rs.getString("nome"));
                med.setDataValidade(rs.getDate("dataValidade"));
                med.setLaboratorio(rs.getString("laboratorio"));
                med.setValor((float) rs.getDouble("valor"));
               
                

                medicamentos.add(med);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar medicamentos do banco de dados: " + e.getMessage());
        }

        return medicamentos;
    }
    
    public ArrayList<String> listarMedicamentos() {
        ArrayList<Medicamento> medicamentos = carregarMedicamentosDoBanco();
        ArrayList<String> nomes = new ArrayList<>();
        
        for (Medicamento m : medicamentos) {
            nomes.add(m.getNome());
        }

        return nomes;

    }
    
    public Medicamento retornaMedicamento(String nome) {
        ArrayList<Medicamento> medicamentos = carregarMedicamentosDoBanco();
        for (Medicamento m : medicamentos) {
            if (m.getNome().equals(nome)) {
                return m;
            }
        }
        return null;
    
        
    } 
    
    public int getID(String nome) {
        int id = 0;
        try {

            String query = ("SELECT id FROM medicamento WHERE nome = ?");

            PreparedStatement ps = connect.prepareStatement(query);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            

            if (rs.next()) {
                id = rs.getInt("id");
            }
            ps.close();

            return id;

        } catch (SQLException ex) {
            System.out.println("Erro ao consultar id de medicamento: " + ex.getMessage());
        }

        return id;
    }
    
    public boolean testeContem(String nome) {
        try {
            int idMedicamento = 0;
            
            String query = ("SELECT id FROM Medicamento WHERE nome = '" + nome + "'");
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                idMedicamento = rs.getInt("id");
            }
            
            query = ("SELECT idMedicamento FROM medicamentosconsulta");
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                if(idMedicamento == rs.getInt("idMedicamento"))
                return true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao realizar teste: " + ex.getMessage());
        }
        return false;
    }
}
