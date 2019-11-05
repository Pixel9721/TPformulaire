package Controller;

import Model.ModelConnexion;
import View.ViewHandler;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ControllerConnexion implements EventHandler {
    private ViewHandler launcher;
    private ModelConnexion model;


    public ControllerConnexion(ViewHandler viewHandler, ModelConnexion model){
        this.model = model;
        this.launcher = viewHandler;
        this.launcher.setEventHandlerConnexion(this);
    }


    @Override
    public void handle(Event event) {
        if (event.getSource().equals(launcher.getvConnexion().getBtnConnexion())){
            launcher.setProfileVeiw();
        }
    }
}
