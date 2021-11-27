/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entities.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import services.Service;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class V_inscriptionController implements Initializable {

    @FXML
    private Button TextefAnnule;
    @FXML
    private Button TexteValidee;
    @FXML
    private TextArea txtnom;
    @FXML
    private TextArea txtprenom;
    @FXML
    private TextArea txtpass;
    @FXML
    private TextArea txtpass1;
    @FXML
    private Text txterreur;
    private final Service service = new Service();
    private static V_inscriptionController ctrl;
    private User user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      txterreur.setVisible(false);
         ctrl = this;
    }    

    @FXML
    private void handleclear(ActionEvent event) {
        txtnom.clear();
        txtprenom.clear();
        txtpass.clear();
        txtpass1.clear();
        txterreur.setVisible(false);
    }

    @FXML
    private void handleconnexion(ActionEvent event) {
         AnchorPane root;
        try {
                  root = FXMLLoader.load(getClass().getResource("/view/v_patient.fxml"));
                  Scene scene = new Scene(root);
                  Stage stage = new Stage();
                  stage.setScene(scene);
                  stage.show();
              } catch (IOException ex) {
                  Logger.getLogger(V_inscriptionController.class.getName()).log(Level.SEVERE, null, ex);
              }
    }
    
 
    @FXML
    private void handleretour(ActionEvent event) {
         AnchorPane root;
        try {
                  root = FXMLLoader.load(getClass().getResource("/view/v_connexion.fxml"));
                  Scene scene = new Scene(root);
                  Stage stage = new Stage();
                  stage.setScene(scene);
                  stage.show();
              } catch (IOException ex) {
                  Logger.getLogger(V_inscriptionController.class.getName()).log(Level.SEVERE, null, ex);
              }
    }
     public static V_inscriptionController getCtrl() {
        return ctrl;
       
    }
    public User getUser() {
        return user;
    }
    
}
