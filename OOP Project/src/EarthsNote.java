
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
public class EarthsNote  implements Serializable {
    private String earthNote;
    private String subject;
    
    public EarthsNote(){
    earthNote = new String();
    subject = new String();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEarthNoteTf() {
        return earthNote;
    }

    public void setEarthNoteTf(String earthNoteTf) {
        this.earthNote = earthNoteTf;
    }
    
    
}
