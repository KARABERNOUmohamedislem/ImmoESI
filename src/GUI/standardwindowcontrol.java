package GUI;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import noyeu.Agence;

import java.awt.event.ActionEvent;

public class standardwindowcontrol {
   public Button afficher;
    public Button affichprop;
    public Button recherchfiltr;
    public Button deconnect;
    Agence agence;
    Stage window;

   public void setWindow(Stage window) {
        this.window = window;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }





    public void filtre(ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.recherchfiltr(this.agence);
    }

    public void dis(ActionEvent actionEvent) {
        stageaffich stg=new stageaffich();
        stg.firstwindow(this.window,this.agence);
    }

    public void affichertou(javafx.event.ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.affichagewindowstan(this.agence,this.agence.getListBien());
    }

    public void afficherprop(javafx.event.ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.searchprop(this.agence);
    }

    public void filtre(javafx.event.ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.recherchfiltr(this.agence);
    }

    public void dis(javafx.event.ActionEvent actionEvent) {
        stageaffich stg=new stageaffich();
        stg.firstwindow(this.window,this.agence);

    }
}
