
import java.awt.CardLayout;
import java.awt.LayoutManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexander
 */
public class ImageGalleryGeo extends javax.swing.JPanel {

    /**
     * Creates new form ImageGalleryGeo
     */
    public ImageGalleryGeo() {
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

        Back = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Topic1 = new javax.swing.JButton();
        Topic2 = new javax.swing.JButton();
        Topic3 = new javax.swing.JButton();
        Topic4 = new javax.swing.JButton();
        Topic5 = new javax.swing.JButton();
        Topic6 = new javax.swing.JButton();
        Topic7 = new javax.swing.JButton();
        Topic8 = new javax.swing.JButton();
        Home = new javax.swing.JButton();

        Back.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Title.setText("Image Gallery");

        Topic1.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic1.setText("Topic 1");

        Topic2.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic2.setText("Topic 2");

        Topic3.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic3.setText("Topic 3");

        Topic4.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic4.setText("Topic 4");

        Topic5.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic5.setText("Topic 5");

        Topic6.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic6.setText("Topic 6");

        Topic7.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic7.setText("Topic 7");

        Topic8.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Topic8.setText("Topic 8");

        Home.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Topic7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(Topic8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Topic5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Topic6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Topic3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Topic4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Topic1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Topic2)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Home))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Title)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Topic1)
                    .addComponent(Topic2))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Topic3)
                    .addComponent(Topic4))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Topic5)
                    .addComponent(Topic6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Topic7)
                    .addComponent(Topic8))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Home))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "Geography");
    }   
    }//GEN-LAST:event_BackActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Main");
        }
    }//GEN-LAST:event_HomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Topic1;
    private javax.swing.JButton Topic2;
    private javax.swing.JButton Topic3;
    private javax.swing.JButton Topic4;
    private javax.swing.JButton Topic5;
    private javax.swing.JButton Topic6;
    private javax.swing.JButton Topic7;
    private javax.swing.JButton Topic8;
    // End of variables declaration//GEN-END:variables
}
