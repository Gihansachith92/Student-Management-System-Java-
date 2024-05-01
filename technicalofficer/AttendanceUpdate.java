/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technicalofficer;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hispe
 */
public class AttendanceUpdate {
    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    

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
            Logger.getLogger(AttendanceUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
}
// insert
 public void insert(String userID,String courseCode,String sessionDate,String sessionType,String A_status){
        String sql = "INSERT INTO attendance VALUES(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, userID);
            ps.setString(2, courseCode);
            ps.setString(3, sessionDate);
            ps.setString(4, sessionType);
            ps.setString(5, A_status);
            
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"New attendance details added susscefully");
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
 // select
   public void getCourseValues(JTable table,String searchValue){
//        String sql = "SELECT * FROM course WHERE CONCAT(courceCode,cName,credit,weeek,theory,practical,userId)like ? ORDER BY desc";
        String sql = "SELECT * FROM course WHERE CONCAT( userID,courseCode,sessionDate,sessionType,A_status) LIKE ? ORDER BY userID DESC";

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
            Logger.getLogger(AttendanceUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   // update
   public void update(String userID,String courseCode,String sessionDate,String sessionType,String A_status){
          String sql =  "UPDATE course  SET userID = ? ,courseCode = ? , sessionDate = ? ,  sessionType = ? ,A_status = ? WHERE userID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, userID);
            ps.setString(2, courseCode);
            ps.setString(3, sessionDate);
            ps.setString(4, sessionType);
            ps.setString(5, A_status);
           
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Attendance updated Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }

    void insert(String userID, String courseCode, Date sessionDate, String sessionType, String aStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


