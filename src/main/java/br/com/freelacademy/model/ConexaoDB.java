
package br.com.freelacademy.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    
    public static Connection getConexao() throws SQLException {
        final String SERVIDOR = ""
                + "encrypt=false;trustServerCertificate=true";
        final String USUARIO = "";
        final String SENHA = "";

        return DriverManager.getConnection(SERVIDOR, USUARIO, SENHA);
    }
}
