package technicalofficer;

import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hispe
 */
public class Attendance extends javax.swing.JFrame {

    Connection con = Myconnection.getConnection();
    PreparedStatement ps;

    public Attendance() {
        initComponents();
        displayAttendanceDetails();

    }

    public void insert(String userID, String courceCode, String sessionDate, String sessionType, String A_status) {
        String sql = "INSERT INTO attendance VALUES(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, userID);
            ps.setString(2, courceCode);
            ps.setString(3, sessionDate);
            ps.setString(4, sessionType);
            ps.setString(5, A_status);

            int rowsAffected = ps.executeUpdate();

            // Check if the query was successful
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "New attendance details added successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add attendance details");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void update(String userID, String courceCode, String sessionDate, String sessionType, String A_status) {
        String sql = "UPDATE attendance SET courceCode=?, sessionDate=?, sessionType=?, A_status=? WHERE userID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, courceCode);
            ps.setString(2, sessionDate);
            ps.setString(3, sessionType);
            ps.setString(4, A_status);
            ps.setString(5, userID);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Attendance details updated successfully");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void displayAttendanceDetails() {
        String sql = "SELECT * FROM attendance";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear the existing table data

            while (rs.next()) {
                Object[] row = {
                    rs.getString("userID"),
                    rs.getString("courceCode"),
                    rs.getString("sessionDate"),
                    rs.getString("sessionType"),
                    rs.getString("A_status")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String userID) {
        String deleteSQL = "DELETE FROM attendance WHERE userID = ?";
        try {
            ps = con.prepareStatement(deleteSQL);
            ps.setString(1, userID);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Attendance record deleted successfully");
            } else {
                JOptionPane.showMessageDialog(null, "No such record found for deletion");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

//    public void searchAttendanceDetails() {
//        // Get the user ID from the text field
//        String userID = jTextField122.getText().trim();
//
//        // Check if the user ID field is empty
//        if (userID.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Please enter a User ID");
//            return;
//        }
//
//        // Create the SQL query to fetch attendance details for the given user ID
//        String sql = "SELECT * FROM attendance WHERE userID = ?";
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, userID);
//            ResultSet rs = ps.executeQuery();
//
//            // Create a DefaultTableModel to hold the fetched data
//            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//            model.setRowCount(0); // Clear the existing table data
//
//            // Populate the table with the fetched attendance details
//            while (rs.next()) {
//                Object[] row = {
//                    rs.getString("userID"),
//                    rs.getString("courceCode"),
//                    rs.getString("sessionDate"),
//                    rs.getString("sessionType"),
//                    rs.getString("A_status")
//                };
//                model.addRow(row);
//            }
//
////            if (rs.next()) {
////
////                jTextFieldUserid.setText(rs.getString("userId"));
////                jTextFieldCoursecode.setText(rs.getString("courceCode"));
////                jDateChooser1.setText(rs.getString("sessionDate"));
////                jTextFieldSessiontype.setText(rs.getString("sessionType"));
////                jTextFieldStatus.setText(rs.getString("A_status"));
////            } else {
////                // Display a message if no records were found
////                JOptionPane.showMessageDialog(this, "No medical record found for the specified Medical ID");
////            }
//            if (model.getRowCount() > 0) {
//                // Display the first record in the text fields
//                jTable1.setRowSelectionInterval(0, 0);
//                jTextFieldUserid.setText((String) jTable1.getValueAt(0, 0));
//                jTextFieldCoursecode.setText((String) jTable1.getValueAt(0, 1));
////                jDateChooser1.setText(rs.getString("sessionDate"));
//                // You may need to convert session date to java.util.Date and set it to jDateChooser1
//                // jDateChooser1.setDate(...);
//
//                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                java.util.Date date = dateFormat.parse((String) jTable1.getValueAt(0, 2));
//
//                // Set the java.util.Date to jDateChooser1
//                jDateChooser1.setDate(date);
//
//                jTextFieldSessiontype.setText((String) jTable1.getValueAt(0, 3));
//                jTextFieldStatus.setText((String) jTable1.getValueAt(0, 4));
//            } else {
//                // Display a message if no records were found
//                JOptionPane.showMessageDialog(this, "No attendance record found for the specified User ID");
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
    
    
    
    public void searchAttendanceDetails() {
    // Get the user ID from the text field
    String userID = jTextField122.getText().trim();

    // Check if the user ID field is empty
    if (userID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a User ID");
        return;
    }

    // Create the SQL query to fetch attendance details for the given user ID
    String sql = "SELECT * FROM attendance WHERE userID = ?";
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, userID);
        ResultSet rs = ps.executeQuery();

        // Create a DefaultTableModel to hold the fetched data
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the existing table data

        // Populate the table with the fetched attendance details
        while (rs.next()) {
            Object[] row = {
                rs.getString("userID"),
                rs.getString("courceCode"),
                rs.getString("sessionDate"),
                rs.getString("sessionType"),
                rs.getString("A_status")
            };
            model.addRow(row);
        }

        if (model.getRowCount() > 0) {
            // Display the first record in the text fields
            jTable1.setRowSelectionInterval(0, 0);
            jTextFieldUserid.setText((String) jTable1.getValueAt(0, 0));
            jTextFieldCoursecode.setText((String) jTable1.getValueAt(0, 1));

            // Convert session date to java.util.Date and set it to jDateChooser1
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = dateFormat.parse((String) jTable1.getValueAt(0, 2));
            jDateChooser1.setDate(date);

            jTextFieldSessiontype.setText((String) jTable1.getValueAt(0, 3));
            jTextFieldStatus.setText((String) jTable1.getValueAt(0, 4));
        } else {
            // Display a message if no records were found
            JOptionPane.showMessageDialog(this, "No attendance record found for the specified User ID");
        }

    } catch (SQLException | ParseException ex) {
        ex.printStackTrace();
    }
}

    
    

    private void populateTable(DefaultTableModel model) {
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jTextField122 = new javax.swing.JTextField();
        jButtonRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUserid = new javax.swing.JTextField();
        jTextFieldCoursecode = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextFieldSessiontype = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(96, 165, 250));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search User ID");

        jButtonSearch.setBackground(new java.awt.Color(4, 8, 15));
        jButtonSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextField122.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField122.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField122.setCaretColor(new java.awt.Color(255, 255, 255));

        jButtonRefresh.setBackground(new java.awt.Color(4, 8, 15));
        jButtonRefresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "Course Code", "Session Date", "Session Type", "A_status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonAdd.setBackground(new java.awt.Color(4, 8, 15));
        jButtonAdd.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Add");
        jButtonAdd.setPreferredSize(new java.awt.Dimension(106, 28));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(4, 8, 15));
        jButtonUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(4, 8, 15));
        jButtonDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(4, 8, 15));
        jButtonClear.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jTextFieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStatusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Session Date");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Session Type");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("A_status");

        jTextFieldCoursecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoursecodeActionPerformed(evt);
            }
        });

        jDateChooser1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDateChooser1.setDateFormatString("yyyy-mm-dd");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Course Code");

        jButton5.setBackground(new java.awt.Color(4, 8, 15));
        jButton5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.setBorderPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldUserid))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCoursecode)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField122)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSessiontype, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldCoursecode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldSessiontype, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jTextFieldCoursecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoursecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCoursecodeActionPerformed


    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        String userID = jTextFieldUserid.getText();
        String courceCode = jTextFieldCoursecode.getText();
        String sessionDate = null;
        if (jDateChooser1.getDate() != null) {
            // Convert the selected date to string in the desired format
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            sessionDate = dateFormat.format(jDateChooser1.getDate());
        } else {
            JOptionPane.showMessageDialog(this, "Session Date is missing");
            return; // Exit the method if session date is not selected
        }
        String sessionType = jTextFieldSessiontype.getText();
        String aStatus = jTextFieldStatus.getText();

        // Call the insert method to add the attendance record to the database
        insert(userID, courceCode, sessionDate, sessionType, aStatus);


    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        searchAttendanceDetails();

