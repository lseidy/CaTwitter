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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class BuscaController implements Initializable {

    @FXML
    private Button feedButton;
    @FXML
    private Button perfilButton;
    @FXML
    private Button logoutButton;
    @FXML
    private ListView<String> listView;
    @FXML
    private TextField buscaText;
    private int i;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        buscaText.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                //listView = new ListView<>();
                i=0;
                for (Users user : Main.control.getAllusers()){
                    user = Main.control.getAllusers().get(i);
                    if(buscaText.getText().equals(user.getUsername())){
                        listView.getItems().addAll(Main.control.getAllusers().get(i).getUsername());
                    }
                    i++;
                }
            }
            
        });
        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(1);
            }
        });
        perfilButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(4);
            }
        });
        feedButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(3);
            }
        });
    }    
    
}
