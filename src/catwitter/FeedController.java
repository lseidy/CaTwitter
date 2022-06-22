/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package catwitter;

import static catwitter.Main.control;
import essential.Control;
import essential.Posts;
import essential.Users;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    @FXML
    private Label loggedText;
    private final Control control = Main.control;
    private int n=0;
   
    
    @FXML
    private TableView<Posts> table;
    @FXML
    private TableColumn<Posts, String> author;
    @FXML
    private TableColumn<Posts, String> timestamp;
    @FXML
    private TableColumn<Posts, String> post;
    
    ObservableList<Posts> list = FXCollections.observableArrayList();
    @FXML
    private Button showFeed;
    

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
        showFeed.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            loadTable();
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
}

    public void loadTable() {
        author.setCellValueFactory(new PropertyValueFactory<Posts, String>("author"));
        timestamp.setCellValueFactory(new PropertyValueFactory<Posts, String>("timestamp"));
        post.setCellValueFactory(new PropertyValueFactory<Posts, String>("post"));

        for(Posts i : control.getPostsAll()){
            list.add(control.getPostsAll().get(n));
            n++;
        }
        table.setItems(list); 
    }}
