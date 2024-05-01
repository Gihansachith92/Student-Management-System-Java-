
package admin;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Timetable {
    
    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    
    // insert data into Time table table
    
    public void insert(  String title , String dept, int level, String dlink){
       String sql = "insert into timeTable values(?,?,?,?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, dept);            
            ps.setInt(3, level);
            ps.setString(4, dlink);
            
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "New Time Table added successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     //get all the value to Time table table
    public void getTableValue(JTable table, String searchValue){
       String sql = "select * from timeTable";
       
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            
            while(rs.next()){
             row = new Object[4];
             row[0] = rs.getString(1);
             row[1] = rs.getString(2);
             row[2] = rs.getInt(3);
             row[3] = rs.getString(4);
             
             model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //update time table value
    
    public void update(String title , String dept, int level, String dlink){
       String sql = "update timeTable set dipartment=?, level=?, drivelink=?  where title=?";
       
       try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, dept);
            ps.setInt(2, level);
            ps.setString(3, dlink);
            ps.setString(4, title);
           
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Time Table Data Updated successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
     //Time table data delete
    
    public void delete(String title){
       int yno = JOptionPane.showConfirmDialog(null, "Time Table data will delete permenetly!","Time Table Delete", JOptionPane.OK_CANCEL_OPTION,0);
       if(yno == JOptionPane.OK_OPTION){
           try {
               ps = con.prepareStatement("delete from timeTable where title=?");
               ps.setString(1, title);
               
                if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Time Table Deleted successfully.");
                }
               
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       }
    }
    
    
    
    
}
