public class Inhabitable extends BiensImmobiliers {
    private int nbrFacade;
    private String statusJuridique;

    public Inhabitable(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction, int prixPropose,boolean negociable,String description,String date,String[] urlphoto,int nbr_facade,String status_juridique)
    {
        super(wilaya, superficie, proprietaire,natureTransaction, prixPropose, negociable, description, date, urlphoto);
        this.nbrFacade=nbr_facade;
        this.statusJuridique=status_juridique;
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
