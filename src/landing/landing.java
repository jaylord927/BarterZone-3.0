package landing;

import loginandsignup.Login;
import loginandsignup.SignUp;

public class landing extends javax.swing.JFrame {

    public landing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Searchbutton = new javax.swing.JTextField();
        igive = new javax.swing.JButton();
        iwant = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        login = new javax.swing.JButton();
        landing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Searchbutton.setBackground(new java.awt.Color(22, 114, 127));
        Searchbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Searchbutton.setForeground(new java.awt.Color(51, 255, 51));
        Searchbutton.setText("Search button");
        Searchbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 260, 60));

        igive.setBackground(new java.awt.Color(255, 255, 255));
        igive.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        igive.setForeground(new java.awt.Color(32, 118, 3));
        igive.setText("I give");
        igive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igiveActionPerformed(evt);
            }
        });
        getContentPane().add(igive, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, 40));

        iwant.setBackground(new java.awt.Color(255, 255, 255));
        iwant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iwant.setForeground(new java.awt.Color(240, 128, 22));
        iwant.setText("I want");
        iwant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iwantActionPerformed(evt);
            }
        });
        getContentPane().add(iwant, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 80, 40));

        signup.setBackground(new java.awt.Color(0, 102, 102));
        signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(51, 255, 51));
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 90, 40));

        login.setBackground(new java.awt.Color(0, 102, 102));
        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(51, 255, 51));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 90, 40));

        landing.setBackground(new java.awt.Color(22, 114, 127));
        landing.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        landing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarterZone/resources/images/landing.png"))); // NOI18N
        getContentPane().add(landing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbuttonActionPerformed


        
        
    }//GEN-LAST:event_SearchbuttonActionPerformed

    private void igiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igiveActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_igiveActionPerformed

    private void iwantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iwantActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_iwantActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        SignUp signupFrame = new SignUp();
        signupFrame.setVisible(true);
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        this.dispose();


    }//GEN-LAST:event_signupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Searchbutton;
    private javax.swing.JButton igive;
    private javax.swing.JButton iwant;
    private javax.swing.JLabel landing;
    private javax.swing.JButton login;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
