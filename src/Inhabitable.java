public class Inhabitable extends BiensImmobiliers {
    private int nbrFacade;
    private String statusJuridique;

    public Inhabitable(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction, int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nbr_facade,String status_juridique)
    {
        super(wilaya, superficie, proprietaire,natureTransaction, prixPropose, prixAgence, negociable, description, date, urlphoto);
        this.nbrFacade=nbr_facade;
        this.statusJuridique=status_juridique;
    }
}
