/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lecturer;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import student.Login;

/**
 *
 * @author imalkesara
 */
public class AddCourseMaterials extends javax.swing.JFrame {

    Course course = new Course();
    private int rowIndex;
    int xx, xy;
    private DefaultTableModel model;

    public AddCourseMaterials() {
        initComponents();
        init();
    }

    public void init() {
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
        tableviewLecturer();
    }

    private void tableviewLecturer() {
        
//        Color c1 = new Color(43,45,36,255);
        course.getCourseValues(jTable1, "");
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.gray);
        jTable1.setBackground(Color.white);
    }

    private void clearCourseMaterials() {

        jTextField3.setText(null);
        jTextField2.setText(null);
        jComboBox5.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField8.setText(null);
        jTable1.clearSelection();

    }

    public boolean isEmptyCourse() {
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Course Code is missing");
            return false;
        }
        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Course Name is missing");
            return false;
        }
//        if(jTextField4.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this,"Course Credit is missing");
//            return false;
//        }
//        if(jTextField5.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this,"Course week is missing");
//            return false;
//        }
//        if(jTextField6.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this,"Course Theory is missing");
//            return false;
//        }
//        if(jTextField7.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this,"Course pratical is missing");
//            return false;
//        }
        if (jTextField8.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lecturer ID is missing");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(96, 165, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "courceCode", "Course Name", "credit", "weeek", "theory", "Pratical", "lecturerId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 700, 500));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Course :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, 50));

        jButton2.setBackground(new java.awt.Color(4, 8, 15));
        jButton2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 140, 50));

        jButton3.setBackground(new java.awt.Color(4, 8, 15));
        jButton3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 120, 50));

        jButton4.setBackground(new java.awt.Color(4, 8, 15));
        jButton4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 120, 50));

        jLabel3.setText("CourseCode");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 40));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, 40));

        jLabel4.setText("CourseName");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 40));

        jLabel5.setText("Creadit");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 40));

        jLabel6.setText("Week");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 40));

        jLabel7.setText("Theroy");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, 40));

        jLabel8.setText("Pratical");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, 40));

        jLabel9.setText("LecturerID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 90, 40));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 250, 40));

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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 150, 50));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 250, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 250, 40));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 250, 40));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 250, 40));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, 40));

        jButton6.setBackground(new java.awt.Color(4, 8, 15));
        jButton6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 100, 50));

        jButton7.setBackground(new java.awt.Color(4, 8, 15));
        jButton7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearCourseMaterials();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (isEmptyCourse()) {
            if (!course.isCourseCodeExist(jTextField3.getText())) {
                String courseCode = jTextField3.getText();
                String courseName = jTextField2.getText();
                String credit = jComboBox5.getSelectedItem().toString();
                String week = jComboBox4.getSelectedItem().toString();
                String theroy = jComboBox3.getSelectedItem().toString();
                String pratical = jComboBox2.getSelectedItem().toString();
                String lecId = jTextField8.getText();
                course.insert(courseCode, courseName, credit, week, theroy, pratical, lecId);
                jTable1.setModel(new DefaultTableModel(null, new Object[]{"courceCode", "Course Name", "credit", "week", "theory", "Pratical", "lecturerId"}));
                course.getCourseValues(jTable1, "");
                clearCourseMaterials();
            } else {
                JOptionPane.showMessageDialog(this, "Course Code already exist !!!");
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a corsecode");
        } else {
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"courceCode", "Course Name", "credit", "week", "theory", "Pratical", "lecturerId"}));
            course.getCourseValues(jTable1, jTextField1.getText());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField3.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField2.setText(model.getValueAt(rowIndex, 1).toString());
        String Credit = model.getValueAt(rowIndex, 2).toString();
        if (Credit.equals("1")) {
            jComboBox5.setSelectedIndex(0);
        } else if (Credit.equals("2")) {
            jComboBox5.setSelectedIndex(1);
        } else {
            jComboBox5.setSelectedIndex(2);
        }

        String week = model.getValueAt(rowIndex, 3).toString();
        if (week.equals("1")) {
            jComboBox4.setSelectedIndex(0);
        } else if (week.equals("2")) {
            jComboBox4.setSelectedIndex(1);
        } else if (week.equals("3")) {
            jComboBox4.setSelectedIndex(2);
        } else if (week.equals("4")) {
            jComboBox4.setSelectedIndex(3);
        } else if (week.equals("5")) {
            jComboBox4.setSelectedIndex(4);
        } else if (week.equals("6")) {
            jComboBox4.setSelectedIndex(5);
        } else if (week.equals("7")) {
            jComboBox4.setSelectedIndex(6);
        } else if (week.equals("8")) {
            jComboBox4.setSelectedIndex(7);
        } else if (week.equals("9")) {
            jComboBox4.setSelectedIndex(8);
        } else if (week.equals("10")) {
            jComboBox4.setSelectedIndex(9);
        } else if (week.equals("11")) {
            jComboBox4.setSelectedIndex(10);
        } else if (week.equals("12")) {
            jComboBox4.setSelectedIndex(11);
        } else if (week.equals("13")) {
            jComboBox4.setSelectedIndex(12);
        } else if (week.equals("14")) {
            jComboBox4.setSelectedIndex(13);
        } else {
            jComboBox4.setSelectedIndex(14);
        }

        String Theroy = model.getValueAt(rowIndex, 4).toString();
        if (Theroy.equals("1")) {
            jComboBox3.setSelectedIndex(0);
        } else {
            jComboBox3.setSelectedIndex(1);
        }

        String Pratical = model.getValueAt(rowIndex, 5).toString();
        if (Pratical.equals("1")) {
            jComboBox2.setSelectedIndex(0);
        } else {
            jComboBox2.setSelectedIndex(1);
        }
        jTextField8.setText(model.getValueAt(rowIndex, 6).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a corsecode");
        } else {
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"courceCode", "Course Name", "credit", "week", "theory", "Pratical", "lecturerId"}));
            course.getCourseValues(jTable1, "");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        if (isEmptyCourse()) {
//            if (!course.isCourseCodeExist(jTextField3.getText())) {
//                String courseCode = jTextField3.getText();
//                String courseName = jTextField2.getText();
//                String credit = jComboBox5.getSelectedItem().toString();
//                String week = jComboBox4.getSelectedItem().toString();
//                String theroy = jComboBox3.getSelectedItem().toString();
//                String pratical = jComboBox2.getSelectedItem().toString();
//                String lecId = jTextField8.getText();
//                course.update(courseCode, courseName, credit, week, theroy, pratical, lecId);
//                jTable1.setModel(new DefaultTableModel(null, new Object[]{"courceCode", "cName", "credit", "weeek", "theory", "practical", "userId"}));
//                course.getCourseValues(jTable1, "");
//                clearCourseMaterials();
//            } else {
//                JOptionPane.showMessageDialog(this, "Course Code already exist !!!");
//            }
//
//        }

        if (isEmptyCourse()) {
            String courseCode = jTextField3.getText();
            String courseName = jTextField2.getText();
            String credit = jComboBox5.getSelectedItem().toString();
            String week = jComboBox4.getSelectedItem().toString();
            String theroy = jComboBox3.getSelectedItem().toString();
            String pratical = jComboBox2.getSelectedItem().toString();
            String lecId = jTextField8.getText();
            course.update(courseCode, courseName, credit, week, theroy, pratical, lecId);
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"courceCode", "cName", "credit", "weeek", "theory", "practical", "userId"}));
            course.getCourseValues(jTable1, "");
            clearCourseMaterials();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(AddCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourseMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
