package BarterZone.Dashboard.trader;

public class trader_dashboard extends javax.swing.JFrame {

    public trader_dashboard() {
        initComponents();
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tradermenu = new javax.swing.JPanel();
        profile = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        Otheritems = new javax.swing.JButton();
        trades = new javax.swing.JButton();
        messages = new javax.swing.JButton();
        reports = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        myitems = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        tradermenu.setBackground(new java.awt.Color(0, 0, 0));
        tradermenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setText("Profile");
        profile.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        tradermenu.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 30));

        dashboard.setText("Dashboard");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        tradermenu.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        Otheritems.setText("Find Items");
        Otheritems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtheritemsActionPerformed(evt);
            }
        });
        tradermenu.add(Otheritems, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 30));

        trades.setText("Trades");
        trades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tradesActionPerformed(evt);
            }
        });
        tradermenu.add(trades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 30));

        messages.setText("Messages");
        messages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesActionPerformed(evt);
            }
        });
        tradermenu.add(messages, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, 30));

        reports.setText("Reports");
        reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsActionPerformed(evt);
            }
        });
        tradermenu.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 30));

        jLabel2.setBackground(new java.awt.Color(12, 192, 223));
        jLabel2.setForeground(new java.awt.Color(240, 128, 22));
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 192, 223), 2));
        tradermenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 120, 140));

        myitems.setText("My items");
        myitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myitemsActionPerformed(evt);
            }
        });
        tradermenu.add(myitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trader Menu");
        tradermenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        header.setBackground(new java.awt.Color(12, 192, 223));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setText("jLabel3");
        header.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tradermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(418, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tradermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_profileActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_dashboardActionPerformed

    private void OtheritemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtheritemsActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_OtheritemsActionPerformed

    private void tradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tradesActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_tradesActionPerformed

    private void messagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_messagesActionPerformed

    private void reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_reportsActionPerformed

    private void myitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myitemsActionPerformed
        myitemsframe myItemsFrame = new myitemsframe();
        myItemsFrame.setVisible(true);
        myItemsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_myitemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Otheritems;
    private javax.swing.JButton dashboard;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton messages;
    private javax.swing.JButton myitems;
    private javax.swing.JButton profile;
    private javax.swing.JButton reports;
    private javax.swing.JPanel tradermenu;
    private javax.swing.JButton trades;
    // End of variables declaration//GEN-END:variables
}
