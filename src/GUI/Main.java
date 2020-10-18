package GUI;

import javafx.application.Application;
import javafx.stage.Stage;
import noyeu.*;

import java.util.ArrayList;
import java.util.Date;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Wilaya w1 = new Wilaya("alger", 100000);
        Avendre n = new Avendre();
        Location l = new Location();

        boolean nego = true;
        boolean nonnego = false;
        String[] pictures = new String[58];
        ArrayList<Critere> cr = new ArrayList<Critere>();


        Date d1 = new Date(2016, 1, 25);
        Date d2 = new Date(2019, 2, 13);
        Date d3 = new Date(2005, 9, 10);
        Date d4 = new Date(2020, 11, 28);
        Date d5 = new Date(2008, 12, 12);
        Date d6 = new Date(2012, 12, 12);
        Date d7 = new Date(2011, 11, 11);
        Date d8 = new Date(2010, 10, 10);

        Wilaya w2 = new Wilaya("boumerdes", 30000);
        Wilaya w3 = new Wilaya("adrar", 60000);
        Wilaya[] lesWilaya = {w1, w2, w3};
        Echange e3=new Echange(w3);
        Echange e2=new Echange(w2);


        Proprietaire p1 = new Proprietaire("aaa", "bbb", "aaabbb@esi.dz", "alger");
        Proprietaire p2 = new Proprietaire("ccc", "ddd", "cccddd@esi.dz", "ouadsmar");
        Proprietaire p3 = new Proprietaire("eee", "fff", "eeefff@esi.dz", "baraki");
        Proprietaire p4 = new Proprietaire("hhh", "jjj", "hhhjjj@esi.dz", "babzouar");

        BiensImmobiliers b1 = null;
        BiensImmobiliers b2 = null;
        BiensImmobiliers b3 = null;
        BiensImmobiliers b5 = new BiensImmobiliers();
        BiensImmobiliers b6 = new BiensImmobiliers();
        BiensImmobiliers b7 = new BiensImmobiliers();
        BiensImmobiliers b8 = new BiensImmobiliers();
        BiensImmobiliers b9 = new BiensImmobiliers();
        BiensImmobiliers b4 = null;
        try {

            b1 = new Appartement(w2, 120, p2, n, 4000000, nego, "un beau appartement  ", d1, pictures, 4, false, 1, false, false);
            b2 = new Maison(w3, 200, p1, n, 10000000, nonnego, "une belle maison", d2, pictures, 0, false, 1, false, true, false, 200);
            b3 = new Inhabitable(w1, 500, p1, n, 20000000, nonnego, "une bonne terrain", d3, pictures, 3, "leagal a exploit�");
            b4 = new Appartement(w3, 100, p3, l, 40000, nonnego, "un beau appartement", d4, pictures, 3, false, 1, false, false);
            b5 = new Maison(w2, 160, p3, l, 150000, nonnego, "ffffff", d5, pictures, 0, false, 1, false, false, true, 160);
            b6 = new Appartement(w3, 50, p2, l, 600000, nonnego, "hhhhhh", d6, pictures, 1, false, 6, false, false);
            b7 = new Inhabitable(w1, 650, p1, e3, 18000000, nonnego, "ffffff", d7, pictures, 1, "legal pour echange");
            b8 = new Maison(w2, 200, p2, e2, 14000000, nonnego, "eeeee", d8, pictures, 0, false, 1, true, false, false, 200);
            b9 = new Maison(w2, 200, p2, e2, 14000000, nonnego, "eeeee", d8, pictures, 0, false, 1, true, false, false, 200);
        } catch (Exception m) {
            System.out.printf("batata");
        }
        Agence a = new Agence("immoesi", lesWilaya);
        a.setConnecte(true);
        a.setListWilaya(lesWilaya);
        a.ajouterBien(b1);
        a.ajouterBien(b2);
        a.ajouterBien(b3);
        a.ajouterBien(b4);
        a.ajouterBien(b5);
        a.ajouterBien(b6);
        a.ajouterBien(b7);
        a.ajouterBien(b8);
        a.ajouterBien(b9);
        stageaffich stg = new stageaffich();
        b1.msg.add("fghjkllkjhgfdfghjk");
        //
        Stage wind = new Stage();
        stg.firstwindow(wind, a);


        /*FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("affichage.fxml"));
        Parent root;
        try {
            root = load.load();
            Scene f = new Scene(root);
            primaryStage.setScene(f);
            controlAffichage g = load.getController();//this how we creat the controller

            g.setAgence(a);//we put the agency in a attribut in tha controlelr
            g.setTexttodisplay(a.GUIaffichage());
            primaryStage.show();
            System.out.printf(a.toString());
            System.out.printf(a.GUIaffichage());


        } catch (Exception p) {
            System.out.printf("ggg");
        }*/


    }


    public static void main(String[] args) {
        launch(args);
    }
}
