import java.util.Date;
import java.util.Scanner;

public class Maison extends Habitable {
    private int nbrEtage;
    private boolean garage;
    private boolean jardin;
    private boolean piscine;
    private int superficieHabitable;

  

    public Maison(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,
			float prixPropose,  boolean negociable, String description, Date date, String[] urlphoto,
			int nbPieces, boolean meuble, int nbrEtage, boolean garage, boolean jardin, boolean piscine,
			int superficieHabitable)throws superficieHabitableNotSupTotale,nbrEtageNegative,prixNegative
    {
        super(wilaya, superficie, proprietaire, natureTransaction, prixPropose,  negociable, description,
                date, urlphoto, nbPieces, meuble);
		if (superficieHabitable >superficie)throw new superficieHabitableNotSupTotale();
        if (nbrEtage<0) throw new nbrEtageNegative();
		this.nbrEtage = nbrEtage;
		this.garage = garage;
		this.jardin = jardin;
		this.piscine = piscine;
		this.superficieHabitable = superficieHabitable;
	}

	@Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du l'habitable : Maison");
        System.out.println("Les informations supplementaires sur la maison : ");
        System.out.println("Le nombre d'etage de la maison : "+this.nbrEtage);
        System.out.print("Piscine : ");
        if (this.piscine) System.out.println("Oui");
        else System.out.println("Non");
        System.out.print("Garage : ");
        if (this.garage) System.out.println("Oui");
        else System.out.println("Non");
        System.out.print("Jardin : ");
        if (this.jardin) System.out.println("Oui");
        else System.out.println("Non");
        if (this.jardin || this.piscine || this.garage) System.out.println("Superficie totale : "+this.superficieHabitable);
    }

    public boolean isGarage() {
        return garage;
    }

    public boolean isJardin() {
        return jardin;
    }

    public boolean isPiscine() {
        return piscine;
    }
    public void modifier()
    {
        super.modifier();
        Scanner h = new Scanner(System.in);
        System.out.println("modifier nbr etage 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("donne moi nbr etage");
            this.nbrEtage=h.nextInt();
        }
        System.out.println("modifier superficer habitable 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("donne moi la nouvelle surface h&bitable");
            this.superficieHabitable=h.nextInt();
        }
        System.out.println("modifier modifier garage 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("1-possede 0-possede pas");
            if(h.nextInt()==1)
            {
                this.garage=true;
            }
            else
            {
                this.garage=false;
            }
        }
        System.out.println("modifier modifier picine 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("1-possede 0-possede pas");
            if(h.nextInt()==1)
            {
                this.piscine=true;
            }
            else
            {
                this.piscine=false;
            }
        }
        System.out.println("modifier modifier jardin 1-oui 0-non");
        if (h.nextInt()==1)
        {
            System.out.println("1-possede 0-possede pas");
            if(h.nextInt()==1)
            {
                this.jardin=true;
            }
            else
            {
                this.jardin=false;
            }
        }
        this.setPrixAgence(this.getNatureTransaction().calculerPrix(this));

    }
}
