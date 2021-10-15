package jbilling;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Honey s3c
 */
public class MySQLConnection {
    
    public static Connection Connect(){
    
        Connection conn = null;  
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/invento","root","root");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return conn;
    }
    
    public void ExecuteQuery(String query){
        try {
            Statement stmt = MySQLConnection.Connect().createStatement();
            stmt.execute(query);
            MySQLConnection.Connect().close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
   
    
}
