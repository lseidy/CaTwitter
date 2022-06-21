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
   
    
    @FXML
    private TableView<ArrayList<Posts>> table;
    @FXML
    private TableColumn<ArrayList<Posts>, String> userTable;
    @FXML
    private TableColumn<ArrayList<Posts>, String> dateTable;
    @FXML
    private TableColumn<ArrayList<Posts>, String> meowTable;
   
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.changeScreen(1);
            }
        });
        perfilButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //loadTable(control.getPostsAll());
                Main.changeScreen(4);
            }
        });
    }
    
    private void loadTable(ArrayList<Posts> user){
        //ObservableList<ArrayList<Posts>> observableList;
        //observableList = FXCollections.observableArrayList(control.getPostsAll());
        
        userTable.setCellValueFactory(new PropertyValueFactory<>("author"));
        dateTable.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
        meowTable.setCellValueFactory(new PropertyValueFactory<>("post"));
        
        //table.setItems(observableList);
    }
  
    
}
