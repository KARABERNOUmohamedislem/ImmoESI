public class Inhabitable extends BiensImmobiliers {
    private int nbr_facade;
    private String status_juridique;

    public Inhabitable(Wilaya wilaya,int superficie,Proprietaire proprietaire,int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nbr_facade,String status_juridique)
    {
        super(wilaya, superficie, proprietaire, prixPropose, prixAgence, negociable, description, date, urlphoto);
        this.nbr_facade=nbr_facade;
        this.status_juridique=status_juridique;
    }
}
