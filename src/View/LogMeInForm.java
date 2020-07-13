//Gerhard Kloppers
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Klopp
 */
public class LogMeInForm extends javax.swing.JFrame {

    /**
     * Creates new form LogMeInForm
     */
    public LogMeInForm() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameLogInText = new javax.swing.JTextField();
        PasswordLogInText = new javax.swing.JPasswordField();
        LogInCancelButton = new javax.swing.JButton();
        LogInConfrimButton = new javax.swing.JButton();
        CreateAccLabelClickable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 86, 239));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel2.setText("LogMeIn:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 230, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(null);

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PasswordLabel.setText("Password:");
        jPanel2.add(PasswordLabel);
        PasswordLabel.setBounds(80, 150, 140, 29);

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UsernameLabel.setText("Username:");
        jPanel2.add(UsernameLabel);
        UsernameLabel.setBounds(70, 80, 140, 29);

        UsernameLogInText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameLogInTextActionPerformed(evt);
            }
        });
        jPanel2.add(UsernameLogInText);
        UsernameLogInText.setBounds(220, 80, 310, 30);
        jPanel2.add(PasswordLogInText);
        PasswordLogInText.setBounds(220, 150, 310, 30);

        LogInCancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogInCancelButton.setText("Cancel");
        LogInCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInCancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LogInCancelButton);
        LogInCancelButton.setBounds(220, 220, 100, 40);

        LogInConfrimButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogInConfrimButton.setText("Log in");
        LogInConfrimButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInConfrimButtonMouseClicked(evt);
            }
        });
        jPanel2.add(LogInConfrimButton);
        LogInConfrimButton.setBounds(430, 220, 100, 40);

        CreateAccLabelClickable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CreateAccLabelClickable.setText("I don't have an account?");
        CreateAccLabelClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAccLabelClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAccLabelClickableMouseClicked(evt);
            }
        });
        jPanel2.add(CreateAccLabelClickable);
        CreateAccLabelClickable.setBounds(280, 290, 180, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void UsernameLogInTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameLogInTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameLogInTextActionPerformed

    private void LogInCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInCancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_LogInCancelButtonActionPerformed

    private void LogInConfrimButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInConfrimButtonMouseClicked
        File file = new File("LoginDetails.txt");
        boolean UsernameFound = false;
        boolean PasswordFound = false;
        String username = this.UsernameLogInText.getText();
        String password = new String(this.PasswordLogInText.getPassword());
        String tempUsername;
        String tempPassword;
        String Line;
        if (this.UsernameLogInText.getText().isEmpty() == true || this.PasswordLogInText.getPassword().length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please fill in you Username/Password in the fields!");
            this.UsernameLogInText.setText("");
            this.PasswordLogInText.setText("");
            return;
        }
        try {
            Scanner scFile = new Scanner(file);
            while (scFile.hasNext()) {
                Line = scFile.nextLine();
                Scanner inLine = new Scanner(Line).useDelimiter("#");
                tempUsername = inLine.next();
                tempPassword = inLine.next();
            
                if (username.compareTo(tempUsername) == 0) {
                    UsernameFound = true;
                }
                if (password.compareTo(tempPassword) == 0) {
                    PasswordFound = true;
                }
            }
            if (!UsernameFound) {
                JOptionPane.showMessageDialog(rootPane, "Username is invalid!");
                this.UsernameLogInText.setText("");
                return;
            } 
            if (!PasswordFound) {
                JOptionPane.showMessageDialog(rootPane, "Password is invalid!");
                this.PasswordLogInText.setText("");
                return;
            }
            if (UsernameFound && PasswordFound) {
                JOptionPane.showMessageDialog(rootPane, "You have succesfully logged in!");
                MainScreen Screen = new MainScreen();
                Screen.setVisible(true);
                Screen.setLocationRelativeTo(null);
                this.dispose();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!" + e);
        }


    }//GEN-LAST:event_LogInConfrimButtonMouseClicked

    private void CreateAccLabelClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccLabelClickableMouseClicked
        CreateAccountLogMeIn Acc = new CreateAccountLogMeIn();
        Acc.setVisible(true);
        Acc.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_CreateAccLabelClickableMouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(LogMeInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogMeInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogMeInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogMeInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogMeInForm MyLogMeInForm = new LogMeInForm();
                MyLogMeInForm.setVisible(true);
                MyLogMeInForm.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateAccLabelClickable;
    private javax.swing.JButton LogInCancelButton;
    private javax.swing.JButton LogInConfrimButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordLogInText;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameLogInText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
