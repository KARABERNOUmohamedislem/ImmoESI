import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws InterruptedException {
    	Scanner h=new Scanner(System.in);
    	boolean quitter=false;

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
         Wilaya w2=new Wilaya("boumerdes", 60000);
         Wilaya w3=new Wilaya("adrar", 30000);
         Wilaya[] lesWilaya = {w1,w2,w3} ;


        Avendre n=new Avendre();
        Location l=new Location();
        Echange e3=new Echange(w3);
        Echange e2=new Echange(w2);
        
         Proprietaire p1 =new Proprietaire("aaa", "bbb", "aaabbb@esi.dz", "alger");
         Proprietaire p2 =new Proprietaire("ccc", "ddd", "cccddd@esi.dz", "ouadsmar");
         Proprietaire p3 =new Proprietaire("eee", "fff", "eeefff@esi.dz", "baraki");
         Proprietaire p4 =new Proprietaire("hhh", "jjj", "hhhjjj@esi.dz", "babzouar");
         try {
             BiensImmobiliers b1 = new Appartement(w2, 120, p2, n, 4000000, nego, "un beau appartement  ", d1, pictures, 4, false, 1, false, false);
             BiensImmobiliers b2 = new Maison(w3, 200, p1, n, 10000000, nonnego, "une belle maison", d2, pictures, 0, false, 1, false, true, false, 200);
             BiensImmobiliers b3 = new Inhabitable(w1, 500, p1, n, 20000000, nonnego, "une bonne terrain", d3, pictures, 3, "leagal a exploité");
             BiensImmobiliers b4 = new Appartement(w3, 100, p3, l, 40000, nonnego, "un beau appartement", d4, pictures, 3, false, 1, false, false);
             BiensImmobiliers b5 = new Maison(w2, 160, p3, l, 150000, nonnego, "ffffff", d5, pictures, 0, false, 1, false, false, true, 160);
             BiensImmobiliers b6 = new Appartement(w3, 50, p2, l, 600000, nonnego, "hhhhhh", d6, pictures, 1, false, 6, false, false);
             BiensImmobiliers b7 = new Inhabitable(w1, 650, p1, e3, 18000000, nonnego, "ffffff", d7, pictures, 1, "legal pour echange");
             BiensImmobiliers b8 = new Maison(w2, 200, p2, e2, 14000000, nonnego, "eeeee", d8, pictures, 0, false, 1, true, false, false, 200);


             BiensImmobiliers[] lesBien = {b5, b6, b7, b8};

             Agence a = new Agence("immoesi", lesWilaya);
             a.connecter("admin", "1234");
             a.ajouterBien(b1);
             a.ajouterBien(b2);
             a.ajouterBien(b3);
             a.ajouterBien(b4);
             a.ajouterBien(lesBien);

             while (!quitter) {

                 for (int i = 0; i < 50; ++i) System.out.println();
                 System.out.println("1-afficher tous les bien de l'agence\n2-afficher les bien d'un prop\n3-supprimer quelque bien\n4-archiver un bien \n5-recherche filtre\n6-quitter");
                 int q = h.nextInt();
                 switch (q) {
                     case 1:
                         a.affichage(); //les biens de l'agence
                         break;
                     case 2:
                         a.afficherBienProp(p2);//afficher les biens d'un prop
                         break;

                     case 3:
                         a.supprimerBien(b1);  //quand on supprrime tous les bien
                         a.supprimerBien(b6);  //d un prop alors ce dernier est automatiquement supprimer
                         a.supprimerBien(b8);
                         break;
                     case 4:
                         a.archiverBien(b3);
                         break;

                     case 5:
                         System.out.println("recherche par prix min 1-oui 0-non ");
                         int t = h.nextInt();
                         if (t == 1) {

                             System.out.println("donne moi le prix min");
                             PrixMin prixmin = new PrixMin(h.nextFloat());
                             cr.add(prixmin);
                         }
                         System.out.println("recherche par prix max 1-oui 0-non");
                         int t1 = h.nextInt();
                         if (t1 == 1) {
                             System.out.println("donne moi prix max");
                             PrixMax prixmax = new PrixMax(h.nextFloat());
                             cr.add(prixmax);
                         }
                         System.out.println("rechere par surface 1-oui 0-non");
                         if (h.nextInt() == 1) {
                             System.out.println("donne moi surface");
                             Surface surface = new Surface(h.nextFloat());
                             cr.add(surface);
                         }

                         a.affichage(cr);
                         break;
                     case 6:
                         quitter = true;
                         System.out.println("merci pour l'utilisation de notre programme.");
                     default:
                         System.out.println("faux");
                 }
                 System.out.println("continue ?\n1-yes\nautre pour non");
                 int w = h.nextInt();
                 if (w != 1) {
                     quitter = true;
                     System.out.println("merci pour l'utilisation de notre programme.");
                 }

             }
         }
        catch (notDuplex e)
        {
            System.out.println("un studio ne peut pas etre un duplex ");
        }
         catch (superficieHabitableNotSupTotale e)
         {
             System.out.println("erreur : le superficie habitable est plus grand que le totale");
         }

    } 	
}
