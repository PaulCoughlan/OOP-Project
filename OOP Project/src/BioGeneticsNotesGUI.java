
import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wagner Semboloni
 */
public class BioGeneticsNotesGUI extends javax.swing.JPanel {
    //variable
    String bioGen, subject;
    
    //declare array of object
    BioGeneticsNotes[] genArrList;
    
    //declare counter
    int count;
    
    /**
     * Creates new form BioGeneticsNotes
     */
    public BioGeneticsNotesGUI() {
        initComponents();
        genArrList = new BioGeneticsNotes[6];
        
        //init counter
        count = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        back2Btn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        bioGenTf = new javax.swing.JTextField();
        displayBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        subjectLbl = new javax.swing.JLabel();
        subjectTf = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        backBtn.setText("Back Notes");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        back2Btn.setText("Back Main Bio");
        back2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2BtnActionPerformed(evt);
            }
        });

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLbl.setText("Genetics Notes");

        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        subjectLbl.setText("Subject: ");

        searchBtn.setText("Search by subject");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(backBtn)
                                .addGap(18, 18, 18)
                                .addComponent(back2Btn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(bioGenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(titleLbl)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(homeBtn)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(displayBtn)
                            .addGap(32, 32, 32)
                            .addComponent(delBtn)
                            .addGap(18, 18, 18)
                            .addComponent(addBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveBtn)
                            .addGap(81, 81, 81))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(subjectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(subjectTf, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBtn)))
                    .addContainerGap(48, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(bioGenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(back2Btn))
                .addGap(26, 26, 26)
                .addComponent(homeBtn)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subjectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subjectTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn))
                    .addGap(268, 268, 268)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(displayBtn)
                        .addComponent(delBtn)
                        .addComponent(addBtn)
                        .addComponent(saveBtn))
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if(layout instanceof CardLayout){
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "NotesBio");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void back2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2BtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if(layout instanceof CardLayout){
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Biology");
        }
    }//GEN-LAST:event_back2BtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "Main");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        //loop through objects
        for (int i = 0; i < genArrList.length; i = i+1){
            JOptionPane.showMessageDialog(null, " "+ genArrList[i].getBioGen() + " " + genArrList[i].getSubject());
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if(subjectTf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Sorry you need to enter subject first");
        }
        else if(count ==0){
            JOptionPane.showMessageDialog(null, "Sorry you need to have something to delete");
        }
        else{
            subject = subjectTf.getText();
            bioGen = bioGenTf.getText();

            for (int i = 0; i < count; i = i+1){
                if(genArrList[i].getSubject().equals(subject)){
                    genArrList[i] = genArrList[count-1];
                    count = count - 1;
                    JOptionPane.showMessageDialog (null, "Deleted from the array: "+subject+ "," +bioGen+"from the array. There are" +count+ "items in the array");
                    break;
                }
                if (i==count-1){
                    JOptionPane.showMessageDialog(null, "Sorry, the item you are looking for could not be found.");
                }
            }
        }

    }//GEN-LAST:event_delBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        //Declare object class
        BioGeneticsNotes g;
        //Create EarthsNote class
        g = new BioGeneticsNotes();

        // get text from textfield
        bioGen = bioGenTf.getText();
        subject = subjectTf.getText();

        //adding details
        g.setBioGen(bioGen);
        g.setSubject(subject);

        //adding object to array
        genArrList[count] = g;
        //increment counter
        count++;
    }//GEN-LAST:event_addBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        bioGen = bioGenTf.getText();
        subject = subjectTf.getText();

        BioGeneticsNotes g = new BioGeneticsNotes();
        g.setBioGen(bioGen);
        g.setSubject(subject);

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try{
            outFile = new File ("output.dat");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(g);

            JOptionPane.showMessageDialog(null, "File written successfully");

            oStream.close();
        }
        catch(IOException f){
            System.out.println(f);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchSubject = JOptionPane.showInputDialog(null, "Please enter a subject type");

        for(int i = 0; i < genArrList.length; i = i+1){
            if(searchSubject.equalsIgnoreCase(genArrList[i].getSubject())){
                JOptionPane.showMessageDialog(null, " "+ genArrList[i].getBioGen() + " " + genArrList[i].getSubject());
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton back2Btn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bioGenTf;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel subjectLbl;
    private javax.swing.JTextField subjectTf;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
