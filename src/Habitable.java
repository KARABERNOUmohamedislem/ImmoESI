public class Habitable extends BiensImmobiliers {
    private int nb_pieces;
    private boolean meuble;

    public Habitable(Wilaya wilaya,int superficie,Proprietaire proprietaire,int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble)
    {
        super(wilaya, superficie, proprietaire, prixPropose, prixAgence, negociable, description, date, urlphoto);
        this.nb_pieces=nb_pieces;
        this.meuble=meuble;

    }
}
