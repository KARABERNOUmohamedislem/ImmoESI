public class Habitable extends BiensImmobiliers {
    private int nbPieces;
    private boolean meuble;

    public Habitable(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction, int prixPropose,boolean negociable,String description,String date,String[] urlphoto,int nb_pieces,boolean meuble)
    {
        super(wilaya, superficie, proprietaire,natureTransaction, prixPropose, negociable, description, date, urlphoto);
        this.nbPieces=nb_pieces;
        this.meuble=meuble;

    }

    @Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du Bien : Habitable");
        System.out.println("Les informations supplementaires sur le bien :");
        System.out.println("Le nombre des pieces : "+this.nbPieces);
        System.out.print("Meublé : ");
        if (this.meuble) System.out.println("Oui");
        else System.out.println("Non");

    }
}
