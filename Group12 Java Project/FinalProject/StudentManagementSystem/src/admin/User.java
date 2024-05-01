
package admin;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class User {
    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
       
    // insert data into user table
    public void insert(String id, String type , String name , int pnumber, String email , String gender, String password ,String imagepath){
       String sql = "insert into User values(?,?,?,?,?,?,?,?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, type);
            ps.setString(3, name);
            ps.setInt(4, pnumber);
            ps.setString(5, email);
            ps.setString(6, gender);
            ps.setString(7, password);
            ps.setString(8, imagepath);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "New User added successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //get all the value to user table
    public void getTableValue(JTable table, String searchValue){
       String sql = "select * from User";
       
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            
            while(rs.next()){
             row = new Object[8];
             row[0] = rs.getString(1);
             row[1] = rs.getString(2);
             row[2] = rs.getString(3);
             row[3] = rs.getInt(4);
             row[4] = rs.getString(5);
             row[5] = rs.getString(6);
             row[6] = rs.getString(7);
             row[7] = rs.getString(8);
             model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // update user values
    public void update(String id, String type , String name , int pnumber, String email , String gender, String password ,String imagepath){
       String sql = "update User set type=?, uName=?, phoneNumber=?, email=?, gender=?, pwd=?, image=? where userId=?";
       
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, type);
            ps.setString(2, name);
            ps.setInt(3, pnumber);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setString(6, password);
            ps.setString(7, imagepath);
            ps.setString(8, id);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "User Data Updated successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    //user data delete
    public void delete(String id){
       int yno = JOptionPane.showConfirmDialog(null, "User data will delete permenetly!","User Delete", JOptionPane.OK_CANCEL_OPTION,0);
       if(yno == JOptionPane.OK_OPTION){
           try {
               ps = con.prepareStatement("delete from User where userId=?");
               ps.setString(1, id);
               
                if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "User Deleted successfully.");
                }
               
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       }
    }
     
}
