package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import noyeu.Agence;
import noyeu.Proprietaire;

public class searchpropcontrol {

    Agence agence;

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public TextField firstname;
    public TextField lastname;
    public TextField email;
    public TextField adress;
    public Button submit;

    public void inputprop(ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        Proprietaire prop =new Proprietaire(lastname.getText(),firstname.getText(),email.getText(),adress.getText());


        if(this.agence.checkProp(prop)==true)
        {     Proprietaire proprietaire=this.agence.chercherp(prop);
            System.out.println("5555555555555555555"+" "+proprietaire.getListBienPossede().size());
            window.affichagewindow(this.agence,proprietaire.getListBienPossede());
        }
        else
        {
            firstname.setStyle("-fx-text-fill:red;-fx-font-size:13px;");
            lastname.setStyle("-fx-text-fill:red;-fx-font-size:13px;");
            email.setStyle("-fx-text-fill:red;-fx-font-size:13px;");
            adress.setStyle("-fx-text-fill:red;-fx-font-size:13px;");

        }
    }
}
