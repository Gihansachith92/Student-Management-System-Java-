
package lecturer;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AttendanceEligibility {
    
    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    
    public void getStudentAttendance(JTable table,String searchValue){
//        String sql = "SELECT * FROM User WHERE CONCAT(userId, uName, phoneNumber, email,gender) AND type = Student use LIKE ? ORDER BY userId DESC";
        String sql = "SELECT * FROM attendance_eligibility WHERE CONCAT(userId,courceCode,sessionType,Percentage,Eligiblity) LIKE ? ORDER BY userId ASC";


        try {
            ps= con.prepareStatement(sql);
            ps.setString(1,"%" + searchValue + "%");
            ResultSet result =ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            Object[] row;
            while(result.next()){
                row = new Object[5];
                row[0] = result.getString(1);
                row[1] = result.getString(2);
                row[2] = result.getString(3);
                row[3] = result.getString(4);
                row[4] = result.getString(5);
                model.addRow(row);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
