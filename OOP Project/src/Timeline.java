
import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paul1997
 */
public class Timeline extends javax.swing.JPanel {

     private String ScientistText;
     private String DiscText;
     private int year;

     private ArrayList <Timeline> tList;


     private int counter;
    /**
     * Creates new form Timeline
     */
    public Timeline() {
        initComponents();
        ScientistText = new String();
        DiscText = new String();
        year = 0;
        //create array of question objects
        tList = new ArrayList <>();
        //initialise count to 0
        counter = 0;
    }

    public void setScientistText(String ScientistText) {
        this.ScientistText = ScientistText;
    }

    public void setDiscText(String DiscText) {
        this.DiscText = DiscText;
    }

  public int  getYear() {
        return year;
    }

    public String getScientistText() {
        return ScientistText;
    }

    public String getDiscText() {
        return DiscText;
    }

    public ArrayList<Timeline> gettList() {
        return tList;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        ScientistTf = new javax.swing.JTextField();
        DiscTf = new javax.swing.JTextField();
        YearTf = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        ScientistLbl = new javax.swing.JLabel();
        DiscLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 40)); // NOI18N
        jLabel1.setText("Timeline");

        Back.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Home.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        ScientistTf.setMinimumSize(new java.awt.Dimension(6, 20));
        ScientistTf.setPreferredSize(new java.awt.Dimension(6, 20));

        DiscTf.setMinimumSize(new java.awt.Dimension(6, 20));
        DiscTf.setPreferredSize(new java.awt.Dimension(6, 20));

        YearTf.setPreferredSize(new java.awt.Dimension(6, 20));

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear form");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display All");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        ScientistLbl.setText("Scientist:");

        DiscLbl.setText("Discovery/Theory:");

        yearLbl.setText("Year:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Home)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddBtn)
                        .addGap(63, 63, 63)
                        .addComponent(clearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScientistLbl)
                            .addComponent(DiscLbl)
                            .addComponent(yearLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScientistTf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(YearTf, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(DiscTf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScientistTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScientistLbl))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiscTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiscLbl))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLbl))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(clearBtn)
                    .addComponent(displayBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
          LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "Physics");
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

    private void YearTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearTfActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        ScientistTf.setText("");
        DiscTf.setText("");
        YearTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        // Get text from TextFields
        ScientistText = ScientistTf.getText();
        DiscText = DiscTf.getText();
        year = Integer.parseInt(YearTf.getText());

        //create a new Question object
        Timeline t = new Timeline();

        //add contents of textfields to q
        t.setScientistText(ScientistText);
        t.setDiscText(DiscText);
        t.setYear(year);

        //add q to array of Question objects
        tList.add(t);
        //increase count to show that another object has been added to the array
        counter++;
    }//GEN-LAST:event_AddBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
         // TODO add your handling code here:
         for(int i = 0; i < tList.size();i++){
            JOptionPane.showMessageDialog(null, "Scientist: "+tList.get(i).getScientistText()+"\n discovery/theory: "+tList.get(i).getDiscText()+"\n Year: "+tList.get(i).getYear());
        }
    }//GEN-LAST:event_displayBtnActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton Back;
    private javax.swing.JLabel DiscLbl;
    private javax.swing.JTextField DiscTf;
    private javax.swing.JButton Home;
    private javax.swing.JLabel ScientistLbl;
    private javax.swing.JTextField ScientistTf;
    private javax.swing.JTextField YearTf;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration//GEN-END:variables



    private void setYear(int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
