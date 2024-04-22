
package Admin;

import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cource {
    
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    
    // insert data into cource table
    
     public void insert(String code, String name , int credit , int week, int theory , int practical, String lecid ){
       String sql = "insert into cource values(?,?,?,?,?,?,?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, code);
            ps.setString(2, name);        
            ps.setInt(3, credit);
            ps.setInt(4, week);
            ps.setInt(5, theory);
            ps.setInt(6, practical);
            ps.setString(7, lecid);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "New Cource added successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
      //get all the value to cource table
    public void getTableValue(JTable table, String searchValue){
       String sql = "select * from cource";
       
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            
            while(rs.next()){
             row = new Object[7];
             row[0] = rs.getString(1);
             row[1] = rs.getString(2);
             row[2] = rs.getInt(3);
             row[3] = rs.getInt(4);
             row[4] = rs.getInt(5);
             row[5] = rs.getInt(6);
             row[6] = rs.getString(7);
             
             model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // update cource value 
    
    public void update(String code, String name , int credit , int week, int theory , int practical, String lecid){
       String sql = "update cource set cName=?, credit=?, weeek=?, theory=?, practical=?, userId=? where courceCode=?";
       
       try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setInt(2, credit);
            ps.setInt(3, week);
            ps.setInt(4, theory);
            ps.setInt(5, practical);
            ps.setString(6, lecid);
            ps.setString(7, code);
            
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Cource Data Updated successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
     //Cource data delete
    
    public void delete(String code){
       int yno = JOptionPane.showConfirmDialog(null, "Cource data will delete permenetly!","Cource Delete", JOptionPane.OK_CANCEL_OPTION,0);
       if(yno == JOptionPane.OK_OPTION){
           try {
               ps = con.prepareStatement("delete from cource where courceCode=?");
               ps.setString(1, code);
               
                if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Cource Deleted successfully.");
                }
               
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       }
    }
    
    
    
}
