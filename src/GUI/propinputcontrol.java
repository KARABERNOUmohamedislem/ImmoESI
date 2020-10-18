package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import noyeu.Agence;
import noyeu.Proprietaire;



public class propinputcontrol {

       private Agence agence;
       private Proprietaire proprietaire;

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public TextField firstname;
    public TextField lastname;
    public TextField email;
    public TextField adress;
    public Button submit;



    public Proprietaire inputprop() {
        Proprietaire prop = new Proprietaire(lastname.getText(), firstname.getText(), email.getText(), adress.getText());
        this.agence.ajouterProp(prop);
        this.proprietaire = prop;
        System.out.printf(this.proprietaire.getNom());

        return prop;

    }




}
