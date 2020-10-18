package noyeu;

import java.util.Objects;

public class Wilaya extends Critere {
    private String NomWilaya;
    private float PrixMe;

    public Wilaya(String NomWilaya,int prix)
    {
        this.NomWilaya=NomWilaya;
        this.PrixMe=prix;
    }

    public String getNomWilaya() {
        return NomWilaya;
    }

    public Wilaya() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wilaya wilaya = (Wilaya) o;
        return NomWilaya.equals(wilaya.NomWilaya);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NomWilaya);
    }

    public float getPrixMe() {
        return PrixMe;
    }
    public void afficherNomWilaya()
    {
        System.out.println("Wilaya : "+this.NomWilaya);
    }
}
