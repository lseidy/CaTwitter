/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package catwitter;

import essential.Users;
import java.awt.Desktop.Action;
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
    @FXML
    private Label celLabel;
    private static essential.Users info;

    public static void setUser(Users user) {
        info = user;
    }
    @FXML
    private Label nameLabel;
    @FXML
    private Label userLabel;
    @FXML
    private Button alterarLabel;
    @FXML
    private TextField thoughtsPost;
    @FXML
    private Button postButton;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        postButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               info.setPosts(thoughtsPost.getText());
               thoughtsPost.setText("");
            }
        });
        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(1);
            }
        });
        feedButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setInfo();
                Main.changeScreen(3);
            }
        });
    }
    public void setInfo(){
        emailLabel.setText(info.getEmail());
        formLabel.setText(info.getFormacao());
        celLabel.setText(info.getCelular());
        nameLabel.setText(info.getName());
        userLabel.setText(info.getUsername());
    }
    
}
