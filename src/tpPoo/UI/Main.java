package tpPoo.UI;
import tpPoo.noyeau.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javafx.application.Application;
import javafx.stage.Stage;
public class Main extends Application {
    public void start(Stage primaryStage) {

        boolean nego =true;
        boolean nonnego=false;
        String[] pictures =new String[58] ;
        ArrayList<Critere> cr =new ArrayList<Critere>();


        Date d1=new Date();
        Date d2=new Date();
        Date d3=new Date();
        Date d4=new Date();
        Date d5=new Date();
        Date d6=new Date();
        Date d7=new Date();
        Date d8=new Date();
        Wilaya w1=new Wilaya("alger", 100000);
        Wilaya w2=new Wilaya("boumerdes", 30000);
        Wilaya w3=new Wilaya("adrar", 60000);
        Wilaya[] lesWilaya = {w1,w2,w3} ;


        Avendre n=new Avendre();
        Location l=new Location();
        Echange e3=new Echange(w3);
        Echange e2=new Echange(w2);

        Proprietaire p1 =new Proprietaire("aaa", "bbb", "aaabbb@esi.dz", "alger");
        Proprietaire p2 =new Proprietaire("ccc", "ddd", "cccddd@esi.dz", "ouadsmar");
        Proprietaire p3 =new Proprietaire("eee", "fff", "eeefff@esi.dz", "baraki");
        Proprietaire p4 =new Proprietaire("hhh", "jjj", "hhhjjj@esi.dz", "babzouar");
        BiensImmobiliers b1=new BiensImmobiliers();
        BiensImmobiliers b2=new BiensImmobiliers();
        BiensImmobiliers b3=new BiensImmobiliers();
        BiensImmobiliers b4=new BiensImmobiliers();
        BiensImmobiliers b5=new BiensImmobiliers();
        BiensImmobiliers b6=new BiensImmobiliers();
        BiensImmobiliers b7=new BiensImmobiliers();
        BiensImmobiliers b8=new BiensImmobiliers();
        BiensImmobiliers b9=new BiensImmobiliers();
        try {
            b1 = new Appartement(w2, 120, p2, n, 4000000, nego, "un beau appartement  ", d1, pictures, 4, false, 1, false, false);
            b2 = new Maison(w3, 200, p1, n, 10000000, nonnego, "une belle maison", d2, pictures, 0, false, 1, false, true, false, 200);
            b3 = new Inhabitable(w1, 500, p1, n, 20000000, nonnego, "une bonne terrain", d3, pictures, 3, "leagal a exploité");
            b4 = new Appartement(w3, 100, p3, l, 40000, nonnego, "un beau appartement", d4, pictures, 3, false, 1, false, false);
            b5 = new Maison(w2, 160, p3, l, 150000, nonnego, "ffffff", d5, pictures, 0, false, 1, false, false, true, 160);
            b6 = new Appartement(w3, 50, p2, l, 600000, nonnego, "hhhhhh", d6, pictures, 1, false, 6, false, false);
            b7 = new Inhabitable(w1, 650, p1, e3, 18000000, nonnego, "ffffff", d7, pictures, 1, "legal pour echange");
            b8 = new Maison(w2, 200, p2, e2, 14000000, nonnego, "eeeee", d8, pictures, 0, false, 1, true, false, false, 200);
            b9 = new Maison(w2, 200, p2, e2, 14000000, nonnego, "eeeee", d8, pictures, 0, false, 1, true, false, false, 200);

        }
        catch (notDuplex e)
        {
            System.out.println("un studio ne peut pas etre un duplex .");
        }
        catch (superficieHabitableNotSupTotale e)
        {
            System.out.println("erreur : le superficie habitable est plus grand que le totale.");
        }
        catch (nbrFacadeNegative e)
        {
            System.out.println("erreur: le nombre de facade ne peut pas etre inferieur a 1.");

        }
        catch (nbrEtageNegative e)
        {
            System.out.println("erreur: le nombre d'etage ne peut pas etre negative.");
        }
        catch (prixNegative e)
        {
            System.out.println("erreur: le prix ne peut pas etre negative.");
        }


        BiensImmobiliers[] lesBien = {b5, b6, b7, b8};

        Agence a = new Agence("immoesi", lesWilaya);
        a.connecter("admin", "1234");
        a.ajouterBien(b1);
        a.ajouterBien(b2);
        a.ajouterBien(b3);
        a.ajouterBien(b4);
        a.ajouterBien(lesBien);
        a.deconnecter();

        //=====================================================================================================

         Accueil stage=new Accueil(a);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}