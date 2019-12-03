public class Appartement extends Habitable {
    private int etage;
    private boolean duplex;

    public Appartement(Wilaya wilaya,int superficie,Proprietaire proprietaire,int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble,int etage,boolean duplex)
    {
        super(wilaya, superficie, proprietaire, prixPropose, prixAgence, negociable, description, date, urlphoto, nb_pieces, meuble);
        this.etage=etage;
        this.duplex=duplex;

    }
}
