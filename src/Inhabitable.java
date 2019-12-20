import java.util.Date;

public class Inhabitable extends BiensImmobiliers {
    private int nbrFacade;
    private String statusJuridique;

   

    public Inhabitable(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,
			float prixPropose,  boolean negociable, String description, Date date, String[] urlphoto,
			int nbrFacade, String statusJuridique) {
		super(wilaya, superficie, proprietaire, natureTransaction, prixPropose,  negociable, description,
				date, urlphoto);
		this.nbrFacade = nbrFacade;
		this.statusJuridique = statusJuridique;
	}

	@Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du Bien : Terrain");
        System.out.println("Les informations supplementaires sur le terrain :");
        System.out.println("Le nombre de façade : "+this.nbrFacade);
        System.out.println("Status juridique : "+this.statusJuridique);
    }

    public int getNbrFacade() {
        return nbrFacade;
    }
}
