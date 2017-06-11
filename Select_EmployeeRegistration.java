/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Doctor.Doctor_Registration;
import Secure.Nurse_Registration;
import Secure.Other_Register;

/**
 *
 * @author User
 */
public class Select_EmployeeRegistration extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Welcome
     */
    public Select_EmployeeRegistration() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AdminReg = new javax.swing.JButton();
        DoctorReg = new javax.swing.JButton();
        ReceptionReg = new javax.swing.JButton();
        ManagmentReg = new javax.swing.JButton();
        NurseReg = new javax.swing.JButton();
        LabAssReg = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Employee");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("New Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 220, 20));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(102, 153, 255));

        AdminReg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AdminReg.setForeground(new java.awt.Color(0, 102, 255));
        AdminReg.setText("Administrator");
        AdminReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRegActionPerformed(evt);
            }
        });

        DoctorReg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DoctorReg.setForeground(new java.awt.Color(0, 102, 255));
        DoctorReg.setText("Doctor");
        DoctorReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorRegActionPerformed(evt);
            }
        });

        ReceptionReg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ReceptionReg.setForeground(new java.awt.Color(0, 102, 255));
        ReceptionReg.setText("Reception");
        ReceptionReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceptionRegActionPerformed(evt);
            }
        });

        ManagmentReg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ManagmentReg.setForeground(new java.awt.Color(0, 102, 255));
        ManagmentReg.setText("Management staff");
        ManagmentReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagmentRegActionPerformed(evt);
            }
        });

        NurseReg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NurseReg.setForeground(new java.awt.Color(0, 102, 255));
        NurseReg.setText("Nurse");
        NurseReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NurseRegActionPerformed(evt);
            }
        });

        LabAssReg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabAssReg.setForeground(new java.awt.Color(0, 102, 255));
        LabAssReg.setText("Lab Assistant");
        LabAssReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabAssRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManagmentReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(ReceptionReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabAssReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NurseReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DoctorReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AdminReg)
                .addGap(28, 28, 28)
                .addComponent(DoctorReg)
                .addGap(27, 27, 27)
                .addComponent(NurseReg)
                .addGap(18, 18, 18)
                .addComponent(LabAssReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(ReceptionReg)
                .addGap(18, 18, 18)
                .addComponent(ManagmentReg)
                .addGap(71, 71, 71))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, -1));

        Back.setBackground(new java.awt.Color(51, 102, 255));
        Back.setText("Back");
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/newemp.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceptionRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceptionRegActionPerformed
        Other_Register Otherregistration = new Other_Register();        //Load Other registration form.
        Otherregistration.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_ReceptionRegActionPerformed

    private void AdminRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRegActionPerformed
        Other_Register Otherregistration = new Other_Register();    //Load Other registration form.
        Otherregistration.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_AdminRegActionPerformed

    private void NurseRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NurseRegActionPerformed
        Nurse_Registration nurse_registration = new Nurse_Registration();   //Load Nurse registration form.
        nurse_registration.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NurseRegActionPerformed

    private void ManagmentRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagmentRegActionPerformed
        Other_Register Otherregistration = new Other_Register();            //Load Other registration form.
        Otherregistration.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_ManagmentRegActionPerformed

    private void DoctorRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorRegActionPerformed
        Doctor_Registration doctor_registration = new Doctor_Registration();        //Load Docotr registration form.
        doctor_registration.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_DoctorRegActionPerformed

    private void LabAssRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabAssRegActionPerformed
       Other_Register Otherregistration = new Other_Register();                     //Load Other registration form.
        Otherregistration.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_LabAssRegActionPerformed

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
            java.util.logging.Logger.getLogger(Select_EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select_EmployeeRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminReg;
    private javax.swing.JButton Back;
    private javax.swing.JButton DoctorReg;
    private javax.swing.JButton LabAssReg;
    private javax.swing.JButton ManagmentReg;
    private javax.swing.JButton NurseReg;
    private javax.swing.JButton ReceptionReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}