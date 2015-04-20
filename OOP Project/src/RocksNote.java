
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
public class RocksNote implements Serializable{
    private String rockNote;
    private String subject;
    
    public RocksNote(){
    rockNote = new String();
    subject = new String();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRockNoteTf() {
        return rockNote;
    }

    public void setRockNoteTf(String rockNoteTf) {
        this.rockNote = rockNoteTf;
    }
}