//    
//    String userID = jTextFieldUserid.getText();
//    DefaultTableModel model = getAttendanceDetails(userID);
//    populateTable(model);

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTextFieldStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStatusActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String userID = jTextFieldUserid.getText();
        String courceCode = jTextFieldCoursecode.getText();
        String sessionDate = null;
        if (jDateChooser1.getDate() != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            sessionDate = dateFormat.format(jDateChooser1.getDate());
        } else {
            JOptionPane.showMessageDialog(this, "Session Date is missing");
            return;
        }
        String sessionType = jTextFieldSessiontype.getText();
        String aStatus = jTextFieldStatus.getText();

        // Call the update method to update the attendance record
        update(userID, courceCode, sessionDate, sessionType, aStatus);

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String userID = jTextFieldUserid.getText();
        // Call the delete method to delete the attendance record
        delete(userID);

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:

        displayAttendanceDetails();


    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:

        jTextFieldUserid.setText("");
        jTextFieldCoursecode.setText("");
//    jDateChooser1.setStr(null);
        jTextFieldSessiontype.setText("");
        jTextFieldStatus.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Attendance().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextFieldCoursecode;
    private javax.swing.JTextField jTextFieldSessiontype;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldUserid;
    // End of variables declaration//GEN-END:variables

}
