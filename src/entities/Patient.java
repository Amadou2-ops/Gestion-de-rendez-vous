/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author HP
 */
public class Patient extends User{
    private String antecedent;
    private final String ROLE="ROLE_PATIENT";

    public String getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(String antecedent) {
        this.antecedent = antecedent;
    }
    public Patient (){
        this.role=ROLE;
    }
    public Patient (int code, String nom , String prenom ,String antecedent){
        super(code,nom,prenom);
        this.antecedent = antecedent;
        this.role=ROLE;   
    }
    public Patient (String nom , String prenom , String antecedent){
        super(nom,prenom);
        this.antecedent = antecedent;
        this.role=ROLE;   
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
