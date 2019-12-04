public class Habitable extends BiensImmobiliers {
    private int nbPieces;
    private boolean meuble;

    public Habitable(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction, int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble)
    {
        super(wilaya, superficie, proprietaire,natureTransaction, prixPropose, prixAgence, negociable, description, date, urlphoto);
        this.nbPieces=nb_pieces;
        this.meuble=meuble;

    }
}
