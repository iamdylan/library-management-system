
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
 Connection conn;
 public static Connection ConnecrDb(){
     try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Asus\\Desktop\\Library_Management_System\\library.sqlite");
        return conn;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
 }
}
