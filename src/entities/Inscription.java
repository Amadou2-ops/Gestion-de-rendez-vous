/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import java.time.Year;

/**
 *
 * @author HP
 */
public class Inscription {
    private int code;
    private Patient pat; 

    public Inscription() {
    }

    public Inscription(int code, Patient pat) {
        this.code = code;
        this.pat = pat;
        
    }

    public Inscription(Patient pat) {
        this.pat = pat;
       
    }

    public Inscription(Patient pat, String nom, String prenom, String login, String password) {
        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Patient getPat() {
        return pat;
    }

    public void setPat(Patient pat) {
        this.pat = pat;
    }

    


    

  


    
    

}
