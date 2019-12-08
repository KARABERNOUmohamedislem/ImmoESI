public class Maison extends Habitable {
    private int nbrEtage;
    private boolean garage;
    private boolean jardin;
    private boolean piscine;
    private int superficieHabitable;

    public Maison(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction,int prixPropose,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble,int nbr_etage,boolean garage,boolean jardin,boolean piscine,int superficie_habitable)
    {
        super(wilaya, superficie, proprietaire,natureTransaction, prixPropose, negociable, description, date, urlphoto, nb_pieces, meuble);
        this.nbrEtage=nbr_etage;
        this.garage=garage;
        this.jardin=jardin;
        this.piscine=piscine;
        this.superficieHabitable=superficie_habitable;

    }

    @Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du l'habitable : Maison");
        System.out.println("Les informations supplementaires sur la maison : ");
        System.out.println("Le nombre d'etage de la maison : "+this.nbrEtage);
        System.out.println("Piscine : ");
        if (this.piscine) System.out.println("Oui");
        else System.out.println("Non");
        System.out.println("Garage : ");
        if (this.garage) System.out.println("Oui");
        else System.out.println("Non");
        System.out.println("Jardin : ");
        if (this.jardin) System.out.println("Oui");
        else System.out.println("Non");
        if (this.jardin || this.piscine || this.garage) System.out.println("Superficie totale : "+this.superficieHabitable);
    }

    public boolean isGarage() {
        return garage;
    }

    public boolean isJardin() {
        return jardin;
    }

    public boolean isPiscine() {
        return piscine;
    }
}
