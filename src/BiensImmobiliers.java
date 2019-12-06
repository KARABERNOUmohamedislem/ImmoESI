public class BiensImmobiliers {
    private Wilaya wilaya;
    private int superficie;
    private Proprietaire proprietaire;
    private NatureTransaction natureTransaction;
    private float PrixPropose;
    private float PrixAgence;
    private boolean negociable;
    private String description;
    private String date;
    private String[] urlphoto;

    public BiensImmobiliers(Wilaya wilaya,int superficie,Proprietaire proprietaire,NatureTransaction natureTransaction, int prixPropose,int prixAgence,boolean negociable,String description,String date,String[] urlphoto)
    {
        this.wilaya=wilaya;
        this.superficie=superficie;
        this.proprietaire=proprietaire;
        this.natureTransaction=natureTransaction;
        this.PrixPropose=prixPropose;
        this.PrixAgence=prixAgence;
        this.negociable=negociable;
        this.description=description;
        this.date=date;
        this.urlphoto=urlphoto;
    }
    public void afficherBien()
    {
        this.wilaya.afficherNomWilaya();
        System.out.println("Superficie : "+ this.superficie);
        System.out.println("Date d'ajout : "+this.date);
        System.out.println("Description : "+this.description);
        System.out.print("Nature de transaction voulu : ");
        this.natureTransaction.afficherNature();
        System.out.println("Prix : "+this.PrixAgence);
        if (this.negociable) System.out.println("Negociable");
        else System.out.println("Non Negociable");

    }

    public Wilaya getWilaya() {
        return wilaya;
    }

    public float getPrixPropose() {
        return PrixPropose;
    }

    public int getSuperficie() {
        return superficie;
    }
}
