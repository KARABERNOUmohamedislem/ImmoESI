package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import noyeu.Agence;

public class addGoodController {
    public Button addhouse;
    public Button addaprt;
    public Button addterrain;
    Agence agence;

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public void addhouse(ActionEvent actionEvent) {
        stageaffich stg =new stageaffich();
        stg.addhouse(this.agence);
    }

    public void addtrn(ActionEvent actionEvent) {
        stageaffich stg =new stageaffich();
        stg.addtrn(this.agence);
    }

    public void addaptm(ActionEvent actionEvent) {
        stageaffich stg =new stageaffich();
        stg.addaprtm(this.agence);
    }


}
