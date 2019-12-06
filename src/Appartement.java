public class Appartement extends Habitable {
    private int etage;
    private boolean duplex;
    private boolean ascenseur;

    public Appartement(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction,int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble,int etage,boolean duplex,boolean ascenseur)
    {
        super(wilaya, superficie, proprietaire,natureTransaction, prixPropose, prixAgence, negociable, description, date, urlphoto, nb_pieces, meuble);
        this.etage=etage;
        this.duplex=duplex;
        this.ascenseur=ascenseur;

    }

    @Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du l'habitable : Appartement");
        System.out.println("Les informations supplementaires sur l'apparetement");
        System.out.println("Nombre d'etage : "+this.etage);
        if (this.duplex)System.out.println("Duplex");
        else System.out.println("Simplex");
        System.out.print("Ascenseur : ");
        if (this.ascenseur) System.out.println("Oui");
        else System.out.println("Non");
    }

    public int getEtage() {
        return etage;
    }

    public boolean isAscenseur() {
        return ascenseur;
    }
}
