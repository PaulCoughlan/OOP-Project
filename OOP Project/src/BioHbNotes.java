/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wagner Semboloni
 */
public class BioHbNotes {
    private String BioHuman, subject;
    
    public BioHbNotes (){
        BioHuman = new String();
        subject = new String(); 
    }

    public String getBioHuman() {
        return BioHuman;
    }

    public void setBioHuman(String BioHuman) {
        this.BioHuman = BioHuman;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
