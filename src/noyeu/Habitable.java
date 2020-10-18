package noyeu;
import java.util.Date;

public class Habitable extends BiensImmobiliers {
    private int nbPieces;
    private boolean meuble;

    

   /* public Habitable(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,float prixPropose,  boolean negociable, String description, Date date, String[] urlphoto,int nbPieces, boolean meuble)throws prixNegative
    {
		super(wilaya, superficie, proprietaire, natureTransaction, prixPropose,  negociable, description,date, urlphoto);
		this.nbPieces = nbPieces;
		this.meuble = meuble;
	}*/

    public Habitable(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,float prixPropose,  boolean negociable, String description, Date date, String[] urlphoto,int nbPieces, boolean meuble){
        super(wilaya, superficie, proprietaire, natureTransaction, prixPropose, negociable, description, date, urlphoto);
        this.nbPieces = nbPieces;
        this.meuble = meuble;
    }

	@Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du Bien : Habitable");
        System.out.println("Les informations supplementaires sur le bien :");
        System.out.println("Le nombre des pieces : "+this.nbPieces);
        System.out.print("meuble inclue  : ");
        if (this.meuble) System.out.println("Oui");
        else System.out.println("Non");

    }


    public String affBien()
    {
        String s;
        s=super.affBien();
        s=s+"Type du Bien : Habitable"+"\n";
        s=s+"Les informations supplementaires sur le bien :"+"\n";
        s=s+"Le nombre des pieces : "+this.nbPieces+"\n";
        s=s+"meuble inclue  : ";
        if (this.meuble) s=s+"Oui"+"\n";
        s=s+"Non"+"\n";
        return s;

    }

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
    
    
}
