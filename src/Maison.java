public class Maison extends Habitable {
    private int nbr_etage;
    private boolean garage;
    private boolean jardin;
    private boolean piscine;
    private int superficie_habitable;

    public Maison(Wilaya wilaya,int superficie,Proprietaire proprietaire,int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble,int nbr_etage,boolean garage,boolean jardin,boolean piscine,int superficie_habitable)
    {
        super(wilaya, superficie, proprietaire, prixPropose, prixAgence, negociable, description, date, urlphoto, nb_pieces, meuble);
        this.nbr_etage=nbr_etage;
        this.garage=garage;
        this.jardin=jardin;
        this.piscine=piscine;
        this.superficie_habitable=superficie_habitable;

    }

}
