public class Avendre extends NatureTransaction {
    private float calculerPrixGenerale(BiensImmobiliers biensImmobiliers)
    {   float prixPropose=biensImmobiliers.getPrixPropose(),prixCalcule=prixPropose,prixME=biensImmobiliers.getWilaya().getPrixMe();
        if(prixPropose<5000000)
        {
            if prixME<50000)prixCalcule += 0.03 * prixPropose;
            else prixCalcule += 0.035 * prixPropose ;
        }
        else if (prixPropose < 15000000)
        {
            if (prixME<50000) prixCalcule += 0.02 * prixPropose;
            else prixCalcule += 0.025 * prixPropose;
        }
        else {
            if (prixME<70000)prixCalcule += 0.01 * prixPropose;
            else prixCalcule += 0.02 * prixPropose;
        }
        return prixCalcule;
    }
    @Override
    public float calculerPrix(Appartement appartement) {
       float prixPropose=appartement.getPrixPropose(), prixCalcule;
       prixCalcule=calculerPrixGenerale(appartement);
       if (appartement.getEtage()<=2) prixCalcule +=50000;
       return prixCalcule;
    }

    @Override
    public float calculerPrix(Maison maison) {
        float prixPropose=maison.getPrixPropose(),prixCalcule;
        prixCalcule=calculerPrixGenerale(maison);

        return 0;
    }

    @Override
    public float calculerPrix(Inhabitable inhabitable) {
        return 0;
    }
}