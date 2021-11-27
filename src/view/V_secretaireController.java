/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entities.Consultation;
import entities.User;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import services.Service;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class V_secretaireController implements Initializable {

    private final Service service = new Service();
    private static V_secretaireController ctrl;
    private User user=V_connexionController.getCtrl().getUser();
    @FXML
    private TableView<Consultation> tblView;
    @FXML
    private TableColumn<Consultation, String> tblCode;
    @FXML
    private TableColumn<Consultation, String> tblDate;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // loadTableView();
        ctrl = this;
    }    
   

    @FXML
    private void hundleValider(ActionEvent event) {
         AnchorPane root = null;
              
              try {
                  root = FXMLLoader.load(getClass().getResource("/view/v_secretaire.fxml"));
                  Scene scene = new Scene(root);
                  Stage stage = new Stage();
                  stage.setScene(scene);
                  stage.show();
              } catch (IOException ex) {
                  Logger.getLogger(V_secretaireController.class.getName()).log(Level.SEVERE, null, ex);
              }
    }
    
}
