
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexander
 */
public class MapsNote implements Serializable{
    private String mapNote;
    private String subject;
    
    public MapsNote(){
    mapNote = new String();
    subject = new String();
    }

    public String getMapNote() {
        return mapNote;
    }

    public void setMapNote(String mapNote) {
        this.mapNote = mapNote;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
    
