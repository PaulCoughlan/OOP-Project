
import java.awt.CardLayout;
import java.awt.LayoutManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul1997
 */
public class FormulasGUI extends javax.swing.JPanel {

    /**
     * Creates new form FormulasGUI
     */
    public FormulasGUI() {
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

        FormulasLbl = new javax.swing.JLabel();
        MechBtn = new javax.swing.JButton();
        WavesOPticsBtn = new javax.swing.JButton();
        ModernPhysBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        Home1Btn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(450, 500));

        FormulasLbl.setFont(new java.awt.Font("Cambria", 1, 40)); // NOI18N
        FormulasLbl.setText("Formulas");

        MechBtn.setBackground(new java.awt.Color(153, 255, 51));
        MechBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        MechBtn.setText("Mechanics");
        MechBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MechBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechBtnActionPerformed(evt);
            }
        });

        WavesOPticsBtn.setBackground(new java.awt.Color(153, 255, 51));
        WavesOPticsBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        WavesOPticsBtn.setText("Waves and Optics");
        WavesOPticsBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        WavesOPticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WavesOPticsBtnActionPerformed(evt);
            }
        });

        ModernPhysBtn.setBackground(new java.awt.Color(153, 255, 51));
        ModernPhysBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        ModernPhysBtn.setText("Modern Physics");
        ModernPhysBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ModernPhysBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModernPhysBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        Home1Btn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Home1Btn.setText("Home");
        Home1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home1BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Home1Btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(FormulasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(MechBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(WavesOPticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(ModernPhysBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(FormulasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(MechBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(WavesOPticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(ModernPhysBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Home1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ModernPhysBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModernPhysBtnActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
         if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "ModernPhysics");
    }//GEN-LAST:event_ModernPhysBtnActionPerformed
    }
    private void MechBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechBtnActionPerformed
        // TODO add your handling code here:
          LayoutManager layout = getParent().getLayout();
         if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Mechanics");
        }
    }//GEN-LAST:event_MechBtnActionPerformed

    private void WavesOPticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WavesOPticsBtnActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
         if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Waves");
    }//GEN-LAST:event_WavesOPticsBtnActionPerformed
    }
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
         if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Physics");
    }//GEN-LAST:event_BackBtnActionPerformed
    }
    private void Home1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home1BtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Main");
        }
    }//GEN-LAST:event_Home1BtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel FormulasLbl;
    private javax.swing.JButton Home1Btn;
    private javax.swing.JButton MechBtn;
    private javax.swing.JButton ModernPhysBtn;
    private javax.swing.JButton WavesOPticsBtn;
    // End of variables declaration//GEN-END:variables
}
