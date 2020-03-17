package tpPoo.UI;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import tpPoo.noyeau.BiensImmobiliers;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import java.util.ArrayList;

public class afficherBiens extends Stage {
    private ArrayList<BiensImmobiliers> listBien = new ArrayList<BiensImmobiliers>();
public afficherBiens(ArrayList<BiensImmobiliers> listBien){
    this.listBien=listBien;
    this.setTitle("Biens Immobiliers");
    this.setTitle("les biens");
    this.setResizable(true);
    //BiensImmobiliers model;
    HBox content=new HBox(10);
    VBox champs=new VBox(120);
    champs.setPadding(new Insets(20,20,20,20));
    champs.setAlignment(Pos.CENTER);
    Scene scene = new Scene(content, 500, 600);

    scene.setFill(Color.CHOCOLATE);

scene.setOnScroll(new EventHandler<ScrollEvent>() {
    @Override
    public void handle(ScrollEvent scrollEvent) {
        double y = champs.getLayoutY() - scrollEvent.getDeltaY();
        champs.setLayoutY(y);

    }
});


    double height = 700;

    ScrollBar sc = new ScrollBar();

    content.getChildren().add(sc);


    sc.setLayoutX(content.getWidth() - sc.getWidth());
    sc.setMin(0);
    sc.setOrientation(Orientation.VERTICAL);
    sc.setPrefHeight(height);
    sc.setMax(height * 2);

    sc.valueProperty().addListener(new ChangeListener<Number>() {
        public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val) {
            content.setLayoutY(-new_val.doubleValue());
        }
    });



    for (BiensImmobiliers model: listBien) {
        //Créer le layout manager qui contiendra les éléments de l'interface
        GridPane panel = new GridPane();
//Affichage du nom
        Label nom = creerMessage("Date");
        Label etuNom = creerMessage(model.getDate().toString());
        panel.add(nom, 0, 0);
        panel.add(etuNom, 1, 0);
//Affichage du prénom
        Label prenom = creerMessage("Superficie");
        Label etuPrenom = creerMessage("" + model.getSuperficie());
        panel.add(prenom, 0, 1);
        panel.add(etuPrenom, 1, 1);
//Affichage du matricule
        Label matricule = creerMessage("Prix");
        Label etuMat = creerMessage("" + model.getPrixAgence());
        panel.add(matricule, 0, 2);
        panel.add(etuMat, 1, 2);
//Affichage des notes
        Label notes = creerMessage("Wilaya");//new Label("Notes");
        Label etuNotes = creerMessage("" + model.getWilaya().toString());
        panel.add(notes, 0, 3);
        panel.add(etuNotes, 1, 3);
//Affichage de la moyenne
        Label moyenne = creerMessage("Moyenne");
        Label etuMoy = creerMessage("" + model.getNatureTransaction());
        panel.add(moyenne, 0, 4);
        panel.add(etuMoy, 1, 4);

        champs.getChildren().add(panel);
//bouton retour pour revenir à la fenêtre d'accueil
    }

    Button retour=new Button("Retour");
    retour.setPrefSize(140,40);
    retour.setFont(Font.font ("Verdana", 20));
    retour.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent actionEvent) {
            close();
        }});
    Button modifier=new Button("Modifier");
    modifier.setPrefSize(140,40);
    modifier.setFont(Font.font("Verdana", 20));
    modifier.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

            close();

        }
    });

    champs.getChildren().add(retour);
    champs.getChildren().add(modifier);
    content.getChildren().add(champs);

    scene.setFill(Color.AQUAMARINE);
    this.setScene(scene);
}



    public Label creerMessage(String s) {
        Label etiquette = new Label(s.toString());
        etiquette.setAlignment(Pos.BASELINE_LEFT);
        etiquette.setFont(Font.font ("Verdana", 18));
        etiquette.setLineSpacing(40);
        return etiquette;
    }
}
