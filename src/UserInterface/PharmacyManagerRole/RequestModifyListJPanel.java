/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Request.Medicine;
import Business.Request.ModifyMedicinesRequest;
import Business.Request.ModifyMedicinesRequestDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ZHOU
 */
public class RequestModifyListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestModifyListJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ModifyMedicinesRequestDirectory modifyDishesRequestDirectory;
    private EcoSystem business;
    private Medicine dish;
    
    public RequestModifyListJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Medicine dish,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.modifyDishesRequestDirectory = enterprise.getModifyDishesRequestDirectory();
        this.business = business;
        this.dish = dish;
        valueLabel.setText(enterprise.getName());
        txtName.setText(dish.getMedicineName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnComfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valueLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 6, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 84, 30));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item Name:");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 114, -1));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Price:");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 114, -1));

        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 118, -1));

        txtPrice.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 118, -1));

        btnComfirm.setBackground(new java.awt.Color(0, 153, 153));
        btnComfirm.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnComfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnComfirm.setText("Comfirm");
        btnComfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComfirmActionPerformed(evt);
            }
        });
        add(btnComfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 121, -1));

        btnCancel.setBackground(new java.awt.Color(0, 153, 153));
        btnCancel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Back");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 101, -1));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Cancel");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 121, -1));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGER");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnComfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComfirmActionPerformed
        // TODO add your handling code here:
      
         if(txtName.getText().equals("")|| txtPrice.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "one or more fields are empty.");
                 return;
            }
         try {
            Integer.parseInt(txtPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Price should be an Integer number!");
            return;
        }
            
                ModifyMedicinesRequest modifyDishesRequest = modifyDishesRequestDirectory.createModifyDishesRequest(dish);
                modifyDishesRequest.setoPrice(dish.getPrice());
                modifyDishesRequest.setFp(Float.parseFloat(txtPrice.getText()));
                modifyDishesRequest.setModifyStatus("Processing");
    		DB4OUtil.getInstance().storeSystem(business);
                JOptionPane.showMessageDialog(null, "Request has been submitted Successfully");
    }//GEN-LAST:event_btnComfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component [] comps = userProcessContainer.getComponents();
        for(Component c : comps){
            if(c instanceof ManagerWorkAreaJPanel){
                ManagerWorkAreaJPanel panel = (ManagerWorkAreaJPanel) c;
                panel.populatemodifyMenuJTable();
            }
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnComfirm;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
