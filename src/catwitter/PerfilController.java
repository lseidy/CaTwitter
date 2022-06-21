/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package catwitter;

import static catwitter.Main.control;
import essential.*;
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
import javafx.scene.layout.BorderPane;

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
    @FXML
    private BorderPane pane;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField userTextField;
    @FXML
    private TextField formTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField celTextField;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        alterarLabel.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                emptyCells();
                System.out.println(Main.control.getIndex());
                Main.control.getAllusers().get(Main.control.getIndex()).setCelular(celTextField.getText());
                //info.setEmail(emailTextField.getText());
                //info.setFormacao(formTextField.getText());
                //info.setName(nameTextField.getText());
                //info.setUsername(userTextField.getText());
                setInfo();
               
            }

            private void emptyCells() {
                celTextField.setText("");
                emailTextField.setText("");
                formTextField.setText("");
                nameTextField.setText("");
                userTextField.setText("");
                celTextField.setText("");
                emailTextField.setText("");
                formTextField.setText("");
                nameTextField.setText("");
                userTextField.setText("");
            }
        });
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
        System.out.println(Main.control.getAllusers().get(Main.control.getIndex()));
        emailTextField.setPromptText(Main.control.getAllusers().get(Main.control.getIndex()).getEmail());
        //formTextField.setPromptText(info.getFormacao());
        //celTextField.setPromptText(info.getCelular());
        //nameTextField.setPromptText(info.getName());
        //userTextField.setPromptText(info.getUsername());
    }
    
}
