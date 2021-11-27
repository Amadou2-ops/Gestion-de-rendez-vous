/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author HP
 */
public class Ordonance {
    
    private int Codeo;
    private String nom;
    private String posologie;
    
    public Ordonance(){
    
    }
    public int getCodeo() {
        return Codeo;
    }

    public void setCodeo(int Codeo) {
        this.Codeo = Codeo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }
    
    
}
