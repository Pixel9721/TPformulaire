package View;

import Controller.ControllerFormulaire;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private Scene scene;
    private Group root;
    private ViewInscription vFormulaire;


    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;


        root = new Group();
        scene = new Scene(root,1200, 900);

        vFormulaire = new ViewInscription(this, root);
        primaryStage.setTitle("TPFormulaire");
        primaryStage.setScene(scene);

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

    public void setEvnetHandlerFormulaire(ControllerFormulaire cf) {
        vFormulaire.setEventsBack(cf);

    }
}
