package catwitter;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lucas
 */
public class Main extends Application {
   
    private static Scene sceneLogin, sceneAdm;
    private static Stage primaryStage;
    protected static essential.Control control = new essential.Control();
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader login = new FXMLLoader(getClass().getResource("fxml/Catwitter.fxml"));
        FXMLLoader adm = new FXMLLoader(getClass().getResource("fxml/Cadastro.fxml"));
        
        primaryStage = stage;
        
        primaryStage.setTitle("Login");
        
        Parent parentLogin = login.load();
        Parent parentAdm = adm.load();
       
        sceneLogin = new Scene(parentLogin);
        sceneAdm = new Scene(parentAdm);
        
        stage.setScene(sceneLogin);
        stage.show();
    }
    public static void changeScreen(int op){
        switch(op){
            case 1:
                primaryStage.setScene(sceneLogin);
                break;
            case 2:
                primaryStage.setScene(sceneAdm);
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}