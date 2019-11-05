package Controller;

import Model.ModelConnexion;
import Model.ModelProfil;
import View.ViewHandler;

public class ControllerProfil {

    private ViewHandler launcher;
    private ModelConnexion model;

    public ControllerProfil(ViewHandler viewHandler, ModelProfil modelProfil) {
        this.model = model;
        this.launcher = viewHandler;
        this.launcher.setEventHandlerProfil(this);
    }
}

