package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class Conexao {
    public static Connection getConexao(){
        try {
            
            Class.forName("org.postgresql.Driver");
            Properties prope = new Properties();
            prope.put("user", "postgres");
            prope.put("password", "230490");
            return DriverManager.getConnection("jdbc:postgresql://localhost/SistemaHospitalar",prope);
        } catch (Exception ex) {
            System.err.println("Falha na conexão com o banco!");
        }
        return null;
    }
}
