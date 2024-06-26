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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import student.Login;

/**
 *
 * @author imalkesara
 */
public class UploadMarksExams extends javax.swing.JFrame {

    /**
     * Creates new form UploadMarksExams
     */
    Marks marks = new Marks();
    private DefaultTableModel model;

    public UploadMarksExams() {
        initComponents();
        init();
    }

    public void init() {
         setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
        tableviewMarks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MarksTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EndPratical = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EndTheory = new javax.swing.JTextField();
        quiz1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        assement = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        coursecode = new javax.swing.JTextField();
        quiz2 = new javax.swing.JTextField();
        quiz3 = new javax.swing.JTextField();
        MidPratical = new javax.swing.JTextField();
        MidTheory = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(96, 165, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MarksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quiz 1", "Quiz 2", "Quiz 3", "Mid Pratical", "Mid Theory", "End Pratical", "End Theory", "Assement", "Student ID", "Course Code"
            }
        ));
        MarksTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(MarksTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 690, 520));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Course Code / Student ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        jPanel1.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 370, 40));

        jButton2.setBackground(new java.awt.Color(4, 8, 15));
        jButton2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 110, 40));

        jButton3.setBackground(new java.awt.Color(4, 8, 15));
        jButton3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Upload");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 110, 40));

        jButton4.setBackground(new java.awt.Color(4, 8, 15));
        jButton4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 110, 40));

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quiz 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 40));
        jPanel1.add(EndPratical, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 250, 40));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quiz 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 40));

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quiz 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 40));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mid Pratical");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 90, 40));

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mid Theroy");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 40));

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("End Pratical");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, 40));

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("End Theory");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, 40));

        EndTheory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTheoryActionPerformed(evt);
            }
        });
        EndTheory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EndTheoryKeyTyped(evt);
            }
        });
        jPanel1.add(EndTheory, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 250, 40));

        quiz1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quiz1KeyTyped(evt);
            }
        });
        jPanel1.add(quiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, 40));

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Assement");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 90, 40));

        assement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                assementKeyTyped(evt);
            }
        });
        jPanel1.add(assement, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 250, 40));

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 40));
        jPanel1.add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 250, 40));

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Course Code");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 90, 40));
        jPanel1.add(coursecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 250, 40));

        quiz2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quiz2KeyTyped(evt);
            }
        });
        jPanel1.add(quiz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 250, 40));

        quiz3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quiz3KeyTyped(evt);
            }
        });
        jPanel1.add(quiz3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 250, 40));

        MidPratical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MidPraticalKeyTyped(evt);
            }
        });
        jPanel1.add(MidPratical, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 250, 40));

        MidTheory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MidTheoryKeyTyped(evt);
            }
        });
        jPanel1.add(MidTheory, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 250, 40));

        jButton6.setBackground(new java.awt.Color(4, 8, 15));
        jButton6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Search");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 110, 40));

        jButton5.setBackground(new java.awt.Color(4, 8, 15));
        jButton5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(searchBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a corsecode");
        }else{
            MarksTable.setModel(new DefaultTableModel(null, new Object[]{"quiz1", "quiz2", "quiz3", "MidPratical", "MidTheory", "EndPratical", "EndTheory","assement","studentid","coursecode"}));
            marks.getCourseValues(MarksTable, "");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (isEmptyMarks()) {
            String quiz1Text = quiz1.getText();
            int Quize1 = Integer.parseInt(quiz1Text);

            String quiz2Text = quiz2.getText();
            int Quize2 = Integer.parseInt(quiz2Text);

            String quiz3Text = quiz3.getText();
            int Quize3 = Integer.parseInt(quiz3Text);

            String midPratical = MidPratical.getText();
            int MidPratical = Integer.parseInt(midPratical);

            String midTheory = MidTheory.getText();
            int MidTheory = Integer.parseInt(midTheory);

            String endPratical = EndPratical.getText();
            int EndPratical = Integer.parseInt(endPratical);

            String endTheory = EndTheory.getText();
            int EndTheory = Integer.parseInt(endTheory);

            String Assement = assement.getText();
            int assement = Integer.parseInt(Assement);

            String Studentid = studentid.getText();
            String CourseCode = coursecode.getText();

            marks.insert(quiz1Text, quiz2Text, quiz3Text, midPratical, midTheory, endPratical, endTheory, Assement, Studentid, CourseCode);
            clearMarks();

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearMarks();
    }//GEN-LAST:event_jButton4ActionPerformed

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

    private void restrictToDigits(java.awt.event.KeyEvent evt, JTextField textField) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    private void quiz1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quiz1KeyTyped
        restrictToDigits(evt, quiz1);
    }//GEN-LAST:event_quiz1KeyTyped

    private void quiz2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quiz2KeyTyped
        restrictToDigits(evt, quiz2);
    }//GEN-LAST:event_quiz2KeyTyped

    private void quiz3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quiz3KeyTyped
        restrictToDigits(evt, quiz3);
    }//GEN-LAST:event_quiz3KeyTyped

    private void MidPraticalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MidPraticalKeyTyped
        restrictToDigits(evt, MidPratical);
    }//GEN-LAST:event_MidPraticalKeyTyped

    private void MidTheoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MidTheoryKeyTyped
        restrictToDigits(evt, EndPratical);
    }//GEN-LAST:event_MidTheoryKeyTyped

    private void EndTheoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTheoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndTheoryActionPerformed

    private void EndTheoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EndTheoryKeyTyped
        restrictToDigits(evt, EndTheory);
    }//GEN-LAST:event_EndTheoryKeyTyped

    private void assementKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_assementKeyTyped
        restrictToDigits(evt, assement);
    }//GEN-LAST:event_assementKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(searchBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a corsecode");
        }else{
            MarksTable.setModel(new DefaultTableModel(null, new Object[]{"quiz1", "quiz2", "quiz3", "MidPratical", "MidTheory", "EndPratical", "EndTheory","assement","studentid","coursecode"}));
            marks.getCourseValues(MarksTable, searchBox.getText());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableviewMarks() {
        marks.getCourseValues(MarksTable, "");
        model = (DefaultTableModel) MarksTable.getModel();
        MarksTable.setRowHeight(30);
        MarksTable.setShowGrid(true);
        MarksTable.setGridColor(Color.black);
        MarksTable.setBackground(Color.white);
    }

    private void clearMarks() {
        quiz1.setText(null);
        quiz2.setText(null);
        quiz3.setText(null);
        MidPratical.setText(null);
        MidTheory.setText(null);
        EndPratical.setText(null);
        EndTheory.setText(null);
        assement.setText(null);
        studentid.setText(null);
        coursecode.setText(null);
        MarksTable.clearSelection();
    }

    public boolean isEmptyMarks() {
        if (quiz1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quiz one is missing");
            return false;
        }
        if (quiz2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quiz two is missing");
            return false;
        }
        if (quiz3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quiz three is missing");
            return false;
        }
        if (MidPratical.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mid Pratical is missing");
            return false;
        }
        if (MidTheory.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mid Theory is missing");
            return false;
        }
        if (EndPratical.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "End Pratical is missing");
            return false;
        }
        if (EndTheory.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "End Theory is missing");
            return false;
        }
        if (assement.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Assement is missing");
            return false;
        }
        if (studentid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student ID is missing");
            return false;
        }
        if (coursecode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Course code ID is missing");
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(UploadMarksExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadMarksExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadMarksExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadMarksExams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadMarksExams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EndPratical;
    private javax.swing.JTextField EndTheory;
    private javax.swing.JTable MarksTable;
    private javax.swing.JTextField MidPratical;
    private javax.swing.JTextField MidTheory;
    private javax.swing.JTextField assement;
    private javax.swing.JTextField coursecode;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField quiz1;
    private javax.swing.JTextField quiz2;
    private javax.swing.JTextField quiz3;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTextField studentid;
    // End of variables declaration//GEN-END:variables
}
