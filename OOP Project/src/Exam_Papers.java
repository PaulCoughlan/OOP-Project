
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
public class Exam_Papers extends javax.swing.JPanel {

    /**
     * Creates new form Exam_Papers
     */
    public Exam_Papers() {
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

        Back4Btn = new javax.swing.JButton();
        ExamPapersLbl = new javax.swing.JLabel();
        ExamPapersTxtArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        HomeBtn = new javax.swing.JButton();

        Back4Btn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        Back4Btn.setText("Back");
        Back4Btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Back4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back4BtnActionPerformed(evt);
            }
        });

        ExamPapersLbl.setFont(new java.awt.Font("Cambria", 1, 40)); // NOI18N
        ExamPapersLbl.setText("Exam Papers");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("2014:\n\nPaper 1 -\nPaper 2 -\n\n2013:\n\nPaper 1 -\nPaper 2 -\n\n2012:\n\nPaper 1 -\nPaper 2 -\n\n....\n\n\n \n");
        ExamPapersTxtArea.setViewportView(jTextArea1);

        HomeBtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        HomeBtn.setText("Home");
        HomeBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(ExamPapersTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExamPapersLbl)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(ExamPapersLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExamPapersTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back4Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back4BtnActionPerformed
        // TODO add your handling code here:
           LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Topics");
        }
    }//GEN-LAST:event_Back4BtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
            LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Main");
        }
    }//GEN-LAST:event_HomeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back4Btn;
    private javax.swing.JLabel ExamPapersLbl;
    private javax.swing.JScrollPane ExamPapersTxtArea;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}