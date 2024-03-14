/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmgmt.gui;

import atmmgmt.pojo.User;
import atmmgmt.pojo.UserProfile;
import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author LENOVO
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    
    public HomeFrame() {
        super("ATM MANAGMENT");
        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("D:\\Java NetBeans\\AtmProject\\src\\atmmgmt\\images\\atm-machine.png");
        setIconImage(img);
        lblName.setText("Welcome "+UserProfile.getUserName());
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
        lblName = new javax.swing.JLabel();
        btnBalanceCheck = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnPinChange = new javax.swing.JButton();
        btnFastWithdraw = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnMiniStatement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        lblName.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        lblName.setText("WellCome Shubham");

        btnBalanceCheck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBalanceCheck.setText("Balance Check");
        btnBalanceCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceCheckActionPerformed(evt);
            }
        });

        btnDeposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnPinChange.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPinChange.setText("Pin Change");
        btnPinChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinChangeActionPerformed(evt);
            }
        });

        btnFastWithdraw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFastWithdraw.setText("Fast Withdraw");
        btnFastWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFastWithdrawActionPerformed(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnMiniStatement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMiniStatement.setText("Mini Statement");
        btnMiniStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniStatementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBalanceCheck)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFastWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMiniStatement)))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblName)
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBalanceCheck)
                    .addComponent(btnFastWithdraw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw)
                    .addComponent(btnDeposit))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnPinChange))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnMiniStatement)))
                .addGap(95, 95, 95))
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

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        // TODO add your handling code here:
        WithdrawFrame fr=new WithdrawFrame();
        fr.setVisible(true);
        this.dispose();
        User u=new User();
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnFastWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFastWithdrawActionPerformed
        // TODO add your handling code here:
        FastWithdrawFrame fr=new FastWithdrawFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFastWithdrawActionPerformed

    private void btnBalanceCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceCheckActionPerformed
        // TODO add your handling code here:
        BalanceCheckFrame fr=new BalanceCheckFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBalanceCheckActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        DepositFrame fr=new DepositFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnPinChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinChangeActionPerformed
        // TODO add your handling code here:
        ChangePinFrame fr=new ChangePinFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPinChangeActionPerformed

    private void btnMiniStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiniStatementActionPerformed
        // TODO add your handling code here:
        MiniStatementFrame fr=new MiniStatementFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMiniStatementActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalanceCheck;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnFastWithdraw;
    private javax.swing.JButton btnMiniStatement;
    private javax.swing.JButton btnPinChange;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
