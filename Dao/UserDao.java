/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {

    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet result;

//    get user table max row
    public int getMaxRow() {
        int row = 0;

        try {
            st = con.createStatement();
            result = st.executeQuery("Select max(userId) from User");
            while (result.next()) {
                row = result.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;

    }
    
//    check email already exist
    public boolean  isEmailExist(String email){
        try {
            ps = con.prepareStatement("Select * from User where email = ?");
            ps.setString(1, email);
            if(result.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    
    //    check phone number already exist
    public boolean  isPhoneNumberExist(String phone){
        try {
            ps = con.prepareStatement("Select * from User where phoneNumber = ?");
            ps.setString(1, phone);
            if(result.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    //    get user value
    public String[] getUserValue(String userId) {
        String[] value = new String[8];
        try {
            ps = con.prepareStatement("Select * from User where userId = ?");
            ps.setString(1, userId);
            result = ps.executeQuery();
            if(result.next()) {
                value[0] = result.getString(1);
                value[1] = result.getString(2);
                value[2] = result.getString(3);
                value[3] = result.getString(4);
                value[4] = result.getString(5);
                value[5] = result.getString(6);
                value[6] = result.getString(7);
                value[7] = result.getString(8);

            }

        } catch (SQLException ex) {
             Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    //get userid
    public String getUserId(String email){
        String id  = "";
        try {
            ps = con.prepareStatement("SELECT userId from User where email = ?");
            ps.setString(1, email);
            result = ps.executeQuery();
            if(result.next()){
                id = result.getString(1);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return id;
    }
    // Update user information
    public boolean updateUser(String userId, String name, String email, String phoneNumber, String gender, String image) {
        try {
            ps = con.prepareStatement("UPDATE User SET uName = ?, email = ?, phoneNumber = ?, gender = ?, image = ? WHERE userId = ?");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phoneNumber);
            ps.setString(4, gender);
            ps.setString(5, image);
            ps.setString(6, userId);
            
            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
