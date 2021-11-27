/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author HP
 */
public class User {
    protected int code;
    protected String nom;
    protected String prenom;
    protected String login;
    protected String password;
    protected String role;

    public User(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public User() {
    }
     public User(int code, String nom , String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

    public User(String nom , String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
 public User(int code, String nom , String prenom, String login, String password) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        
    }

    public User(String nom , String prenom, String login , String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }
public String getPrenom() {
        return prenom;
    }   
    public String getRole() {
        return role;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    

}

