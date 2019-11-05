package View;

import Controller.ControllerConnexion;
import Controller.ControllerFormulaire;
import Controller.ControllerProfil;
import Model.ModelConnexion;
import Model.ModelFormulaire;
import Model.ModelProfil;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.plaf.SplitPaneUI;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private Scene scene;
    private Group root;
    private ViewInscription vFormulaire;
    private ViewConnexion vConnexion;
    private ViewProfile vProfile;
    private ModelFormulaire modelFormulaire;
    private ModelConnexion modelConnexion;
    private ModelProfil modelProfil;

    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;


        root = new Group();
        scene = new Scene(root,1200, 900);

        modelFormulaire = new ModelFormulaire();
        modelConnexion = new ModelConnexion();
        modelProfil = new ModelProfil();

        vFormulaire = new ViewInscription(this, root);
        vConnexion = new ViewConnexion(this, root);
        //vProfile = new ViewProfile(this, root);

        ControllerFormulaire controllerFormulaire = new ControllerFormulaire(this, modelFormulaire);
        ControllerConnexion controllerConnexion = new ControllerConnexion(this, modelConnexion);
        //ControllerProfil controllerProfil =new ControllerProfil(this, modelProfil);

        primaryStage.setTitle("TPFormulaire");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    /*public Object getvGame() {

    }*/

    public void setEventHandlerConnexion(ControllerConnexion cc) {
        vConnexion.setEventsConnexion(cc);
    }
    /*public void setHandlerInscription(ControllerFormulaire cf){
        vFormulaire.setEventsInscription(cf);
    }*/
   /* public void setEventHandlerProfil(ControllerProfil cp){
        vProfile.setEventsProfil(cp);
    }
*/    public ViewInscription getvInscription() {
        return vFormulaire;
    }



}
