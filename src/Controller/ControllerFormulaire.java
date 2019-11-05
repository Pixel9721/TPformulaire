package Controller;

import Model.ModelFormulaire;
import View.ViewHandler;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ControllerFormulaire implements EventHandler{
    private ViewHandler launcher;
    private ModelFormulaire model;

public ControllerFormulaire(ViewHandler viewHandler, ModelFormulaire model){
    this.model = model;
    this.launcher = viewHandler;
    this.launcher.setEventHandlerInscription(this);

    }

    @Override
    public void handle(Event event) {
        if (event.getSource().equals(launcher.getvInscription().getBtnStart())) {
            launcher.setConnexionView();
        }else if (event.getSource().equals(launcher.getvInscription().getQuit())) {
            System.exit(0);
        }
    }
}
