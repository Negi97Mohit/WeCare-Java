/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author negis
 */
public class information_sys extends javax.swing.JPanel {

    /**
     * Creates new form dep_input
     */
    public information_sys() {
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

        info_main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stud_name = new javax.swing.JTextField();
        stud_id = new javax.swing.JTextField();
        stud_grad = new javax.swing.JTextField();
        stud_posi = new javax.swing.JTextField();
        stud_sala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();

        info_main.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Information Systems Student");

        stud_name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        stud_name.setText("Student Name");
        stud_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stud_name.setOpaque(false);
        stud_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stud_nameMouseClicked(evt);
            }
        });
        stud_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud_nameActionPerformed(evt);
            }
        });

        stud_id.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        stud_id.setText("Student ID");
        stud_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stud_id.setOpaque(false);
        stud_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stud_idMouseClicked(evt);
            }
        });
        stud_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud_idActionPerformed(evt);
            }
        });

        stud_grad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        stud_grad.setText("Year of Graduation");
        stud_grad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stud_grad.setOpaque(false);
        stud_grad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stud_gradMouseClicked(evt);
            }
        });
        stud_grad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud_gradActionPerformed(evt);
            }
        });

        stud_posi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        stud_posi.setText("Current Position");
        stud_posi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stud_posi.setOpaque(false);
        stud_posi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stud_posiMouseClicked(evt);
            }
        });
        stud_posi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud_posiActionPerformed(evt);
            }
        });

        stud_sala.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        stud_sala.setText("Salary Hike");
        stud_sala.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stud_sala.setOpaque(false);
        stud_sala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stud_salaMouseClicked(evt);
            }
        });
        stud_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud_salaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Select Job Relevant Course:");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("ENCP 6000");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("INFO 6105");

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("INFO 6150");

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("INFO 5100");

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("INFO 6969");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("INFO 6210");

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("INFO 3200");

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("INFO 5454");

        javax.swing.GroupLayout info_mainLayout = new javax.swing.GroupLayout(info_main);
        info_main.setLayout(info_mainLayout);
        info_mainLayout.setHorizontalGroup(
            info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_mainLayout.createSequentialGroup()
                .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_mainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(info_mainLayout.createSequentialGroup()
                        .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(info_mainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, info_mainLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(stud_id)
                                    .addComponent(stud_posi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(stud_sala)
                                    .addComponent(stud_grad, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                        .addGap(144, 144, 144)
                        .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(info_mainLayout.createSequentialGroup()
                                    .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox6)
                                        .addComponent(jCheckBox5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBox7)
                                        .addComponent(jCheckBox8)))
                                .addGroup(info_mainLayout.createSequentialGroup()
                                    .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBox1)
                                        .addComponent(jCheckBox4))
                                    .addGap(102, 102, 102)
                                    .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox3)
                                        .addComponent(jCheckBox2)))))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        info_mainLayout.setVerticalGroup(
            info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stud_id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stud_grad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stud_posi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stud_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(info_mainLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))
                        .addGap(18, 18, 18)
                        .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7))
                        .addGap(18, 18, 18)
                        .addGroup(info_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox8))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(info_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(info_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stud_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stud_nameActionPerformed

    private void stud_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stud_nameMouseClicked
        // TODO add your handling code here:
        stud_name.setText(" ");
    }//GEN-LAST:event_stud_nameMouseClicked

    private void stud_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stud_idMouseClicked
        // TODO add your handling code here:
        stud_id.setText(" ");
    }//GEN-LAST:event_stud_idMouseClicked

    private void stud_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stud_idActionPerformed

    private void stud_gradMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stud_gradMouseClicked
        // TODO add your handling code here:
        stud_grad.setText(" ");
    }//GEN-LAST:event_stud_gradMouseClicked

    private void stud_gradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud_gradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stud_gradActionPerformed

    private void stud_posiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stud_posiMouseClicked
        // TODO add your handling code here:
        stud_posi.setText(" ");
    }//GEN-LAST:event_stud_posiMouseClicked

    private void stud_posiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud_posiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stud_posiActionPerformed

    private void stud_salaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stud_salaMouseClicked
        // TODO add your handling code here:
        stud_sala.setText(" ");
    }//GEN-LAST:event_stud_salaMouseClicked

    private void stud_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud_salaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stud_salaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel info_main;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField stud_grad;
    private javax.swing.JTextField stud_id;
    private javax.swing.JTextField stud_name;
    private javax.swing.JTextField stud_posi;
    private javax.swing.JTextField stud_sala;
    // End of variables declaration//GEN-END:variables
}
