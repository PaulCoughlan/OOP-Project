
import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexander
 */
public class TextQuizGeoGUI extends javax.swing.JPanel {
    
    //variables
    String question, answer, subject;
    
    //declare array of object
    TextQuizGeo[] tex;
    
    //declare counter
    int count;

    /**
     * Creates new form TextQuizGeoGUI
     */
    public TextQuizGeoGUI() {
        initComponents();
        
        //create array
        tex = new TextQuizGeo[6];
        //initialise counter
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

        TitleLbl = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        CreatLbl = new javax.swing.JLabel();
        MaximumLbl = new javax.swing.JLabel();
        SubjectLbl = new javax.swing.JLabel();
        QuestionLbl = new javax.swing.JLabel();
        AnswerLbl = new javax.swing.JLabel();
        subjectTf = new javax.swing.JTextField();
        questionTf = new javax.swing.JTextField();
        answerTf = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        DisplayBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();

        TitleLbl.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        TitleLbl.setText("Text Quiz");

        BackBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        HomeBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        HomeBtn.setText("Home");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        CreatLbl.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        CreatLbl.setText("Create your own questions");

        MaximumLbl.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        MaximumLbl.setText("Maximum of six");

        SubjectLbl.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        SubjectLbl.setText("Subject");

        QuestionLbl.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        QuestionLbl.setText("Question");

        AnswerLbl.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        AnswerLbl.setText("Answer");

        subjectTf.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N

        questionTf.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N

        answerTf.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N

        AddBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DisplayBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        DisplayBtn.setText("Display");
        DisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBtnActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        ViewBtn.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CreatLbl)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(TitleLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(MaximumLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnswerLbl)
                                    .addComponent(QuestionLbl)
                                    .addComponent(SubjectLbl)
                                    .addComponent(AddBtn)
                                    .addComponent(DeleteBtn))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subjectTf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(questionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(answerTf, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 43, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(SaveBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ViewBtn))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(DisplayBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(SearchBtn)))))))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreatLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaximumLbl)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubjectLbl))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionLbl))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(DisplayBtn)
                    .addComponent(SearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn)
                    .addComponent(SaveBtn)
                    .addComponent(ViewBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(HomeBtn))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "Quiz");
    }
    }//GEN-LAST:event_BackBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "Main");
        }
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        //Declare TextQuizGeo class
        TextQuizGeo t;
        //Create TextQuizGeo class
        t = new TextQuizGeo();
        
        // get text from textfield
        question = questionTf.getText();
        subject = subjectTf.getText();
        answer = answerTf.getText();
        
        //adding details
        t.setQuestion(question);
        t.setSubject(subject);
        t.setAnswer(answer);
        
        //adding object to array
        tex[count] = t;
        //increment counter
        count++;
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBtnActionPerformed
        //loop through objects
        for (int i = 0; i < tex.length; i = i+1){
            JOptionPane.showMessageDialog(null, " "+ tex[i].QuestionTf() + "/+n " + tex[i].getSubject() + "/+n " + tex[i].getAnswer());
        }
    }//GEN-LAST:event_DisplayBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String searchSubject = JOptionPane.showInputDialog(null, "Please enter a subject type");
       
       for(int i = 0; i < tex.length; i = i+1){
           if(searchSubject.equalsIgnoreCase(tex[i].getSubject())){
               JOptionPane.showMessageDialog(null, " "+ tex[i].getQuestionTf() + "/+n " + tex[i].getSubject() + "/+n " + tex[i].getAnswer() );
           }
       }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(subjectTf.getText().equals("") && questionTf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Sorry you need to enter subject to delete an object");
        }
        else if(count ==0){
            JOptionPane.showMessageDialog(null, "Sorry you need to have something to delete");
        }
        else{
            subject = subjectTf.getText();
            question = questionTf.getText();
            
            for (int i = 0; i < count; i = i+1){
                if(tex[i].getSubject().equals(subject)){
                    tex[i] = tex[count-1];
                    count = count - 1;
                    JOptionPane.showMessageDialog (null, "Deleted from the array: "+subject+ "," +question+ "," +answer+ "from the array. There are" +count+ "items in the array");
                    break;
                }
                if (i==count-1){
                    JOptionPane.showMessageDialog(null, "Sorry, the item you are looking for could not be found.");
                }
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        question = questionTf.getText();
        subject = subjectTf.getText();
        
        TextQuizGeo e = new TextQuizGeo();
        e.setQuestionTf(question);
        e.setSubject(subject);
        e.setAnswer(answer);
        
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            outFile = new File ("output.dat");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(e);
            
            JOptionPane.showMessageDialog(null, "File written successfully");
            
            oStream.close();
        }
        catch(IOException f){
            System.out.println(f);
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            inFile = new File ("output.dat");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);
            
            TextQuizGeo x;
            x = (TextQuizGeo)oStream.readObject();
            
            JOptionPane.showMessageDialog(null, "Subject: "+x.getSubject() + "Question: " +x.getQuestionTf() +"Answer"+ x.getAnswer());
            
            oStream.close();
        }
        catch(IOException f){
            System.out.println(f);
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_ViewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AnswerLbl;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel CreatLbl;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DisplayBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel MaximumLbl;
    private javax.swing.JLabel QuestionLbl;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel SubjectLbl;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JTextField answerTf;
    private javax.swing.JTextField questionTf;
    private javax.swing.JTextField subjectTf;
    // End of variables declaration//GEN-END:variables
}