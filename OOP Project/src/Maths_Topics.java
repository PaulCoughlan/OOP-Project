
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
public class Maths_Topics extends javax.swing.JPanel {

    /**
     * Creates new form Maths_Topics
     */
    public Maths_Topics() {
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

        Back1Btn = new javax.swing.JButton();
        FormulasBtn = new javax.swing.JButton();
        ExamPapersBtn = new javax.swing.JButton();
        QuizBtn = new javax.swing.JButton();
        MathsLbl = new javax.swing.JLabel();

        Back1Btn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Back1Btn.setText("Back");
        Back1Btn.setBorder(null);
        Back1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1BtnActionPerformed(evt);
            }
        });

        FormulasBtn.setBackground(new java.awt.Color(153, 255, 51));
        FormulasBtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        FormulasBtn.setText("Formulas");
        FormulasBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FormulasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulasBtnActionPerformed(evt);
            }
        });

        ExamPapersBtn.setBackground(new java.awt.Color(153, 255, 51));
        ExamPapersBtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        ExamPapersBtn.setText("Exam Papers");
        ExamPapersBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ExamPapersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamPapersBtnActionPerformed(evt);
            }
        });

        QuizBtn.setBackground(new java.awt.Color(153, 255, 51));
        QuizBtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        QuizBtn.setText("Quiz");
        QuizBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        QuizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtnActionPerformed(evt);
            }
        });

        MathsLbl.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        MathsLbl.setText("Maths");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(FormulasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(ExamPapersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(QuizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(MathsLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(MathsLbl)
                .addGap(56, 56, 56)
                .addComponent(QuizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FormulasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExamPapersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1BtnActionPerformed
        // TODO add your handling code here:
            LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Main");
        }
    }//GEN-LAST:event_Back1BtnActionPerformed

    private void FormulasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormulasBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MathsFormulas");
        }

    }//GEN-LAST:event_FormulasBtnActionPerformed

    private void ExamPapersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamPapersBtnActionPerformed
        // TODO add your handling code here:
       LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MathsFormulas");
        }
    }//GEN-LAST:event_ExamPapersBtnActionPerformed

    private void QuizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtnActionPerformed
        // TODO add your handling code here:
LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MathsQuiz");
        }
    }//GEN-LAST:event_QuizBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1Btn;
    private javax.swing.JButton ExamPapersBtn;
    private javax.swing.JButton FormulasBtn;
    private javax.swing.JLabel MathsLbl;
    private javax.swing.JButton QuizBtn;
    // End of variables declaration//GEN-END:variables
}