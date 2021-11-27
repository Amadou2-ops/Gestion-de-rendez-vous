/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author HP
 */
public class Secretaire extends User {
    private final String ROLE="ROLE_SECRETAIRE";
    public Secretaire (){
        this.role=ROLE;
    }
     public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
