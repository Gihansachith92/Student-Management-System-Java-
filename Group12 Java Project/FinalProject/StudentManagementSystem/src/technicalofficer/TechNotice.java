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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imalkesara
 */
public class TechNotice {
    
    Connection con = Myconnection.getConnection();
    PreparedStatement ps;
    
    public void getTableValue(JTable table, String searchValue){
       String sql = "select * from Notice";
       
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
            Logger.getLogger(TechNotice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
