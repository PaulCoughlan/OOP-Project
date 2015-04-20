/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wagner Semboloni
 */
public class BioGeneticsNotes {
    private String bioGen, subject;
    
    public BioGeneticsNotes(){
        bioGen = new String();
        subject = new String();
    }

    public String getBioGen() {
        return bioGen;
    }

    public void setBioGen(String bioGen) {
        this.bioGen = bioGen;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}

