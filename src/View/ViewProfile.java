package View;

import Controller.ControllerProfil;
import javafx.scene.Group;
import javafx.scene.control.Button;

public class ViewProfile {
    private ViewHandler vhProfil;
    private Group root;
    private Button btnRetour;


    public ViewProfile(ViewHandler vhProfil, Group root) {
        this.vhProfil = vhProfil;
        this.root = root;

        btnRetour = initButton(500,200, "Retour");
    }
    private Button initButton(int largeur, int hauteur, String texteDuBouton) {
        Button b = new Button();
        b.setLayoutX(largeur);
        b.setLayoutY(hauteur);
        b.setText(texteDuBouton);
        return b;
    }
    void initView(){
        root.getChildren().clear();
        root.getChildren().add(btnRetour);
    }
    public void setEventsProfil(ControllerProfil cp) {
    }


}

