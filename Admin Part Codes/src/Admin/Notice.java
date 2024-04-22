
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

public class Notice {
    
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    
    
    // insert data into notice table
    
    public void insert( int nnumber, String date , String title){
       String sql = "insert into notice values(?,?,?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, nnumber);
            ps.setString(2, date);
            ps.setString(3, title);
            
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "New Notice added successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //get all the value to notice table
    public void getTableValue(JTable table, String searchValue){
       String sql = "select * from notice";
       
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            
            while(rs.next()){
             row = new Object[3];
             row[0] = rs.getInt(1);
             row[1] = rs.getString(2);
             row[2] = rs.getString(3);
             
             model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // update Notice values
    
    public void update(int nnumber, String date , String title){
       String sql = "update notice set date=?, title=? where number=?";
       
       try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, date);
            ps.setString(2, title);
            ps.setInt(3, nnumber);
            
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Notice Data Updated successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
     //notice data delete
    
    public void delete(int number){
       int yno = JOptionPane.showConfirmDialog(null, "Notice data will delete permenetly!","Notice Delete", JOptionPane.OK_CANCEL_OPTION,0);
       if(yno == JOptionPane.OK_OPTION){
           try {
               ps = con.prepareStatement("delete from notice where number=?");
               ps.setInt(1, number);
               
                if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Notice Deleted successfully.");
                }
               
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       }
    }
    
    
    
}
