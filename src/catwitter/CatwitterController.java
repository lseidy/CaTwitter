/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package catwitter;

import essential.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    private static essential.Users check;
    private static int i;

    
    public static Users getCheck() {
        return check;
   }

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
                        userText.setText("");
                        passwordText.setText("");
                        Main.changeScreen(2);
                    }
                }else{
                    for (i=0; i<Main.control.getAllusers().size();i++){
                        check = (Users) Main.control.getAllusers().get(i);
                        if(check.getUsername().equals(userText.getText())){
                            if(check.getPassword().equals(passwordText.getText())){
                                Main.control.setIndex(i);
                                userText.setText("");
                        passwordText.setText("");
                                Main.changeScreen(3);
                            }
                        }
                    }
                    
                }
            }
        });
        // TODO
    }    
    
}
