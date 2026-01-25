package BarterZone.Dashboard.trader;

public class myitemsframe extends javax.swing.JFrame {

    public myitemsframe() {
        initComponents();
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
        myitems1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        myitems = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchfield = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myitemstable = new javax.swing.JTable();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        myitems1.setText("My items");
        myitems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myitems1ActionPerformed(evt);
            }
        });
        tradermenu.add(myitems1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trader Menu");
        tradermenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        myitems.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("My Trading Items ");
        myitems.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        myitems.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 230, 50));

        searchbutton.setBackground(new java.awt.Color(12, 192, 223));
        searchbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchbutton.setForeground(new java.awt.Color(255, 255, 255));
        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        myitems.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 100, 50));

        jLabel4.setText("Search:");
        myitems.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 50, 30));

        myitemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item name", "Brand", "Condition", "Date bought", "Description", "Status", "Picture Items"
            }
        ));
        myitemstable.setEditingColumn(1);
        myitemstable.setEditingRow(1);
        myitemstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myitemstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myitemstable);

        myitems.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 640, 250));

        header.setBackground(new java.awt.Color(12, 192, 223));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setText("jLabel3");
        header.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tradermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myitems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(myitems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tradermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void myitems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myitems1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myitems1ActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void myitemstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myitemstableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myitemstableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Otheritems;
    private javax.swing.JButton dashboard;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton messages;
    private javax.swing.JPanel myitems;
    private javax.swing.JButton myitems1;
    private javax.swing.JTable myitemstable;
    private javax.swing.JButton profile;
    private javax.swing.JButton reports;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchfield;
    private javax.swing.JPanel tradermenu;
    private javax.swing.JButton trades;
    // End of variables declaration//GEN-END:variables
}
