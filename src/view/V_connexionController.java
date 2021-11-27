/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import services.Service;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class V_connexionController implements Initializable {
    private final Service service = new Service();
    
    private static V_connexionController ctrl;

    @FXML
    private TextArea TextfLogin;
    @FXML
    private TextArea TextPassword;
    @FXML
    private Button TextfAnnuler;
    @FXML
    private Button TextfValider;
    @FXML
    private Text TextfErreur;
    @FXML
    private Button txtInscrire;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextfErreur.setVisible(false);
         ctrl = this;
    }    

    }    

    @FXML
    private void handleClear(ActionEvent event) {
        TextfLogin.clear();
        TextPassword.clear();
        TextPassword.setVisible(false); 
    }

    @FXML
    private void HandleConnexion(ActionEvent event) {
String login = txtlLogin.getText().trim();
        String password = txtpPassword.getText().trim();
        if(login.isEmpty() || password.isEmpty())
        {
          txtError.setText("login ou le mot de passe Obligatoire");
          txtError.setVisible(true);
        }
        else{
          user = service.login(login, password);
          if(user == null)
          {
               txtError.setText("login ou le mot de passe Incorrect");
               txtError.setVisible(true);
          }
          else
          {
              //Cache la fénétre de connexion
              this.txtError.getScene().getWindow().hide();
              AnchorPane root = null;
              
              try {
                  String role = null;
                  if ("ROLE_PATIENT".equals(role)){
                  root = FXMLLoader.load(getClass().getResource("/views/v_patient.fxml"));
                  }
                  if ("ROLE_MEDECIN".equals(role)){
                  root = FXMLLoader.load(getClass().getResource("/views/v_medecin.fxml"));
                  }
                  if ("ROLE_SECRETAIRE".equals(role)){
                  root = FXMLLoader.load(getClass().getResource("/views/v_secretaire.fxml"));
                  }
                  if ("ROLE_RESPONSABLE".equals(role)){
                  root = FXMLLoader.load(getClass().getResource("/views/v_secraitaire.fxml"));
                  }
                  Scene scene = new Scene(root);
                  Stage stage = new Stage();
                  stage.setScene(scene);
                  stage.show();
              } catch (IOException ex) {
                  Logger.getLogger(V_connexionController.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    }

    @FXML
    private void handleinscription(ActionEvent event) {
    }
    
}
