
package br.com.freelacademy.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    
    public static Connection getConexao() throws SQLException {
        final String SERVIDOR = "jdbc:sqlserver://localhost:1433;databaseName=db_freelacademy;encrypt=true;trustServerCertificate=true;integratedSecurity=true";
       
        return DriverManager.getConnection(SERVIDOR);
    }

//    public Connection getConnection() {
//        System.out.println("passou por aqui");
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
