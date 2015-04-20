
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
public class VolcanoesNote implements Serializable{
    private String volcanoeNote;
    private String subject;
    
    public VolcanoesNote(){
    volcanoeNote = new String();
    subject = new String();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getVolcanoeNoteTf() {
        return volcanoeNote;
    }

    public void setVolcanoeNoteTf(String volcanoeNoteTf) {
        this.volcanoeNote = volcanoeNoteTf;
    }
}
