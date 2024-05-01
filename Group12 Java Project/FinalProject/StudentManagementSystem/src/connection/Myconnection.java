package connection;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Myconnection {
    public static final String username = "root";
    public static final String password = "Wolf1234@";
    public static final String url = "jdbc:mysql://localhost:3306/techmis";
    public static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,""+ex,"",JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
    
}
