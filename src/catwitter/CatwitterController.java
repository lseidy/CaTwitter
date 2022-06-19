/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package catwitter;

import essential.*;
import java.awt.Desktop.Action;
import java.awt.Event;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class CatwitterController implements Initializable {
    @FXML
    private TextField userText;
    @FXML
    private PasswordField passwordText;
    @FXML
    private Button loginButton;
    private essential.Users user = new essential.Users();

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (user.getAdminUser().equals(userText.getText())) {
                    if (user.getAdminPassWord().equals(passwordText.getText())) {
                        Main.changeScreen(2);
                    }
                }else{
                    for (int i = 0; i < Main.control.getAllusers().size(); i++){
                        System.out.println("entrou");
                        System.out.println();
                        
                    }
                    
                }
            }
        });
        // TODO
    }    
    
}
