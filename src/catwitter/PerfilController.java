/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package catwitter;

import essential.Users;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class PerfilController implements Initializable {

    @FXML
    private TextField loggedText;
    @FXML
    private Button searchButton;
    @FXML
    private Button feedButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Label emailLabel;
    @FXML
    private Label formLabel;
    private Label celLabel;
    private static essential.Users info;

    public static void setUser(Users user) {
        info = user;
    }
    @FXML
    private Label nameLabel;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //initializeInfo(user);
        //System.out.println(CatwitterController.getI());
        
        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(1);
            }
        });
        feedButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(3);
            }
        });
    }    

    public void initializeInfo(essential.Users info) {
        emailLabel.setText(info.getEmail());
        formLabel.setText(info.getFormacao());
        celLabel.setText(info.getCelular());
        nameLabel.setText(info.getUsername());
        
    }
    
}
