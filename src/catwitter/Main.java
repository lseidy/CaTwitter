package catwitter;

import essential.Users;
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
   
    private static Scene sceneLogin, sceneAdm, sceneFeed, scenePerfil, sceneBusca;
    private static Stage primaryStage;
    public static essential.Control control = new essential.Control();


    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader login = new FXMLLoader(getClass().getResource("fxml/Catwitter.fxml"));
        FXMLLoader adm = new FXMLLoader(getClass().getResource("fxml/Cadastro.fxml"));
        FXMLLoader feed = new FXMLLoader(getClass().getResource("fxml/Feed.fxml"));
        FXMLLoader perfil = new FXMLLoader(getClass().getResource("fxml/Perfil.fxml"));
        FXMLLoader bsuca = new FXMLLoader(getClass().getResource("fxml/Busca.fxml"));
        
        primaryStage = stage;
        
        primaryStage.setTitle("Catwitter");
        
        Parent parentPerfil = perfil.load();
        Parent parentLogin = login.load();
        Parent parentAdm = adm.load();
        Parent parentFeed = feed.load();
        Parent parentBusca = bsuca.load();
       
        sceneFeed = new Scene(parentFeed);
        sceneLogin = new Scene(parentLogin);
        sceneAdm = new Scene(parentAdm);
        scenePerfil = new Scene(parentPerfil);
        sceneBusca = new Scene(parentBusca); 
        
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
                //FeedController.loadTable();
                break;
            case 4:
                primaryStage.setScene(scenePerfil);
                break;
            case 5:
                primaryStage.setScene(sceneBusca);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}