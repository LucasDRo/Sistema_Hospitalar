package DAO;

import br.edu.iftm.sistemahospitalarpt2.Model.Consulta;
import br.edu.iftm.sistemahospitalarpt2.Model.Exame;
import br.edu.iftm.sistemahospitalarpt2.Model.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaDAO {

    private Connection connect = null;
    private int cod = 0;

    public ConsultaDAO() {
        connect = Conexao.getConexao();

    }

    public void cadastro(Consulta c, ArrayList<Integer> idExames, ArrayList<Integer> idMedicamentos) {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO Consulta (data, idMedico, idPaciente, valor, codigo) VALUES (?, ?, ?, ?, ?)";

        try {
            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setDate(1, new java.sql.Date(c.getData().getTime()));

            int idPessoa = 0;

            //Consultando id do Médico no banco
            try {

                String query = ("SELECT id FROM Pessoa WHERE nome = '" + c.getMedico().getNome() + "'");
                PreparedStatement ps2 = connect.prepareStatement(query);
                ResultSet rs = ps2.executeQuery();

                while (rs.next()) {
                    idPessoa = rs.getInt("id");
                }

            } catch (SQLException ex) {
                System.out.println("Erro ao selecionar médico do banco de dados: " + ex.getMessage());
            }

            ps.setInt(2, idPessoa);

            //Consultando id de Paciente no banco
            try {

                String query = ("SELECT id FROM Pessoa WHERE nome = '" + c.getPaciente().getNome() + "'");
                PreparedStatement ps3 = connect.prepareStatement(query);
                ResultSet rs = ps3.executeQuery();

                while (rs.next()) {
                    idPessoa = rs.getInt("id");
                }

            } catch (SQLException ex) {
                System.out.println("Erro ao selecionar paciente do banco de dados: " + ex.getMessage());
            }

            ps.setInt(3, idPessoa);
            ps.setFloat(4, c.getValor());
            ps.setInt(5, c.getCod());
            ps.executeUpdate();
            ps.close();

            sql = "SELECT id FROM Consulta WHERE codigo = ?";
            ps = connect.prepareStatement(sql);
            ps.setInt(1, c.getCod());
            ResultSet rs = ps.executeQuery();
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id");
            }

            for (int i = 0; i < idExames.size(); i++) {
                sql = "INSERT INTO ExamesConsulta (idconsulta, idexame) VALUES (?, ?)";
                ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setInt(1, id);
                ps.setInt(2, idExames.get(i));
                ps.executeUpdate();
                ps.close();
            }

            for (int i = 0; i < idMedicamentos.size(); i++) {
                sql = "INSERT INTO MedicamentosConsulta (idconsulta, idmedicamento) VALUES (?, ?)";
                ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setInt(1, id);
                ps.setInt(2, idMedicamentos.get(i));
                ps.executeUpdate();
                ps.close();
            }

        } catch (SQLException ex) {
            System.out.println("Erro na operação de incluir registro de consulta: " + ex.getMessage());
        }
    }

    public void excluir(int cod) {
        
        try {
            
            int id = 0;
            String query = ("SELECT id FROM Consulta WHERE codigo = ?");
            PreparedStatement ps = connect.prepareStatement(query);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                id = rs.getInt("id");
            }
            
            query = ("DELETE FROM examesconsulta WHERE idConsulta = ?");
            ps = connect.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            query = ("DELETE FROM medicamentosconsulta WHERE idConsulta = ?");
            ps = connect.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            query = ("DELETE FROM consulta WHERE id = ?");
            ps = connect.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir consulta:"+ex.getMessage());
        }
    }

    public int getCod() {
        if (existeConsulta()) {
            this.cod = getCodBanco();
        }
        return cod;
    }

    public ArrayList<Consulta> carregarConsultasDoBanco() {

        ArrayList<Consulta> consultas = new ArrayList<>();

        String query = ("SELECT * FROM Consulta");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Consulta con = new Consulta();

                con.setData(rs.getDate("data"));
                con.setCod(rs.getInt("codigo"));
                con.setValor((float) rs.getDouble("valor"));
                int idMedico = rs.getInt("idMedico");
                int idPaciente = rs.getInt("idPaciente");

                String query2 = ("SELECT nome FROM pessoa WHERE id = ?");
                PreparedStatement ps2 = connect.prepareStatement(query2);
                ps2.setInt(1, idMedico);
                ResultSet rs2 = ps2.executeQuery();

                if (rs2.next()) {
                    con.setNomeMedico(rs2.getString("nome"));
                }

                query2 = ("SELECT nome FROM pessoa WHERE id = ?");
                ps2 = connect.prepareStatement(query2);
                ps2.setInt(1, idPaciente);
                rs2 = ps2.executeQuery();

                if (rs2.next()) {
                    con.setNomePaciente(rs2.getString("nome"));
                }

                consultas.add(con);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar consultas do banco de dados: " + e.getMessage());
        }

        for (int i = 0; i < consultas.size(); i++) {
            try {

                query = ("SELECT id FROM Consulta WHERE codigo = ?");
                PreparedStatement ps = connect.prepareStatement(query);
                ps.setInt(1, consultas.get(i).getCod());
                ResultSet rs = ps.executeQuery();

                int id = 0;

                if (rs.next()) {
                    id = rs.getInt("id");
                }

                ArrayList<Integer> idMedicamentos = new ArrayList<>();

                query = ("SELECT idMedicamento FROM MedicamentosConsulta WHERE idConsulta = ?");
                ps = connect.prepareStatement(query);
                ps.setInt(1, id);
                rs = ps.executeQuery();

                while (rs.next()) {
                    idMedicamentos.add(rs.getInt("idMedicamento"));
                }

                ArrayList<Integer> idExames = new ArrayList<>();

                query = ("SELECT idExame FROM ExamesConsulta WHERE idConsulta = ?");
                ps = connect.prepareStatement(query);
                ps.setInt(1, id);
                rs = ps.executeQuery();

                while (rs.next()) {
                    idExames.add(rs.getInt("idExame"));
                }

                ArrayList<Medicamento> meds = new ArrayList<>();

                for (int pos = 0; pos < idMedicamentos.size(); pos++) {
                    query = ("SELECT * FROM Medicamento WHERE id = ?");
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, idMedicamentos.get(pos));
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        Medicamento m = new Medicamento();
                        m.setNome(rs.getString("nome"));
                        m.setValor((float) rs.getDouble("valor"));
                        m.setLaboratorio(rs.getString("laboratorio"));
                        m.setDataValidade(new java.sql.Date(rs.getDate("dataValidade").getTime()));
                        meds.add(m);
                    }

                }

                ArrayList<Exame> exas = new ArrayList<>();

                for (int pos = 0; pos < idExames.size(); pos++) {
                    query = ("SELECT * FROM Exame WHERE id = ?");
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, idExames.get(pos));
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        Exame e = new Exame();
                        e.setNome(rs.getString("nome"));
                        e.setTipo(rs.getString("tipo"));
                        e.setValor((float) rs.getDouble("valor"));
                        exas.add(e);
                    }
                }
                consultas.get(i).setMedicamentos(meds);
                consultas.get(i).setExames(exas);

            } catch (SQLException ex) {
                System.out.println("Erro ao carregar medicamentos e exames do banco de dados: " + ex.getMessage());
            }

        }

        return consultas;
    }

    private int getCodBanco() {
        int ultimoCod = 0;
        String query = ("SELECT MAX(codigo) FROM Consulta");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ultimoCod = rs.getInt(1);
                ultimoCod++;
            }

        } catch (SQLException e) {
            System.out.println("Erro consultar último código do banco de dados: " + e.getMessage());
        }
        return ultimoCod;
    }

    private boolean existeConsulta() {
        String query = ("SELECT COUNT(*) as total FROM Consulta");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                if (total > 0) {
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro consultar último código do banco de dados: " + e.getMessage());
        }
        return false;
    }

    public ArrayList<String> getCodigos() {
        ArrayList<String> codigos = new ArrayList<>();
        String query = ("SELECT codigo FROM Consulta");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                codigos.add(String.valueOf(rs.getInt("codigo")));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar códigos do banco de dados: " + e.getMessage());
        }
        return codigos;
    }

    public Consulta getConsulta(int cod) {
        ArrayList<Consulta> consultas = carregarConsultasDoBanco();

        for (Consulta c : consultas) {
            if (c.getCod() == cod) {
                return c;
            }
        }

        return null;
    }

}
