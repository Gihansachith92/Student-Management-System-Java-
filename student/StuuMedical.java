/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lecturer.Course;

/**
 *
 * @author imalkesara
 */
public class StuuMedical {
    
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
    
     public List<String[]> getMedicalValue(String userId) {
        List<String[]> medicalValuesList = new ArrayList<>();
        String sql = "SELECT medicalID, courceCode, description FROM medical WHERE userId = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, userId);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String[] values = new String[3]; // Assuming 3 columns: course code, course name, and grade
                values[0] = result.getString("medicalID");
                values[1] = result.getString("courceCode");
                values[2] = result.getString("description");
                medicalValuesList.add(values);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }

        return medicalValuesList;

    }
    
}
