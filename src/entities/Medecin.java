/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author HP
 */
public class Medecin extends User {
    private String roles;
    private final String ROLE="ROLE_MEDECIN";
    
    public Medecin() {
        this.role=ROLE;
        
    }
     public Medecin (int code, String nom , String prenom , String roles){
        super(code,nom,prenom);
        this.roles = roles;
        this.role=ROLE;   
    }
    public Medecin (String nom , String prenom , String roles){
        super(nom,prenom);
        this.roles = roles;
        this.role=ROLE;   
    }
    
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
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

    public void add(Medecin med) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}

