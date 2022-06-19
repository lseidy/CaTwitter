/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package catwitter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class CadastroController implements Initializable {

    @FXML
    private TextField nomeText;
    @FXML
    private TextField emailText;
    @FXML
    private TextField userText;
    @FXML
    private TextField passwordText;
    @FXML
    private Button cadastroButton;
    @FXML
    private Button logoutButton;
    
    private essential.Users user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cadastroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                user = new essential.Users(userText.getText(),passwordText.getText(),nomeText.getText(),emailText.getText() );
                Main.control.setAllusers(user);
            }
        });
    }    

    @FXML
    private void click_logout(ActionEvent event) {
        Main.changeScreen(1);
    }
    
}
