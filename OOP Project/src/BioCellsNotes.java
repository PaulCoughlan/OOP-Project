/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wagner Semboloni
 */
public class BioCellsNotes {
    private String bioCell, subject;
    
    public BioCellsNotes(){
        bioCell = new String();
        subject = new String();
    }

    public String getBioCell() {
        return bioCell;
    }

    public void setBioCell(String bioCell) {
        this.bioCell = bioCell;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
