
import java.awt.CardLayout;
import java.awt.LayoutManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Coughlan
 */
public class PhysicsGUI extends javax.swing.JPanel {
  
    /**
     * Creates new form PhysicsGUI
     */
    public PhysicsGUI() {
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

        formBtn = new javax.swing.JButton();
        quizBtn = new javax.swing.JButton();
        timeBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        PhysicsLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(450, 500));
        setPreferredSize(new java.awt.Dimension(450, 500));

        formBtn.setBackground(new java.awt.Color(153, 255, 51));
        formBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        formBtn.setText("Formulas");
        formBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        formBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formBtnActionPerformed(evt);
            }
        });

        quizBtn.setBackground(new java.awt.Color(153, 255, 51));
        quizBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        quizBtn.setText("Quizzes");
        quizBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        quizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBtnActionPerformed(evt);
            }
        });

        timeBtn.setBackground(new java.awt.Color(153, 255, 51));
        timeBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        timeBtn.setText("Timeline");
        timeBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        timeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        PhysicsLbl.setFont(new java.awt.Font("Cambria", 1, 40)); // NOI18N
        PhysicsLbl.setText("Physics");

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quizBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BackBtn)))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(PhysicsLbl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhysicsLbl)
                .addGap(81, 81, 81)
                .addComponent(formBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(quizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(timeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBtnActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Quizzes");
        }
    }//GEN-LAST:event_quizBtnActionPerformed

    private void timeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeBtnActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Timeline");
        }
    }//GEN-LAST:event_timeBtnActionPerformed

    private void formBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formBtnActionPerformed
        // TODO add your handling code here:
       LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Formulas");
        }
    }//GEN-LAST:event_formBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
           LayoutManager layout = getParent().getLayout();
         if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Main");
    }                                       
    
    }//GEN-LAST:event_BackBtnActionPerformed
  public static void main(String args[]) {
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel PhysicsLbl;
    private javax.swing.JButton formBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton quizBtn;
    private javax.swing.JButton timeBtn;
    // End of variables declaration//GEN-END:variables
}
