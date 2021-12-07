/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyFinanceManagerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Request.Medicine;
import Business.Request.MoneyOrder;
import Business.Request.MoneyOrderDirectory;
import Business.Request.Order;
import Business.Request.PurchaseRequest;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacyManagerRole.AddMedicinesJPanel;
import UserInterface.PharmacyManagerRole.RequestModifyListJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZHOU
 */
public class PharmacyFinanceManagerWorkAreaJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private MoneyOrderDirectory moneyOrderDirectory;
    private List<Order> temp;
            
    public PharmacyFinanceManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = business;
        this.moneyOrderDirectory = enterprise.getMoneyOrderDirectory();
        this.temp = new ArrayList<Order>();
        valueLabel.setText(enterprise.getName());
        float sum=0;
        for(MoneyOrder m:moneyOrderDirectory.getMoneyOrderList()){
            if(m.getMoneyOrderStatus().equals("Approved")){
                sum+=m.getMoney();
            }
        }
        txtBalance.setText(String.valueOf(enterprise.getBalance()+sum));
        System.out.println(enterprise.getMoneyOrderDirectory());
        System.out.println(enterprise.getMoneyOrderDirectory().getMoneyOrderList());
        populatePurchaseTable();
        populateMoneyOrderJTable();
    }
    

    void populateMoneyOrderJTable(){
        DefaultTableModel model = (DefaultTableModel) moneyOrderJTable.getModel();
        model.setRowCount(0);
        for (MoneyOrder m : enterprise.getMoneyOrderDirectory().getMoneyOrderList()){
            
                Object[] row = new Object[4];
                row[0] = m;
                row[1] = m.getMoney();
                row[2] = m.getName();
                row[3] = m.getMoneyOrderStatus();
                model.addRow(row);
            
            
        }
    }

    void populatePurchaseTable(){
        DefaultTableModel model = (DefaultTableModel) purchaseJTable.getModel();
        model.setRowCount(0);
        for (PurchaseRequest p : enterprise.getPurchaseRequestDirectory().getPurchaseRequestList()){
            if(p.getMedicineRequest().equals("Approved By Manager")){
                Object[] row = new Object[4];
                row[0] = p.getMedicineName();
                row[1] = p.gettRate();
                row[2] = p;
                row[3] = p.getMedicineRequest();
                model.addRow(row);
            }
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApprove = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        moneyOrderJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        btnRequestMoney = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchaseJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        btnApprove.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 153, 153));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnDecline.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnDecline.setForeground(new java.awt.Color(0, 153, 153));
        btnDecline.setText("Decline");

        valueLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        moneyOrderJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        moneyOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Money Request", "Restaurant", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(moneyOrderJTable);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Balance:");
        jLabel1.setOpaque(true);

        txtBalance.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtBalance.setEnabled(false);
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        btnRequestMoney.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRequestMoney.setForeground(new java.awt.Color(0, 153, 153));
        btnRequestMoney.setText("Request Money");
        btnRequestMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMoneyActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Purchase Requst:");
        jLabel2.setOpaque(true);

        jButton4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("Delete Request");

        purchaseJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        purchaseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Rate", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(purchaseJTable);

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Money Request:");
        jLabel3.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRequestMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDecline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel)
                    .addComponent(valueLabel))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApprove)
                        .addGap(18, 18, 18)
                        .addComponent(btnDecline)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRequestMoney)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedrow = purchaseJTable.getSelectedRow();

        if(selectedrow >=0)
        {
            PurchaseRequest  vs = (PurchaseRequest)purchaseJTable.getValueAt(selectedrow,2);
            vs.setMedicineRequest("Approved By Financial");

            enterprise.setBalance(enterprise.getBalance()- vs.gettRate());
            txtBalance.setText(String.valueOf(enterprise.getBalance()));

            JOptionPane.showMessageDialog(null, "This request has been approved!!");
            populatePurchaseTable();
        }
        else
        JOptionPane.showMessageDialog(null,"Please select an request!! ");

    }//GEN-LAST:event_btnApproveActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBalanceActionPerformed

    private void btnRequestMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMoneyActionPerformed
        // TODO add your handling code here:
        RequestFinancialPartnerMoneyJPanel rp = new RequestFinancialPartnerMoneyJPanel(userProcessContainer,enterprise,system);
        userProcessContainer.add("RequestRMoneyJPanel", rp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestMoneyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnRequestMoney;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable moneyOrderJTable;
    private javax.swing.JTable purchaseJTable;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
