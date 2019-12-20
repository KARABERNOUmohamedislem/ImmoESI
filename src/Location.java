public class Location extends NatureTransaction {
    private static Nature nature=Nature.Location;
    @Override
    public void afficherNature() {
        System.out.println(nature);
    }

    private float calculerPrixGenerale(BiensImmobiliers biensImmobiliers)
    { float prixPropose=biensImmobiliers.getPrixPropose(),prixCalcule=prixPropose,prixME=biensImmobiliers.getWilaya().getPrixMe();
        float superficie=biensImmobiliers.getSuperficie();
        if (superficie < 60)
        {
            if (prixME<50000) prixCalcule+= 0.001 *prixPropose;
            else prixCalcule+= 0.0015 *prixPropose;
        }
        else if (superficie<150)
        {
            if (prixME<50000) prixCalcule+= 0.002 *prixPropose;
            else prixCalcule+= 0.0025 *prixPropose;
        }
        else
        {
            if (prixME<50000) prixCalcule+= 0.003 *prixPropose;
            else prixCalcule+= 0.0035 *prixPropose;
        }
        return prixCalcule;
    }

    @Override
    public float calculerPrix(BiensImmobiliers b) {
        float a=0;
        if (b instanceof Appartement)
        {
            a= calculerPrix((Appartement)b);
        }
        if (b instanceof Maison)
        {
            a= calculerPrix((Maison) b);
        }
        if (b instanceof Inhabitable)
        {
            a= calculerPrix((Inhabitable) b);
        }
        else a=b.getPrixPropose();
        return a;
    }
    public float calculerPrix(Appartement appartement) {
        float prixPropose=appartement.getPrixPropose(),prixCalcule=calculerPrixGenerale(appartement);
        float etage=appartement.getEtage(),superficie=appartement.getSuperficie();
        boolean ascen=appartement.isAscenseur();
        if (etage<=2) prixCalcule +=50000;
        else if (etage>= 6 && !ascen)prixCalcule -= 500*superficie;
        return prixCalcule;
    }

    public float calculerPrix(Maison maison) {
        float prixPropose=maison.getPrixPropose(),prixCalcule=calculerPrixGenerale(maison);
        if (maison.isPiscine()) prixCalcule+=50000;
        return prixCalcule;
    }

   
    public float calculerPrix(Inhabitable inhabitable) {
        return calculerPrixGenerale(inhabitable);
    }
}
