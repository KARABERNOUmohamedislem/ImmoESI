public class Maison extends Habitable {
    private int nbrEtage;
    private boolean garage;
    private boolean jardin;
    private boolean piscine;
    private int superficieHabitable;

    public Maison(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction,int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble,int nbr_etage,boolean garage,boolean jardin,boolean piscine,int superficie_habitable)
    {
        super(wilaya, superficie, proprietaire,natureTransaction, prixPropose, prixAgence, negociable, description, date, urlphoto, nb_pieces, meuble);
        this.nbrEtage=nbr_etage;
        this.garage=garage;
        this.jardin=jardin;
        this.piscine=piscine;
        this.superficieHabitable=superficie_habitable;

    }

}
