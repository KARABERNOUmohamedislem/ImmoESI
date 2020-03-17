package tpPoo.noyeau;

import java.util.Date;

public class Habitable extends BiensImmobiliers {
    private int nbPieces;
    private boolean meuble;

    

    public Habitable(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,float prixPropose,  boolean negociable, String description, Date date, String[] urlphoto,int nbPieces, boolean meuble)throws prixNegative
    {
		super(wilaya, superficie, proprietaire, natureTransaction, prixPropose,  negociable, description,date, urlphoto);
		this.nbPieces = nbPieces;
		this.meuble = meuble;
	}

	@Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du Bien : tpPoo.noyeau.Habitable");
        System.out.println("Les informations supplementaires sur le bien :");
        System.out.println("Le nombre des pieces : "+this.nbPieces);
        System.out.print("meuble inclue  : ");
        if (this.meuble) System.out.println("Oui");
        else System.out.println("Non");

    }

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
    
    
}
