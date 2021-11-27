/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import dto.SercretaireDTO;
import entities.Secretaire;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class SecretaireDao {
    private DataBase dataBase = new DataBase();
    
    private final String SQL_SELECT_SECRETAIRE_BY_ROLES = 
            " SELECT * FROM user  WHERE role LIKE 'ROLE_SECRETAIRE ";
    public SercretaireDTO findByRole(String roles) {
        SercretaireDTO sec = null;
        try {
            dataBase.openConnexion();
            dataBase.initPrepareStatement(SQL_SELECT_SECRETAIRE_BY_ROLES);
            dataBase.getPs().setString(1, roles);
            ResultSet rs = dataBase.executeSelect(SQL_SELECT_SECRETAIRE_BY_ROLES);
            if(rs.next())
            {
                sec = new SercretaireDTO();
                sec.setCode(rs.getInt("code"));
                sec.setNom(rs.getString("nom"));
                sec.setPrenom(rs.getString("prenom"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SecretaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dataBase.closeConnexion();
        }
        return sec ;

    }
}
