package lecturer;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Course {
    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    
    
    //get table max
    public String getMax(){
        String id  = "";
        Statement st;
        
        
        try {
            st = con.createStatement();
            ResultSet result =  st.executeQuery("select max(userId) from User");
            while(result.next()){
                id = result.getString("userId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
        
    }
    //insert data to table 
    public void insert(String courseCode,String courseName,String credit,String week,String theroy,String pratical,String lecId){
        String sql = "INSERT INTO Cource VALUES(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, courseCode);
            ps.setString(2, courseName);
            ps.setString(3, credit);
            ps.setString(4, week);
            ps.setString(5, theroy);
            ps.setString(6, pratical);
            ps.setString(7, lecId);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"New course Matrial added susscefully");
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    public boolean isCourseCodeExist(String courseCode){
        try {
            ps = con.prepareStatement("select * from Cource where courceCode = ?");
            ps.setString(1, courseCode);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //get all data course table 
    public void getCourseValues(JTable table,String searchValue){
//        String sql = "SELECT * FROM course WHERE CONCAT(courceCode,cName,credit,weeek,theory,practical,userId)like ? ORDER BY desc";
        String sql = "SELECT * FROM Cource WHERE CONCAT(courceCode, cName, credit, weeek, theory, practical, userId) LIKE ? ORDER BY courceCode DESC";

        try {
            ps= con.prepareStatement(sql);
            ps.setString(1,"%" + searchValue + "%");
            ResultSet result =ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            Object[] row;
            while(result.next()){
                row = new Object[7];
                row[0] = result.getString(1);
                row[1] = result.getString(2);
                row[2] = result.getString(3);
                row[3] = result.getString(4);
                row[4] = result.getString(5);
                row[5] = result.getString(6);
                row[6] = result.getString(7);
                
                model.addRow(row);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
//    Update course table
      public void update(String courseCode,String courseName,String credit,String week,String theroy,String pratical,String lecId){
          String sql =  "UPDATE Cource  SET cName = ? ,credit = ? , weeek = ? ,  theory = ? ,practical = ?, userId = ? WHERE courceCode = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, courseName);
            ps.setString(2, credit);
            ps.setString(3, week);
            ps.setString(4, theroy);
            ps.setString(5, pratical);
            ps.setString(6, lecId);
            ps.setString(7, courseCode);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Student data updated Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }
    
   
}
