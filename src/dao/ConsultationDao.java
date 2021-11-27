/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entities.Consultation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConsultationDao implements IDao<Consultation>{
    private final String SQL_INSERT = "INSERT INTO `Consultation` "
            + " ( `codeC`, `date`) "
            + " VALUES ( ?, ?)";
    private DataBase dataBase = new DataBase();

    @Override
    public int insert(Consultation consultation) {
        int idConsultation = 0;
        try {
            dataBase.openConnexion();
            dataBase.initPrepareStatement(SQL_INSERT);
            dataBase.getPs().setString(1, consultation.getDate());
            //dataBase.getPs().setInt(2, consultation.getPat().getCode());
            dataBase.getPs().setInt(2, consultation.getMed().getCode());
            dataBase.executeUpdate(SQL_INSERT);
            ResultSet rs = dataBase.getPs().getGeneratedKeys();
            if(rs.next())
            {
                idConsultation = rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dataBase.closeConnexion();
        }
        return idConsultation;
    }

    @Override
    public int update(Consultation ogj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Consultation> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consultation findByCode(int code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
