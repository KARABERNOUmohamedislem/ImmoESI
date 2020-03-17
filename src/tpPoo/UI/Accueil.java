package tpPoo.UI;
import tpPoo.noyeau.*;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.text.Font;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
public class Accueil extends Stage{
    private Agence model;

    public Accueil(Agence model){
        this.model=model;

        BorderPane contenu = new BorderPane();
        contenu.setPadding(new Insets(20,20,20,20));
        Label etiq=creerMsg("Bienvenue,\n Veuillez Choisir La Fontion Voulue :");
        contenu.setTop(etiq);
        VBox champs=new VBox(120);
        champs.setPadding(new Insets(20,20,20,20));
        champs.setAlignment(Pos.CENTER);
        FlowPane commandes = new FlowPane();
        commandes.setAlignment(Pos.CENTER);
        commandes.setHgap(70);
        Button rechercheBouton=creerBouton("Afficher");
        Button quitterBouton=creerBouton("Quitter");
        commandes.getChildren().add(rechercheBouton);
        commandes.getChildren().add(quitterBouton);
        champs.getChildren().add(commandes);
        contenu.setCenter(champs);
        this.setScene(new Scene(contenu,900,400));
    }
    public Label creerMsg(String s){

        Label etiquette = new Label(s);
        etiquette.setAlignment(Pos.CENTER);
        etiquette.setFont(Font.font ("Verdana", 20));
        etiquette.setLineSpacing(20);
        return etiquette;
    }
    public Button creerBouton(String s){
        Button button= new Button(s);
        button.setOnAction(actionEvent -> {
            if (button.getText().equals("Afficher")){
                afficherBiens afficherBiens=new afficherBiens(model.getListBien());
                afficherBiens.show();
            }
            else {
                close();
            }
        });
    return button;
    }
}

