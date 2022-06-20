package catwitter;

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
   
    private static Scene sceneLogin, sceneAdm, sceneFeed, scenePerfil;
    private static Stage primaryStage;
    protected static essential.Control control = new essential.Control();
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader login = new FXMLLoader(getClass().getResource("fxml/Catwitter.fxml"));
        FXMLLoader adm = new FXMLLoader(getClass().getResource("fxml/Cadastro.fxml"));
        FXMLLoader feed = new FXMLLoader(getClass().getResource("fxml/Feed.fxml"));
        FXMLLoader perfil = new FXMLLoader(getClass().getResource("fxml/Perfil.fxml"));
        
        primaryStage = stage;
        
        primaryStage.setTitle("Login");
        
        Parent parentPerfil = perfil.load();
        Parent parentLogin = login.load();
        Parent parentAdm = adm.load();
        Parent parentFeed = feed.load();
       
        sceneFeed = new Scene(parentFeed);
        sceneLogin = new Scene(parentLogin);
        sceneAdm = new Scene(parentAdm);
        scenePerfil = new Scene(parentPerfil);
        
        
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
            case 3:
                primaryStage.setScene(sceneFeed);
                break;
            case 4:
                primaryStage.setScene(scenePerfil);
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