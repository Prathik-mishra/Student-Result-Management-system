/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author prath
 */
public class studentIndex extends javax.swing.JFrame {

    /**
     * Creates new form studentIndex
     */
    public studentIndex() {
        initComponents();
    }
    public studentIndex(String rollno){
        initComponents();
        j4.setText(rollno);
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rollNum = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Physics");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 55, 79, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("EM");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 142, 79, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Maths");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 99, 79, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("DBMS");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 186, 79, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("OS");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 230, 79, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Total Marks");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 21, 80, -1));

        jLabel19.setText("100");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 55, 80, -1));

        jLabel20.setText("100");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 99, 80, -1));

        jLabel21.setText("100");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 142, 80, -1));

        jLabel22.setText("100");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 186, 80, -1));

        jLabel23.setText("100");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 230, 80, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Passing Marks");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 21, 100, -1));

        jLabel25.setText("30");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 55, 75, -1));

        jLabel26.setText("30");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 142, 75, -1));

        jLabel27.setText("30");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 99, 75, -1));

        jLabel28.setText("30");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 186, 75, -1));

        jLabel29.setText("30");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 75, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Marks Obtained");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 21, 92, -1));

        jTextField13.setEditable(false);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 70, -1));

        jTextField14.setEditable(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 70, -1));

        jTextField15.setEditable(false);
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 70, -1));

        jTextField16.setEditable(false);
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 70, -1));

        jTextField17.setEditable(false);
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 70, -1));

        jTextField18.setEditable(false);
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 70, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Total Marks Obtained");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 130, 20));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 178, 700, 320));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Course Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 29, 100, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Branch Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 83, 100, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 137, 100, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Gender");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 137, 100, 25));

        rollNum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollNum.setText("Roll Number");
        getContentPane().add(rollNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 29, 100, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Father Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 83, 100, 25));

        j1.setEditable(false);
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 29, 135, 25));

        j2.setEditable(false);
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 83, 135, 25));

        j3.setEditable(false);
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 137, 135, 25));

        j4.setEditable(false);
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 29, 135, 25));

        jTextField11.setEditable(false);
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 83, 135, 25));

        jTextField12.setEditable(false);
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 137, 135, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentAdmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollno = j4.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srms1","root","prathik@007");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollno = '"+rollno+"' and result.rollno = '"+rollno+"' "); 
            
            if(rs.next()){
                j1.setText(rs.getString(2));
                j2.setText(rs.getString(3));
                j3.setText(rs.getString(4));
                jTextField11.setText(rs.getString(6));
                jTextField12.setText(rs.getString(5));
                jTextField14.setText(rs.getString(8));
                jTextField15.setText(rs.getString(9));
                jTextField16.setText(rs.getString(10));
                jTextField17.setText(rs.getString(11));
                jTextField18.setText(rs.getString(12));
                
                int s1 = Integer.parseInt(rs.getString(8));
                int s2 = Integer.parseInt(rs.getString(9));
                int s3 = Integer.parseInt(rs.getString(10));
                int s4 = Integer.parseInt(rs.getString(11));
                int s5 = Integer.parseInt(rs.getString(12));
                
                String totalMarks = String.valueOf(s1+s2+s3+s4+s5);
                jTextField13.setText(totalMarks);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JLabel rollNum;
    // End of variables declaration//GEN-END:variables
}