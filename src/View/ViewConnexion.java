package View;

import Controller.ControllerConnexion;
import Controller.ControllerFormulaire;
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
    private Text titre;
    private Label labelL, labelMDP;
    private TextField textL;
    private PasswordField password;
    private Button btnConnexion;

    ViewConnexion(ViewHandler vConnexion, Group root){
        this.vConnexion = vConnexion;
        this.root = root;

        labelL = new Label("Login");
        labelL.setFont(Font.font(20));
        labelL.setLayoutX(250);
        labelL.setLayoutY(350);
        textL = new TextField();
        textL.setLayoutX(320);
        textL.setLayoutY(350);
        labelMDP = new Label("M.Passe");
        labelMDP.setFont(Font.font(20));
        labelMDP.setLayoutX(250);
        labelMDP.setLayoutY(450);
        password = new PasswordField();
        password.setLayoutX(340);
        password.setLayoutY(450);

        btnConnexion = initButton(500,750,"connexion");

        initView();
    }
    void initView(){
        root.getChildren().clear();
        root.getChildren().add(titre);
        root.getChildren().add(labelL);
        root.getChildren().add(textL);
        root.getChildren().add(labelMDP);
        root.getChildren().add(password);
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

}
