/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminWorkSpace;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Donor;
import Business.Person.Recipient;
import Business.Person.Visitor;
import Business.Person.VisitorDirectory;
import Business.RegularExpressionCheck;
import java.awt.CardLayout;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import userInterface.OrganMatchWorkArea.ManageOrganMatchJPanel;

/**
 *
 * @author negis
 */
public class OTAWorkArea extends javax.swing.JPanel {

    JPanel rightPanel;
    EcoSystem system;
    public OTAWorkArea(JPanel rightPanel, EcoSystem eco) {
        initComponents();
        this.rightPanel=rightPanel;
        this.system=eco;
        populateTree();
    }
    public void populateTree(){
        
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0; k < organizationList.size(); k++){
                    organization = organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel4 = new javax.swing.JPanel();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        btnManageNetwork = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblSelectedNode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jSplitPane2.setDividerLocation(200);

        jTree.setBackground(new java.awt.Color(0, 204, 204));
        jTree.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Ecosystem");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("colors");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("sports");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ravioli");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("bananas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        btnManageEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageAdmin.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        btnManageNetwork.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jButton1.setText("Manage Donors & Recipients");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblSelectedNode.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        lblSelectedNode.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel1.setText("Selected Node:");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jButton2.setText("Analysis");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnManageNetwork)
                            .addComponent(btnManageAdmin)
                            .addComponent(btnManageEnterprise)
                            .addComponent(jButton2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(lblSelectedNode)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectedNode)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addComponent(btnManageNetwork)
                .addGap(97, 97, 97)
                .addComponent(btnManageEnterprise)
                .addGap(98, 98, 98)
                .addComponent(btnManageAdmin)
                .addGap(103, 103, 103)
                .addComponent(jButton1)
                .addGap(105, 105, 105)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(jPanel4);

        add(jSplitPane2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageCitiesJPanel manageCitiesJPanel = new ManageCitiesJPanel(rightPanel, system);
        rightPanel.add("manageCitiesJPanel", manageCitiesJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        if(system.getNetworkList().size() == 0){
            JOptionPane.showMessageDialog(null, "There are no networks. Create Network first.");
            return;
        }
        ManageEnterpriseJPanel manageEnterprise = new ManageEnterpriseJPanel(rightPanel, system);
        rightPanel.add("manageEnterprise", manageEnterprise);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        
        int size = system.getNetworkList().size();
        boolean flag = false;
        
        if(size == 0){
            JOptionPane.showMessageDialog(null, "There are no networks. Create Network first.");
            return;
        } else if ( size > 0){
            for(int i = 0; i < size; i++){
                if(system.getNetworkList().get(i).getEnterpriseDirectory().getEnterpriseList().size() > 0)
                    flag = true;
            }
        }
        if(flag){
            ManageEnterpriseAdminJPanel manageEnterpriseAdmin = new ManageEnterpriseAdminJPanel(rightPanel, system);
            rightPanel.add("manageEnterpriseAdmin", manageEnterpriseAdmin);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }else {
            JOptionPane.showMessageDialog(null, "There is no enterprise. Create enterprise first.");
        }
        
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ManageOrganMatchJPanel organMatch = new ManageOrganMatchJPanel(rightPanel, system);
        rightPanel.add("organMatch", organMatch);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int count = 0;
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization or : enterprise.getOrganizationDirectory().getOrganizationList()) 
                    if (or.getName().equalsIgnoreCase("Visitor Organization")) {
                        for (Donor donor : or.getDonorDirectory().getDonorList()) {
                            
                            count++;
                        }
                    }
                    }
        }
        int count1=0;
        if(system != null){
            VisitorDirectory vd =new VisitorDirectory();
            for(Visitor v: vd.getVisitorList()){
                count1++;
            }
        }
            
        
        Frame frame = new Frame();

        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        pieDataSet.setValue("Donor-Ready to donate", count);
        pieDataSet.setValue("Donor-Not ready to donate", RegularExpressionCheck.c);
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataSet, true, true, true);

        ChartPanel cpp = new ChartPanel(chart);
        frame.add(cpp);

        frame.pack();
        frame.setVisible(true);
        cpp.setSize(600, 600);
        cpp.setVisible(true);
                    
                
                    
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables

}