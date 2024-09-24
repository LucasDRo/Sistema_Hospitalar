package DAO;

import br.edu.iftm.sistemahospitalarpt2.Model.Usuario;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    private Connection connect = null;
    private boolean status;
    private boolean statusAdmin;
    private String userAtual;
    
    public UsuarioDAO() {
        connect = Conexao.getConexao();
    }
    
    public String getUserAtual(){
        return userAtual;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatusAdmin() {
        return statusAdmin;
    }

    public void setStatusAdmin(boolean statusAdmin) {
        this.statusAdmin = statusAdmin;
    }
    
    public boolean cadastro(Usuario u) {
        String sql;
        PreparedStatement ps = null;
        int usuarioid = 0;

        sql = "INSERT INTO Usuario(usuario, senha, isAdmin) VALUES (?, ?, ?)";

        try {
            ps = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getSenha());
            ps.setBoolean(3, u.isAdmin());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            usuarioid = -1;
            if (rs.next()) {
                usuarioid = rs.getInt(1);
            }

            ps.close();

        } catch (SQLException ex) {
            System.out.println("Erro na operação de incluir registro de exame: " + ex.getMessage());
        }
        return false;
    }
    
    public void excluir(String user){
        try {
            String sql;
            PreparedStatement ps = null;
            
            sql = "DELETE FROM Usuario WHERE usuario = '" + user + "'";
            ps = connect.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int testarLogin(Usuario u) {

        ArrayList<Usuario> users = carregarUsersDoBanco();
        int op = 0;

        for (Usuario usuario : users) {
            if (usuario.getUsuario().equals(u.getUsuario()) && usuario.getSenha().equals(u.getSenha())) {
                userAtual = usuario.getUsuario();
                if (usuario.isAdmin()) {
                    op = 2;
                } else {
                    op = 1;
                }
            }
        }

        return op;

    }

    private ArrayList<Usuario> carregarUsersDoBanco() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        String query = ("SELECT usuario, senha, isadmin FROM usuario");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String user = rs.getString("usuario");
                String senha = rs.getString("senha");
                boolean isAdmin = rs.getBoolean("isadmin");

                Usuario usuario = new Usuario(user, senha, isAdmin);
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar usuários do banco de dados: " + e.getMessage());
        }

        return usuarios;
    }
    
    public ArrayList<String> listarNomesUsers(){
        ArrayList<String> usuarios = new ArrayList<>();

        String query = ("SELECT usuario FROM usuario");

        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String user = rs.getString("usuario");

                usuarios.add(user);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar usuários do banco de dados: " + e.getMessage());
        }

        return usuarios;
    }
    
    public static String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(senha.getBytes());

            StringBuilder senhaCriptografada = new StringBuilder();
            for (byte b : bytes) {
                senhaCriptografada.append(String.format("%02x", b));
            }

            return senhaCriptografada.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
