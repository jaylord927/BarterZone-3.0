package BarterZone.Dashboard.admin;

public class admin_dashboard extends javax.swing.JFrame {
 
    public admin_dashboard() {
        initComponents();
    }
void 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tradermenu = new javax.swing.JPanel();
        manageuser = new javax.swing.JButton();
        Otheritems = new javax.swing.JButton();
        trades = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        myitems = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_trader = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tradermenu.setBackground(new java.awt.Color(0, 0, 0));
        tradermenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageuser.setText("Manage Traders");
        manageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageuserActionPerformed(evt);
            }
        });
        tradermenu.add(manageuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 50));

        Otheritems.setText("Manage Reports");
        Otheritems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtheritemsActionPerformed(evt);
            }
        });
        tradermenu.add(Otheritems, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 50));

        trades.setText("Manage Annnouncements");
        trades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tradesActionPerformed(evt);
            }
        });
        tradermenu.add(trades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 50));

        jLabel2.setBackground(new java.awt.Color(12, 192, 223));
        jLabel2.setForeground(new java.awt.Color(240, 128, 22));
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 192, 223), 2));
        tradermenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 70));

        myitems.setText("Manage Admins");
        myitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myitemsActionPerformed(evt);
            }
        });
        tradermenu.add(myitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Menu");
        tradermenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        tbl_trader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_trader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_traderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_trader);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tradermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tradermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageuserActionPerformed

        
        
    }//GEN-LAST:event_manageuserActionPerformed

    private void OtheritemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtheritemsActionPerformed

 


    }//GEN-LAST:event_OtheritemsActionPerformed

    private void tradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tradesActionPerformed

        
        
    }//GEN-LAST:event_tradesActionPerformed

    private void myitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myitemsActionPerformed
//        myitemsframe myItemsFrame = new myitemsframe();
//        myItemsFrame.setVisible(true);
//        myItemsFrame.setLocationRelativeTo(null);
//        this.dispose();
    }//GEN-LAST:event_myitemsActionPerformed

    private void tbl_traderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_traderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_traderMouseClicked

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Otheritems;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageuser;
    private javax.swing.JButton myitems;
    private javax.swing.JTable tbl_trader;
    private javax.swing.JPanel tradermenu;
    private javax.swing.JButton trades;
    // End of variables declaration//GEN-END:variables
}
