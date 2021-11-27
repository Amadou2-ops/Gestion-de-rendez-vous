/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import services.Service;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class V_rendezvousController implements Initializable {

    private final Service service = new Service();
    private static V_rendezvousController ctrl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ctrl = this;
    }    

    
    public static V_rendezvousController getCtrl() {
        return ctrl;
    }

    @FXML
    private void handleRetour(ActionEvent event) {
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
    private void handlevalider(ActionEvent event) {
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

   
    
}
