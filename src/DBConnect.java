 
import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnect {
    public static Connection connectMySQL(){
    Connection con=null;
    try{
        String url="jdbc:Mysql://localhost:3306/project";
        Class.forName("java.sql.Driver");
        con=DriverManager.getConnection(url,"root","amubetuojha");
       //JOptionPane.showMessageDialog(null,"database connected");
    }catch(Exception e)
    {JOptionPane.showMessageDialog(null,e);
    }
    return con;
    }
    
}
