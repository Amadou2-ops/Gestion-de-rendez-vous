/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dto;

import entities.Consultation;
import entities.Secretaire;
import java.util.List;

/**
 *
 * @author HP
 */
public class SercretaireDTO {
    private int code;
    private String nom;
    private String prenom;
    private List<Consultation> consultation;
    
    public SercretaireDTO(){
    
    }
    public SercretaireDTO(int code, String nom, String prenom, List<Consultation> consultation){
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.consultation = consultation;
    
    }
    public SercretaireDTO( String nom, String prenom, List<Consultation> consultation){
        this.nom = nom;
        this.prenom = prenom;
        this.consultation = consultation;
    
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Consultation> getConsultation() {
        return consultation;
    }

    public void setConsultation(List<Consultation> consultation) {
        this.consultation = consultation;
    }

}
