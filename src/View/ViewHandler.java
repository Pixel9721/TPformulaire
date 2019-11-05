package View;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private Scene scene;
    private Group root;
    private ViewInscription vFormulaire;
    private ViewConnexion vConnexion;


    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;


        root = new Group();
        scene = new Scene(root,1200, 900);

        vFormulaire = new ViewInscription(this, root);
        vConnexion = new ViewConnexion();

        primaryStage.setTitle("TPFormulaire");
        primaryStage.setScene(scene);

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

}
