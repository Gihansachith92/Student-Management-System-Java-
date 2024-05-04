/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package technicalofficer;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hispe
 */
public class Medical extends javax.swing.JFrame {
    
    Connection con = Myconnection.getConnection();
    PreparedStatement ps;

    /**
     * Creates new form Medical
     */
    public Medical() {
        initComponents();
        displayMedicalDetails();
    }
    
    public void insert(String medicalID, String courceCode, String userId, String description) {
        String sql = "INSERT INTO medical VALUES(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, medicalID);
            ps.setString(2, courceCode);
            ps.setString(3, userId);
            ps.setString(4, description);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "New medical record added successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add medical record");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    public void displayMedicalDetails() {
        String sql = "SELECT * FROM medical";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] row = {
                    rs.getString("medicalID"),
                    rs.getString("courceCode"),
                    rs.getString("userId"),
                    rs.getString("description")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
//    public void searchMedicalDetails(String medicalID) {
//        if (medicalID.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Please enter a Medical ID");
//            return;
//        }
//        
//        String sql = "SELECT * FROM medical WHERE medicalID = ?";
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, medicalID);
//            ResultSet rs = ps.executeQuery();
//            
//            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//            model.setRowCount(0);
//            
//            while (rs.next()) {
//                Object[] row = {
//                    rs.getString("medicalID"),
//                    rs.getString("courceCode"),
//                    rs.getString("userId"),
//                    rs.getString("description")
//                };
//                model.addRow(row);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
    
    public void searchMedicalDetails(String medicalID) {
        if (medicalID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Medical ID");
            return;
        }

       
        String sql = "SELECT * FROM medical WHERE medicalID = ?";
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, medicalID);
        ResultSet rs = ps.executeQuery();
        
