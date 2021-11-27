package services;

import dao.SecretaireDao;
import dao.ResponsableDao;
import dao.PatientDao;
import dao.MedecinDao;
import dao.UserDao;
import dto.SercretaireDTO;
import dto.ResponsableDTO;
import dto.PatientDTO;
import dto.MedecinDTO;
import entities.Inscription;
import entities.Ordonance;
import entities.Secretaire;
import entities.Responsable;
import entities.Patient;
import entities.Medecin;
import entities.User;
import java.util.List;

/**
 *
 * @author HP
 */
public class Service implements IService {
    //Dependances avec la couche DAO
    SecretaireDao daoSec=new SecretaireDao();
    ResponsableDao daoResp=new ResponsableDao();
    PatientDao daoPat=new PatientDao();
    MedecinDao daoMed=new MedecinDao();
    UserDao daoUser=new UserDao();
    
    public int addInscription(User user) {
       
        if(user.getCode()==0)
        {
            int Code= daoUser.insert(user);
            user.setCode(Code);
        }
       
        return user.getCode() ;
    }

    public User login(String login, String password) {
        return daoUser.findUserLoginAndPassword(login, password);
    }
    

  

  


}
