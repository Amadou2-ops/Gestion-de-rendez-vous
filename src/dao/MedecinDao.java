/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;
import dto.MedecinDTO;
import entities.Medecin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class MedecinDao implements IDao<Medecin> {
    private DataBase dataBase = new DataBase();
    private final String SQL_SELECT_MEDECIN_BY_ROLES = 
            " SELECT * FROM user m WHERE role LIKE ? ";
    
    private final String SQL_SELECT_ALL = 
            " SELECT * FROM user p WHERE p.role LIKE 'ROLE_MEDECIN' ";
    
    private final String SQL_INSERT = "INSERT INTO `user` "
            + " ( `nom`,`prenom`, `role`, `nci`, `grade` ) "
            + " VALUES (?, 'ROLE_PROFESSEUR', ?, ? )";
    
    
    @Override
    public int insert(Medecin med) {
        int code = 0;
        try {  
            dataBase.openConnexion();
            dataBase.initPrepareStatement(SQL_INSERT);
            dataBase.getPs().setString(1, med.getNom());
            dataBase.getPs().setString(2, med.getPrenom());
            dataBase.getPs().setString(3, med.getRoles());
            dataBase.executeUpdate(SQL_INSERT);
            ResultSet rs = dataBase.getPs().getGeneratedKeys();
            if(rs.next())
            {
                code = rs.getInt(1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedecinDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          dataBase.closeConnexion();  
        }
        return code;
    }

    @Override
    public int update(Medecin ogj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Medecin> findAll(Medecin med) {
        List<Medecin> profs = new ArrayList<>();
        try { 
            dataBase.openConnexion();
            dataBase.initPrepareStatement(SQL_SELECT_ALL);
            ResultSet rs = dataBase.executeSelect(SQL_SELECT_ALL);
            while(rs.next()){
                Medecin prof = new Medecin();
                   prof.setCode(rs.getInt("code"));
                    prof.setNom(rs.getString("nom"));
                    prof.setPrenom(rs.getString("prenom"));
                    prof.setRoles(rs.getString("roles"));
                    profs.add(med);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(MedecinDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             dataBase.closeConnexion();
        }
         System.out.print(profs.size());
        return profs;
    }

    @Override
    public Medecin findByCode(int code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MedecinDTO findByRole(String role) {
        MedecinDTO med = null;
        try {
            dataBase.openConnexion();
            dataBase.initPrepareStatement(SQL_SELECT_MEDECIN_BY_ROLES);
            dataBase.getPs().setString(1, role);
            ResultSet rs = dataBase.executeSelect(SQL_SELECT_MEDECIN_BY_ROLES);
            if(rs.next())
            {
                med = new MedecinDTO();
                med.setCode(rs.getInt("code"));
                med.setNom(rs.getString("nom"));
                med.setPrenom(rs.getString("prenom"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MedecinDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dataBase.closeConnexion();
        }
        return med ;
    }

    @Override
    public List<Medecin> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
