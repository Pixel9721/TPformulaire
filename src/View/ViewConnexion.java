package View;

import Controller.ControllerConnexion;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class ViewConnexion {
    private ViewHandler vConnexion;
    private Group root;
    private Text titreC;
    private Label labelLC, labelMDPC;
    private TextField textLC;
    private PasswordField passwordC;
    private Button btnConnexion, btnretour;


    ViewConnexion(ViewHandler vConnexion, Group root){
        this.vConnexion = vConnexion;
        this.root = root;

        //initView1();

        titreC = new Text(500,200,"CONNEXION");
        titreC.setFont(Font.font(50));
        labelLC = new Label("Login");
        labelLC.setFont(Font.font(20));
        labelLC.setLayoutX(250);
        labelLC.setLayoutY(350);
        textLC = new TextField();
        textLC.setLayoutX(320);
        textLC.setLayoutY(350);
        labelMDPC = new Label("M.Passe");
        labelMDPC.setFont(Font.font(20));
        labelMDPC.setLayoutX(250);
        labelMDPC.setLayoutY(450);
        passwordC = new PasswordField();
        passwordC.setLayoutX(340);
        passwordC.setLayoutY(450);

        btnConnexion = initButton(500,750,"Connexion");
    }
    void initView(){
        root.getChildren().clear();
        root.getChildren().add(titreC);
        root.getChildren().add(labelLC);
        root.getChildren().add(textLC);
        root.getChildren().add(labelMDPC);
        root.getChildren().add(passwordC);
        root.getChildren().add(btnConnexion);
    }

    private Button initButton(int largeur, int hauteur, String texteDuBouton) {
        Button b = new Button();
        b.setLayoutX(largeur);
        b.setLayoutY(hauteur);
        b.setText(texteDuBouton);
        return b;
    }
    public void setEventsConnexion(ControllerConnexion cc) {
        btnConnexion.setOnMouseClicked(cc);
    }
    public Button getBtnConnexion(){return btnConnexion;}




