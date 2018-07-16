
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
    public static Connection getConnection() throws SQLException{
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/stdmgdb?zeroDateTimeBehavior=convertToNull","root","");
        } catch (ClassNotFoundException ex) {
             System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
