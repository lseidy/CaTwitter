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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import catwitter.FeedController;

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
    private Label celLabel;
    private static essential.Users info;

    @FXML
    private Button alterarLabel;
    @FXML
    private TextField thoughtsPost;
    @FXML
    private Button postButton;
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
    @FXML
    private Button showData;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        searchButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Main.changeScreen(5);
            }   
        });
        showData.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setInfo();
            }
        });
        
        
        alterarLabel.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
              boolean valid = nameTextField.getText().isEmpty();
              if(!valid){
                  Main.control.getAllusers().get(Main.control.getIndex()).setName(nameTextField.getText());
              }
              valid = celTextField.getText().isEmpty();
              if(!valid){
                   Main.control.getAllusers().get(Main.control.getIndex()).setCelular(celTextField.getText());
              }
               valid = emailTextField.getText().isEmpty();
              if(!valid){
                  Main.control.getAllusers().get(Main.control.getIndex()).setEmail(emailTextField.getText());
              }
               valid = formTextField.getText().isEmpty();
              if(!valid){
                 Main.control.getAllusers().get(Main.control.getIndex()).setFormacao(formTextField.getText());
              }
               valid = userTextField.getText().isEmpty();
              if(!valid){
                   Main.control.getAllusers().get(Main.control.getIndex()).setUsername(userTextField.getText());
              }
              emptyCells();
               setInfo();
               
            }

            private void emptyCells() {
                nameTextField.setText("");
                formTextField.setText("");
                celTextField.setText("");
                emailTextField.setText("");
                userTextField.setText("");
            }
        });
        postButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("aqui: "+thoughtsPost.getText());
               control.getAllusers().get(control.getIndex()).setPosts(thoughtsPost.getText(), control.getAllusers().get(control.getIndex()).getUsername());
               thoughtsPost.setText("");
               //loadTable();
               /*
               for (Posts post :  Main.control.getPostsAll())
                System.out.println("POSTS: "+ post.getPost());*/
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
                Main.changeScreen(3);
            }
        });
    }
    public void setInfo(){
        emailTextField.setPromptText(Main.control.getAllusers().get(Main.control.getIndex()).getEmail());
        formTextField.setPromptText(Main.control.getAllusers().get(Main.control.getIndex()).getFormacao());
        celTextField.setPromptText(Main.control.getAllusers().get(Main.control.getIndex()).getCelular());
        nameTextField.setPromptText(Main.control.getAllusers().get(Main.control.getIndex()).getName());
        userTextField.setPromptText(Main.control.getAllusers().get(Main.control.getIndex()).getUsername());
    }

}