        // Check if any records were found
        if (rs.next()) {
            // Populate the text fields with the fetched data
            jTextField2MEDICALID.setText(rs.getString("medicalID"));
            jTextField3COURSECODE.setText(rs.getString("courceCode"));
            jTextField4USERID.setText(rs.getString("userId"));
            jTextArea1.setText(rs.getString("description"));
        } else {
            // Display a message if no records were found
            JOptionPane.showMessageDialog(this, "No medical record found for the specified Medical ID");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
        
    }
    
    
    
    
    
    
    public void update(String medicalID, String courceCode, String userId, String description) {
        String sql = "UPDATE medical SET courceCode=?, userId=?, description=? WHERE medicalID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, courceCode);
            ps.setString(2, userId);
            ps.setString(3, description);
            ps.setString(4, medicalID);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Medical record updated successfully");
                displayMedicalDetails(); // Refresh the table after updating
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update medical record");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    public void delete(String medicalID) {
        String sql = "DELETE FROM medical WHERE medicalID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, medicalID);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Medical record deleted successfully");
                displayMedicalDetails(); // Refresh the table after deleting
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete medical record");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    public void clearFields() {
        jTextField2MEDICALID.setText("");
        jTextField3COURSECODE.setText("");
        jTextField4USERID.setText("");
        jTextArea1.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1SEARCH = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1ADD = new javax.swing.JButton();
        jButton2UPDATE = new javax.swing.JButton();
        jButton3DELETE = new javax.swing.JButton();
        jButton4CLEAR = new javax.swing.JButton();
        jTextField2MEDICALID = new javax.swing.JTextField();
        jTextField3COURSECODE = new javax.swing.JTextField();
        jTextField4USERID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(96, 165, 250));

        jButtonBack1.setBackground(new java.awt.Color(4, 8, 15));
        jButtonBack1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonBack1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack1.setText("Back");
        jButtonBack1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBack1MouseClicked(evt);
            }
        });
        jButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Medical ID");

        jTextField1SEARCH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1SEARCH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(96, 165, 250));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medical ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course Code");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User ID");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description");

        jButton1ADD.setBackground(new java.awt.Color(4, 8, 15));
        jButton1ADD.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1ADD.setForeground(new java.awt.Color(255, 255, 255));
        jButton1ADD.setText("Add");
        jButton1ADD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ADDActionPerformed(evt);
            }
        });

        jButton2UPDATE.setBackground(new java.awt.Color(4, 8, 15));
        jButton2UPDATE.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2UPDATE.setForeground(new java.awt.Color(255, 255, 255));
        jButton2UPDATE.setText("Update");
        jButton2UPDATE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2UPDATEActionPerformed(evt);
            }
        });

        jButton3DELETE.setBackground(new java.awt.Color(4, 8, 15));
        jButton3DELETE.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3DELETE.setForeground(new java.awt.Color(255, 255, 255));
        jButton3DELETE.setText("Delete");
        jButton3DELETE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3DELETEActionPerformed(evt);
            }
        });

        jButton4CLEAR.setBackground(new java.awt.Color(4, 8, 15));
        jButton4CLEAR.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton4CLEAR.setForeground(new java.awt.Color(255, 255, 255));
        jButton4CLEAR.setText("Clear");
        jButton4CLEAR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4CLEARActionPerformed(evt);
            }
        });

        jTextField2MEDICALID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2MEDICALIDActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4USERID)
                            .addComponent(jTextField3COURSECODE)
                            .addComponent(jTextField2MEDICALID)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2MEDICALID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3COURSECODE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4USERID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medical ID", "Course Code", "User ID", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonSearch.setBackground(new java.awt.Color(4, 8, 15));
        jButtonSearch.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setText("Search");
        jButtonSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonRefresh.setBackground(new java.awt.Color(4, 8, 15));
        jButtonRefresh.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefresh.setText("Refresh");
        jButtonRefresh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack1ActionPerformed

    }//GEN-LAST:event_jButtonBack1ActionPerformed

    private void jTextField2MEDICALIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2MEDICALIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MEDICALIDActionPerformed

    private void jButton2UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2UPDATEActionPerformed
        // TODO add your handling code here:
        String medicalID = jTextField2MEDICALID.getText().trim();
        String courceCode = jTextField3COURSECODE.getText().trim();
        String userId = jTextField4USERID.getText().trim();
        String description = jTextArea1.getText().trim();
        
        if (medicalID.isEmpty() || courceCode.isEmpty() || userId.isEmpty() || description.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields");
        } else {
            update(medicalID, courceCode, userId, description);
        }

    }//GEN-LAST:event_jButton2UPDATEActionPerformed

    private void jButton4CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4CLEARActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_jButton4CLEARActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        String medicalID = jTextField1SEARCH.getText();
        searchMedicalDetails(medicalID);

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        displayMedicalDetails();
        
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButton1ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ADDActionPerformed
        // TODO add your handling code here:
        
        String medicalID = jTextField2MEDICALID.getText().trim();
        String courceCode = jTextField3COURSECODE.getText().trim();
        String userId = jTextField4USERID.getText().trim();
        String description = jTextArea1.getText().trim();
        if (medicalID.isEmpty() || courceCode.isEmpty() || userId.isEmpty() || description.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields");
        } else {
            insert(medicalID, courceCode, userId, description);
        }
        
      
        
    }//GEN-LAST:event_jButton1ADDActionPerformed

    private void jButton3DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3DELETEActionPerformed
        // TODO add your handling code here:
        String medicalID = jTextField1SEARCH.getText().trim();
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this medical record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            if (option == JOptionPane.YES_OPTION) {
                delete(medicalID);
            }
            
        }
        

    }//GEN-LAST:event_jButton3DELETEActionPerformed

    private void jButtonBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBack1MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jButtonBack1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Medical().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ADD;
    private javax.swing.JButton jButton2UPDATE;
    private javax.swing.JButton jButton3DELETE;
    private javax.swing.JButton jButton4CLEAR;
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1SEARCH;
    private javax.swing.JTextField jTextField2MEDICALID;
    private javax.swing.JTextField jTextField3COURSECODE;
    private javax.swing.JTextField jTextField4USERID;
    // End of variables declaration//GEN-END:variables
}
