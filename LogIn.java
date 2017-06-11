package Secure;
import LabAssistant.LabAssitence_Welcome;
import Admin.Admin_Welcome;
import Reception.Reception_Welcome;
import Doctor.Doctor_Welcome;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class LogIn extends javax.swing.JFrame {
    private Object Connect;
    private String type = "";
    
    public LogIn(String s) {
        initComponents();
        setLocationRelativeTo(null);
        type = s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblUsername = new javax.swing.JLabel();
        jlblPassword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnBack = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnLogin = new javax.swing.JButton();
        jtxtUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LogIn");
        setLocation(new java.awt.Point(250, 250));
        setMinimumSize(new java.awt.Dimension(675, 400));
        getContentPane().setLayout(null);

        jlblUsername.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlblUsername.setForeground(new java.awt.Color(0, 102, 255));
        jlblUsername.setText("User Name :");
        getContentPane().add(jlblUsername);
        jlblUsername.setBounds(147, 118, 134, 29);

        jlblPassword.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlblPassword.setForeground(new java.awt.Color(0, 102, 255));
        jlblPassword.setText(" Password :");
        getContentPane().add(jlblPassword);
        jlblPassword.setBounds(147, 192, 126, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("LogIn");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(41, 32, 60, 22);

        jbtnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnBack.setForeground(new java.awt.Color(0, 102, 255));
        jbtnBack.setText("Back");
        jbtnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBack);
        jbtnBack.setBounds(70, 290, 116, 45);

        jbtnReset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 102, 255));
        jbtnReset.setText("Reset");
        jbtnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset);
        jbtnReset.setBounds(290, 290, 104, 45);

        jbtnLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnLogin.setForeground(new java.awt.Color(0, 102, 255));
        jbtnLogin.setText("LogIn");
        jbtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLogin);
        jbtnLogin.setBounds(510, 290, 106, 45);

        jtxtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtUsername.setMinimumSize(new java.awt.Dimension(400, 600));
        getContentPane().add(jtxtUsername);
        jtxtUsername.setBounds(315, 118, 201, 29);

        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPassword);
        jPassword.setBounds(315, 196, 201, 29);

        jUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Login1.jpg"))); // NOI18N
        getContentPane().add(jUsername);
        jUsername.setBounds(0, 0, 660, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
      
      
      String pw=jPassword.getText();            
      
      
       if(jtxtUsername.getText().equals(""))            //Validation If username field is empty print a error message.
      {
            JOptionPane.showMessageDialog(this,"Error! Empty username field","Unuccess!",JOptionPane.INFORMATION_MESSAGE);
            return;
            
      }
       if(jPassword.getText().equals(""))               //Validation If password field is empty print a error message.
      {
            JOptionPane.showMessageDialog(this,"Error! Empty Password field","Unuccess!",JOptionPane.INFORMATION_MESSAGE);
            return;
            
      }
       
        try{
            
           Statement stat= DBConnect.getStatemennt();       //Build the coonection with database
           ResultSet rs = stat.executeQuery("select user_name,user_passwd,user_type from users where user_name='" +jtxtUsername.getText() + "'" );
          // if(!rs.next()){
            //        JOptionPane.showMessageDialog(this,"Error! Wrong Username field","Unuccess!",JOptionPane.INFORMATION_MESSAGE);
              //      return;
                  
          // }
         
           
           
           //boolean condition=false;
           int m=0;
           while(rs.next())
            {
               String getUsername=rs.getString(1);
               String getPass=rs.getString(2);
               String getType=rs.getString(3);
               System.out.println(getUsername);
               System.out.println(getPass);
               System.out.println(getType);
               String user_name = jtxtUsername.getText();
               
              
            
                if(user_name.equals(getUsername))
                    
                {
                    System.out.println(m);
                    m++;
                    String password = String.valueOf(jPassword.getPassword());
                    if((password.equals(getPass))){
                        JOptionPane.showMessageDialog(this,"Login Successful!","Success!",JOptionPane.INFORMATION_MESSAGE);
                        if (type.equals(getType)){                  //Check the typr and load the homepages for each one.
                            if(type.equals("Admin"))
                        {
                             Admin_Welcome aw = new  Admin_Welcome();
                             aw.setVisible(true);
                             this.setVisible(false);
                             //condition=true;

                        }
                        if(type.equals("Doctor"))
                        {
                             Doctor_Welcome dw = new  Doctor_Welcome();
                             dw.setVisible(true);
                             this.setVisible(false);
                            // condition=true;

                        }
                        if(type.equals("Reception"))
                        {
                             Reception_Welcome rw = new  Reception_Welcome();
                             rw.setVisible(true);
                             this.setVisible(false);
                             //condition=true;

                        }
                        if(type.equals("Lab Assistant"))
                        {
                             LabAssitence_Welcome lw = new  LabAssitence_Welcome();
                             lw.setVisible(true);
                             this.setVisible(false);
                             //condition=true;

                        }
                    }
                        
                        
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(this,"Login UnSuccessful.The pasword is wrong !!","UnSuccess!",JOptionPane.INFORMATION_MESSAGE);
                    //condition=true;
                    }
                }
                
            
            }
           
            
           
        }
        catch (Exception ex) {
           ex.printStackTrace();
            
        }
        
        
           
        
        
        
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jPassword.setText(null);        //Reset the values to null
        jtxtUsername.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
         Welcome w = new Welcome();
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JLabel jUsername;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblUsername;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables
}