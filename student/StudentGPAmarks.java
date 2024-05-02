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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lecturer.Course;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author imalkesara
 */
public class StudentGPAmarks {

    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet result;

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
            Logger.getLogger(StudentGPAmarks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public List<String[]> getUserGPAValue(String userId) {
        List<String[]> gpaValuesList = new ArrayList<>();
        String sql = "SELECT userId, courceCode, Grade FROM StudentGradePoint WHERE userId = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, userId);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String[] values = new String[3]; // Assuming 3 columns: course code, course name, and grade
                values[0] = result.getString("userId");
                values[1] = result.getString("courceCode");
                values[2] = result.getString("Grade");
                gpaValuesList.add(values);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }

        return gpaValuesList;

    }
    
    public String[] getUserValue(String userId) {
        String[] value = new String[2];
        try {
            ps = con.prepareStatement("Select * from StudentSGPA where userId = ?");
            ps.setString(1, userId);
            result = ps.executeQuery();
            if(result.next()) {
                value[0] = result.getString(1);
                value[1] = result.getString(2);
            }

        } catch (SQLException ex) {
             Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    
}
