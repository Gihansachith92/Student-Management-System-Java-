/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import Dao.UserDao;
import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author imalkesara
 */
public class Myattendance {

    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet result;

    public String[] getAttendaceValue01(String userId) {
        String[] value01 = new String[5];
        try {
            ps = con.prepareStatement("Select * from attendance_eligibility where userId = ? AND courceCode='ICT01'");
            ps.setString(1, userId);
            result = ps.executeQuery();
            if (result.next()) {
                value01[0] = result.getString(1);
                value01[1] = result.getString(2);
                value01[2] = result.getString(3);
                value01[3] = result.getString(4);
                value01[4] = result.getString(5);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value01;
    }
    
    public String[] getAttendaceValue02(String userId) {
        String[] value02 = new String[5];
        try {
            ps = con.prepareStatement("Select * from attendance_eligibility where userId = ? AND courceCode='ICT02'"  );
            ps.setString(1, userId);
            result = ps.executeQuery();
            if (result.next()) {
                value02[0] = result.getString(1);
                value02[1] = result.getString(2);
                value02[2] = result.getString(3);
                value02[3] = result.getString(4);
                value02[4] = result.getString(5);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value02;
    }
    
    
    public String[] getAttendaceValue03(String userId) {
        String[] value03 = new String[5];
        try {
            ps = con.prepareStatement("Select * from attendance_eligibility where userId = ? AND courceCode='ICT03'");
            ps.setString(1, userId);
            result = ps.executeQuery();
            if (result.next()) {
                value03[0] = result.getString(1);
                value03[1] = result.getString(2);
                value03[2] = result.getString(3);
                value03[3] = result.getString(4);
                value03[4] = result.getString(5);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value03;
    }
    
    public String[] getAttendaceValue04(String userId) {
        String[] value04 = new String[5];
        try {
            ps = con.prepareStatement("Select * from attendance_eligibility where userId = ? AND courceCode='ICT04'");
            ps.setString(1, userId);
            result = ps.executeQuery();
            if (result.next()) {
                value04[0] = result.getString(1);
                value04[1] = result.getString(2);
                value04[2] = result.getString(3);
                value04[3] = result.getString(4);
                value04[4] = result.getString(5);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value04;
    }
    
     public String[] getAttendaceValue05(String userId) {
        String[] value05 = new String[5];
        try {
            ps = con.prepareStatement("Select * from attendance_eligibility where userId = ? AND courceCode='ICT04'");
            ps.setString(1, userId);
            result = ps.executeQuery();
            if (result.next()) {
                value05[0] = result.getString(1);
                value05[1] = result.getString(2);
                value05[2] = result.getString(3);
                value05[3] = result.getString(4);
                value05[4] = result.getString(5);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value05;
    }
     
     public String[] getAttendaceValue06(String userId) {
        String[] value06 = new String[5];
        try {
            ps = con.prepareStatement("Select * from attendance_eligibility where userId = ? AND courceCode='ICT04'");
            ps.setString(1, userId);
            result = ps.executeQuery();
            if (result.next()) {
                value06[0] = result.getString(1);
                value06[1] = result.getString(2);
                value06[2] = result.getString(3);
                value06[3] = result.getString(4);
                value06[4] = result.getString(5);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value06;
    }
    
    

    public String getUserId(String email) {
        String id = "";
        try {
            ps = con.prepareStatement("SELECT userId from User where email = ?");
            ps.setString(1, email);
            result = ps.executeQuery();
            if (result.next()) {
                id = result.getString(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
