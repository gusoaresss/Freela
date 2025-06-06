import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexaoDB {
    
    public static Connection conectar(){
        try{
            String url = "";
            String user = "";
            String senha = "";
            return DriverManager.getConnection(url,user,senha);
        }
        catch(SQLException e){
            System.out.println("ERRO na conexão"+ e.getMessage());
            return null;

        }
    }
}
