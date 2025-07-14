
package br.com.freelacademy.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    
    public static Connection getConexao() throws SQLException {
        final String SERVIDOR = "jdbc:sqlserver://localhost:1433;databaseName=db_freelacademy";
        final String USUARIO = "Freela";
        final String SENHA = "Mudar@123";

        return DriverManager.getConnection(SERVIDOR, USUARIO, SENHA);
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
