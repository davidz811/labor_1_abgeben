package controllerp;

import modellp.Fussball;
import viewp.Fussballview;

public class Fussballcontroller {

    private Fussball modell;
    private Fussball view;

    public Fussballcontroller(Fussball newModell , Fussball newView){
        this.modell = newModell;
        this.view = newView;
    }

    public void setPlayerId(String newPlayerId){
        modell.setPlayerId(newPlayerId);
    }

    public String getPlayerId(){
        return modell.getPlayerId();
    }

    public void setPlayerName(String newPlayerName){
         = newPlayerName;
    }
}
