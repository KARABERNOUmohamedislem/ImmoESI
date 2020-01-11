import java.util.Date;
import java.util.Scanner;

public class Appartement extends Habitable {
    private int etage;
    private boolean duplex;
    private boolean ascenseur;

    public Appartement(Wilaya wilaya,float superficie,Proprietaire proprietaire,NatureTransaction natureTransaction,int prixPropose,boolean negociable,String description,Date date,String[] urlphoto,int nb_pieces,boolean meuble,int etage,boolean duplex,boolean ascenseur) throws notDuplex,prixNegative
    {
        super(wilaya, superficie, proprietaire, natureTransaction, prixPropose, negociable, description, date, urlphoto, nb_pieces, meuble);
        if (nb_pieces==1 && duplex) throw new notDuplex();
            this.etage = etage;
            this.duplex = duplex;
            this.ascenseur = ascenseur;

    }

    @Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du l'habitable : Appartement");
        System.out.println("Les informations supplementaires sur l'apparetement");
        System.out.println("Nombre d'etage : "+this.etage);
        if (this.duplex)System.out.println("Duplex");
        else System.out.println("Simplex");
        System.out.print("Ascenseur : ");
        if (this.ascenseur) System.out.println("Oui");
        else System.out.println("Non");
    }

    public int getEtage() {
        return etage;
    }

    public boolean isAscenseur() {
        return ascenseur;
    }
    public void modifier()
    {
        super.modifier();
        Scanner h=new Scanner(System.in);
        System.out.println("modifier modifier duplex 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("1-duplex 0-non dup");
            if(h.nextInt()==1)
            {
                this.duplex=true;
            }
            else
            {
                this.duplex=false;
            }
        }
        System.out.println("modifier modifier assenceur 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("1-possede 0-possede pas");
            if(h.nextInt()==1)
            {
                this.ascenseur=true;
            }
            else
            {
                this.ascenseur=false;
            }
        }
        System.out.println("modifier  etage 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("donne moi le neuveau etage");
            this.etage=h.nextInt();
        }
        this.setPrixAgence(this.getNatureTransaction().calculerPrix(this));

    }
}
