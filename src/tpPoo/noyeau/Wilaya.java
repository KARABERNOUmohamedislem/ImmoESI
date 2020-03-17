package tpPoo.noyeau;

public class Wilaya {
    private String NomWilaya;
    private float PrixMe;

    public Wilaya(String NomWilaya,int prix)
    {
        this.NomWilaya=NomWilaya;
        this.PrixMe=prix;
    }

    public float getPrixMe() {
        return PrixMe;
    }
    public void afficherNomWilaya()
    {
        System.out.println("tpPoo.noyeau.Wilaya : "+this.NomWilaya);
    }
}
