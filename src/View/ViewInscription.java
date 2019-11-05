package View;


import Controller.ControllerFormulaire;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class ViewInscription {
    private ViewHandler vhInscription;
    private Group root;
    private Text titre;
    private Label labelN, labelP,labelA, labelC,labelV, labelAM, labelL, labelMDP;
    private TextField textN, textP, textA, textC, textV,textAM,textL,textMDP;
    private PasswordField password;
    private Button btnvalider, quit;


    ViewInscription(ViewHandler vhInscription, Group root){
        this.vhInscription = vhInscription;
        this.root = root;

        titre = new Text(500, 200,"Bienvenue");
        titre.setFont(Font.font(50));
        labelN = new Label("Nom");
        labelN.setFont(Font.font(20));
        labelN.setLayoutX(250);
        labelN.setLayoutY(350);
        textN = new TextField();
        textN.setLayoutX(320);
        textN.setLayoutY(350);
        labelP = new Label("Prenom");
        labelP.setFont(Font.font(20));
        labelP.setLayoutX(250);
        labelP.setLayoutY(450);
        textP = new TextField();
        textP.setLayoutX(340);
        textP.setLayoutY(450);
        labelA = new Label("Adresse");
        labelA.setFont(Font.font(20));
        labelA.setLayoutX(250);
        labelA.setLayoutY(550);
        textA = new TextField();
        textA.setLayoutX(340);
        textA.setLayoutY(550);
        labelV = new Label("Ville");
        labelV.setFont(Font.font(20));
        labelV.setLayoutX(250);
        labelV.setLayoutY(650);
        textV = new TextField();
        textV.setLayoutX(320);
        textV.setLayoutY(650);
        labelC = new Label("C.Postal");
        labelC.setFont(Font.font(20));
        labelC.setLayoutX(550);
        labelC.setLayoutY(350);
        textC = new TextField();
        textC.setLayoutX(640);
        textC.setLayoutY(350);
        labelAM = new Label("Mail");
        labelAM.setFont(Font.font(20));
        labelAM.setLayoutX(550);
        labelAM.setLayoutY(450);
        textAM = new TextField();
        textAM.setLayoutX(620);
        textAM.setLayoutY(450);
        labelL = new Label("Login");
        labelL.setFont(Font.font(20));
        labelL.setLayoutX(550);
        labelL.setLayoutY(550);
        textL = new TextField();
        textL.setLayoutX(620);
        textL.setLayoutY(550);
        labelMDP = new Label("M.Passe");
        labelMDP.setFont(Font.font(20));
        labelMDP.setLayoutX(550);
        labelMDP.setLayoutY(650);
        password = new PasswordField();
        password.setLayoutX(640);
        password.setLayoutY(650);

        btnvalider= initButton(500,750,"Valider");
        quit = initButton(600,750,"EXIT");
        initView();

    }

    void initView(){
        root.getChildren().clear();
        root.getChildren().add(titre);
        root.getChildren().add(labelN);
        root.getChildren().add(labelP);
        root.getChildren().add(labelA);
        root.getChildren().add(labelV);
        root.getChildren().add(labelC);
        root.getChildren().add(labelL);
        root.getChildren().add(labelAM);
        root.getChildren().add(labelMDP);
        root.getChildren().add(textN);
        root.getChildren().add(textP);
        root.getChildren().add(textA);
        root.getChildren().add(textV);
        root.getChildren().add(textC);
        root.getChildren().add(textL);
        root.getChildren().add(textAM);
        root.getChildren().add(password);
        root.getChildren().add(btnvalider);
        root.getChildren().add(quit);
    }
    private Button initButton(int largeur, int hauteur, String texteDuBouton) {
        Button b = new Button();
        b.setLayoutX(largeur);
        b.setLayoutY(hauteur);
        b.setText(texteDuBouton);
        return b;
    }

    public void setEvents(ControllerFormulaire cf){
        btnvalider.setOnMouseClicked(cf);
        quit.setOnMouseClicked(cf);
    }

    public Button getBtnStart() {
        return btnvalider;
    }

    public Button getQuit(){
        return quit;
    }


}
