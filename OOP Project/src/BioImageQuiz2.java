
import java.awt.CardLayout;
import java.awt.LayoutManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wagner Semboloni
 */
public class BioImageQuiz2 extends javax.swing.JPanel {

    /**
     * Creates new form BioImageQuiz2
     */
    public BioImageQuiz2() {
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
        titleLbl = new javax.swing.JLabel();
        question3Lbl = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        ansLbl = new javax.swing.JLabel();
        ansTf = new javax.swing.JTextField();
        verifyTf = new javax.swing.JTextField();
        previousBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        panelLbl = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLbl.setText("Image Quiz ");
        jPanel1.add(titleLbl);
        titleLbl.setBounds(20, 10, 130, 40);

        question3Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question3Lbl.setText("Question 2 - Are those names of the Calf muscles are correct? ");
        jPanel1.add(question3Lbl);
        question3Lbl.setBounds(20, 60, 370, 15);

        submitBtn.setText("Submit");
        jPanel1.add(submitBtn);
        submitBtn.setBounds(10, 440, 70, 23);

        ansLbl.setText("Answer: ");
        jPanel1.add(ansLbl);
        ansLbl.setBounds(10, 400, 50, 20);
        jPanel1.add(ansTf);
        ansTf.setBounds(60, 400, 50, 20);
        jPanel1.add(verifyTf);
        verifyTf.setBounds(120, 400, 70, 20);

        previousBtn.setText("previous");
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });
        jPanel1.add(previousBtn);
        previousBtn.setBounds(290, 430, 80, 23);

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn);
        nextBtn.setBounds(380, 430, 55, 23);

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn);
        homeBtn.setBounds(360, 460, 59, 23);

        panelLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wagner Semboloni\\College\\NCI\\First Year\\2 Semester\\OOP\\Project OOP\\OOP Project\\src\\calf.png")); // NOI18N
        jPanel1.add(panelLbl);
        panelLbl.setBounds(40, 90, 380, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if(layout instanceof CardLayout){
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "BioImageQuiz");
        }
    }//GEN-LAST:event_previousBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if(layout instanceof CardLayout){
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "BioImageQuiz3");
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Main");
        }
    }//GEN-LAST:event_homeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansLbl;
    private javax.swing.JTextField ansTf;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel panelLbl;
    private javax.swing.JButton previousBtn;
    private javax.swing.JLabel question3Lbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField verifyTf;
    // End of variables declaration//GEN-END:variables
}
