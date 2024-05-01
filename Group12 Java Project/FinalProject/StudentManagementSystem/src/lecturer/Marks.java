package lecturer;

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

public class Marks {

    Connection con = Myconnection.getConnection();
    PreparedStatement ps;

    public void insert(String Quiz1, String Quiz2, String Quiz3, String midPratical, String midTheory, String endPratical, String endTheory, String assement, String StudentID, String courseCode) {
        String sql = "INSERT INTO StudentMarks VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Quiz1);
            ps.setString(2, Quiz2);
            ps.setString(3, Quiz3);
            ps.setString(4, midPratical);
            ps.setString(5, midTheory);
            ps.setString(6, endPratical);
            ps.setString(7, endTheory);
            ps.setString(8, assement);
            ps.setString(9, StudentID);
            ps.setString(10, courseCode);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New Marks added susscefully");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //get all data course table 
    public void getCourseValues(JTable table, String searchValue) {
//        String sql = "SELECT * FROM course WHERE CONCAT(courceCode,cName,credit,weeek,theory,practical,userId)like ? ORDER BY desc";
        String sql = "SELECT * FROM StudentMarks WHERE CONCAT(q1, q2, q3, midP, midT, endP, endT, assesment, userId, courceCode) LIKE ? ORDER BY courceCode DESC";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet result = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (result.next()) {
                row = new Object[10];
                row[0] = result.getString(1);
                row[1] = result.getString(2);
                row[2] = result.getString(3);
                row[3] = result.getString(4);
                row[4] = result.getString(5);
                row[5] = result.getString(6);
                row[6] = result.getString(7);
                row[7] = result.getString(8);
                row[8] = result.getString(9);
                row[9] = result.getString(10);

                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
