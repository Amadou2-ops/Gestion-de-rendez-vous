/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import dto.PatientDTO;
import entities.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class PatientDao {
    private DataBase dataBase = new DataBase();
    
    private final String SQL_SELECT_ALL = 
            " SELECT * FROM user  WHERE role LIKE 'ROLE_PATIENT ";
    
    private final String SQL_INSERT = "INSERT INTO `user` "
            + " ( `nom`,`prenom`, `role`, `login`, `password` ) "
            + " VALUES (?, 'ROLE_PATIENT', ?, ? )";

    public int insert(Patient pat) {
         int code = 0;
        try {  
            dataBase.openConnexion();
            dataBase.initPrepareStatement(SQL_INSERT);
            dataBase.getPs().setString(1, pat.getNom());
            dataBase.getPs().setString(2, pat.getPrenom());
            dataBase.getPs().setString(3, pat.getLogin());
            dataBase.getPs().setString(4, pat.getPassword());
            dataBase.executeUpdate(SQL_INSERT);
            ResultSet rs = dataBase.getPs().getGeneratedKeys();
            if(rs.next())
            {
                code = rs.getInt(1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          dataBase.closeConnexion();  
        }
        return code;
    }

}
