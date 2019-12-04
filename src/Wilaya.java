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
}
