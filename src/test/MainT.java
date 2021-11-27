/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;
import dao.DataBase;
import entities.Consultation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class MainT {
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        DataBase data =new DataBase();
        //Ouverture de connexion
        data.openConnexion();
        
        String sql="select * FROM user";
        data.initPrepareStatement(sql);
        ResultSet rs=data.executeSelect(sql);
        List<Consultation> classes=new ArrayList();
        while (rs.next()){
            //Mapping relationnelle to objet
            Consultation cl=new Consultation(rs.getInt("codec"),rs.getString("medecin"));
            classes.add(cl);
            
        }
        
        //fermeture connexion
        data.closeConnexion();
        classes.forEach(System.out::println);
    }
    

}
