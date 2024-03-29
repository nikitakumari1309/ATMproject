/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmgmt.gui;

import atmmgmt.DAO.UserDAO;
import atmmgmt.pojo.UserProfile;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        super("ATM MANAGMENT");
        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("D:\\Java NetBeans\\AtmProject\\src\\atmmgmt\\images\\atm-machine.png");
        setIconImage(img);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAccNo = new javax.swing.JTextField();
        txtPin = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnforgetPin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("          Log  In");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Accound No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Pin");

        txtAccNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        txtPin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        btnLogIn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnforgetPin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnforgetPin.setText("Forget Pin");
        btnforgetPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforgetPinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnforgetPin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAccNo)
                                .addComponent(txtPin, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogIn)
                    .addComponent(btnRegister)
                    .addComponent(btnforgetPin))
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        RegisterFrame fr= new RegisterFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnforgetPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforgetPinActionPerformed
        // TODO add your handling code here:
        ForgetPinFrame fr=new ForgetPinFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnforgetPinActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
        String accNo=txtAccNo.getText();
        char [] pwd=txtPin.getPassword();
        String pin=new String(pwd);
        if(validateInput(accNo,pin)==false){
            JOptionPane.showMessageDialog(null, "Please fill Accno and Pin","Incomplete data",JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        
        try
        {
            long accno=Long.parseLong(accNo);
            int Pin=Integer.parseInt(pin);
            boolean ans=UserDAO.LogIn(accno, Pin);
            if(ans==false)
            {
                JOptionPane.showMessageDialog(null, "Invalid AccNo and Pin","wrong input",JOptionPane.ERROR_MESSAGE);
                return;
            }
            HomeFrame fr=new HomeFrame();
            fr.setVisible(true);
            this.dispose();
        }
        catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please Fill numeric data", "Error", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "DataBase Error", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btnLogInActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnforgetPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JPasswordField txtPin;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput(String accNo,String pin) {
      if(accNo.isEmpty()==true || pin.isEmpty()==true)
          return false;
      return true;
    }
}
