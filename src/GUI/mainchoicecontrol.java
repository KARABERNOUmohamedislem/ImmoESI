package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import noyeu.Agence;

public class mainchoicecontrol {
    public Button displayAllGoods;
    public Button displayOwnerGood;
    public Button deletGoods;
    public Button archiveGoods;
    public Button filteredSearch;
    public Button modifieGoods;
    public Button disconnect;
    public Button addgoods;
    public Button msg;
    Agence agence;
    Stage window;

    public void setWindow(Stage window) {
        this.window = window;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public void displayallgoods(ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.affichagewindow(this.agence,this.agence.getListBien());
    }




    public void displayownergoods(ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.searchprop(this.agence);

    }



    public void deletgoods(ActionEvent actionEvent) {
    }



    public void archivegoods(ActionEvent actionEvent) {
    }



    public void modifiegoods(ActionEvent actionEvent) {
    }

    public void disconnect(ActionEvent actionEvent) {
        stageaffich stg=new stageaffich();
        stg.firstwindow(this.window,this.agence);
    }

    public void addgoods(ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.addgood(this.agence);
    }

    public void filtre(ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        window.recherchfiltr(this.agence);
    }

    public void affmsg(ActionEvent actionEvent) {
        stageaffich stg =new stageaffich();
        stg.affmsg(this.agence);
    }
}
