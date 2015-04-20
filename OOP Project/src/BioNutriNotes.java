/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wagner Semboloni
 */
public class BioNutriNotes {
    private String bioNutri;
    private String subject;
    
    public BioNutriNotes(){
        bioNutri = new String();
        subject = new String();
    }

    public String getBioNutri() {
        return bioNutri;
    }

    public void setBioNutri(String bioNutri) {
        this.bioNutri = bioNutri;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    
}
