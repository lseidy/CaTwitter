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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class FeedController implements Initializable {

    @FXML
    private Button searchButton;
    @FXML
    private Button perfilButton;
    @FXML
    private Button logoutButton;
    private essential.Users user;
    @FXML
    private Label loggedText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        user = CatwitterController.getCheck();
        //setItens(user);
        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(1);
            }
        });
        perfilButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PerfilController.setUser(CatwitterController.getCheck());
                Main.changeScreen(4);
            }
        });
    }
    public void setItens(essential.Users user){
        loggedText.setText(user.getUsername());
    } 
}
