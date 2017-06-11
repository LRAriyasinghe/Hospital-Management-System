/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

package Secure;
import Secure.LogIn;
import java.awt.Frame;
import javax.swing.JFrame;
/**
 *
 * @author User
 */
public class Welcome extends javax.swing.JFrame {
//Welcome Page
    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        setLocationRelativeTo(null);
        //setExtendedState(JFrame.MAXIMIZED_HORIZ);
        //setResizable(false);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbtnDoctor = new javax.swing.JButton();
        jbtnAdmin = new javax.swing.JButton();
        jbtnReception = new javax.swing.JButton();
        jbtnLabAssistant = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setMinimumSize(new java.awt.Dimension(1130, 815));
        setSize(new java.awt.Dimension(1000, 2000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(0, 153, 255));
        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 48)); // NOI18N
        jTextField1.setText("Lanka Hospitals");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 90));

        jTextField3.setBackground(new java.awt.Color(0, 153, 255));
        jTextField3.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jTextField3.setText("No.578\nElvitigala Mawatha\nColombo 00500");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1120, 30));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnDoctor.setBackground(new java.awt.Color(0, 0, 255));
        jbtnDoctor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDoctor.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/doc.png"))); // NOI18N
        jbtnDoctor.setText("Doctor");
        jbtnDoctor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDoctorActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, -1));

        jbtnAdmin.setBackground(new java.awt.Color(0, 0, 255));
        jbtnAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/admin.png"))); // NOI18N
        jbtnAdmin.setText("Admin");
        jbtnAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdminActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, -1));

        jbtnReception.setBackground(new java.awt.Color(0, 0, 255));
        jbtnReception.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReception.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReception.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/re2.png"))); // NOI18N
        jbtnReception.setText("Reception");
        jbtnReception.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnReception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReceptionActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnReception, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 240, -1));

        jbtnLabAssistant.setBackground(new java.awt.Color(0, 0, 255));
        jbtnLabAssistant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnLabAssistant.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLabAssistant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lab.png"))); // NOI18N
        jbtnLabAssistant.setText("Lab Assistant");
        jbtnLabAssistant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLabAssistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLabAssistantActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnLabAssistant, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 240, -1));

        jTextField2.setBackground(new java.awt.Color(0, 0, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("User Account Panel");
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Lala.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 820, 650));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1500, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdminActionPerformed
        String str;                     //Pass a variable with the value 'Admin, and load the Login Page
        str = "Admin";
        LogIn s = new LogIn(str);
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnAdminActionPerformed

    private void jbtnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDoctorActionPerformed
        String str;                  //Pass a variable with the value 'Doctor, and load the Login Page
        str = "Doctor";
        
        LogIn s = new LogIn(str);
        s.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnDoctorActionPerformed

    private void jbtnReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReceptionActionPerformed
        String str;                  //Pass a variable with the value 'Reception, and load the Login Page
        str = "Reception";
        LogIn s = new LogIn(str);
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnReceptionActionPerformed

    private void jbtnLabAssistantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLabAssistantActionPerformed
        String str;                  //Pass a variable with the value 'Lab Assistant, and load the Login Page
        str = "Lab Assistant"; 
        
        LogIn s = new LogIn(str);
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnLabAssistantActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH );
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbtnAdmin;
    private javax.swing.JButton jbtnDoctor;
    private javax.swing.JButton jbtnLabAssistant;
    private javax.swing.JButton jbtnReception;
    // End of variables declaration//GEN-END:variables
}
