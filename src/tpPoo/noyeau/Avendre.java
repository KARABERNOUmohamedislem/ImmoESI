package tpPoo.noyeau;

public class Avendre extends NatureTransaction {
    private static Nature nature=Nature.Avendre;
    
    @Override
    public void afficherNature() {
        System.out.println(nature);
    }
    public Nature getNature() {
		return nature;
	} 

    private float calculerPrixGenerale(BiensImmobiliers biensImmobiliers)
    {   float prixPropose=biensImmobiliers.getPrixPropose(),prixCalcule=prixPropose,prixME=biensImmobiliers.getWilaya().getPrixMe();
        if(prixPropose<5000000)
        {
            if( prixME < 50000) prixCalcule += 0.03 * prixPropose;
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
    public float calculerPrix(BiensImmobiliers b) {
        float a=0;
        if (b instanceof Appartement)
        {
            a= calculerPrix((Appartement)b);
        }
        else if (b instanceof Maison)
        {
            a= calculerPrix((Maison) b);
        }
        else if (b instanceof Inhabitable)
        {
            a= calculerPrix((Inhabitable) b);
        }
        else a=b.getPrixPropose();
        return a;
    }

    public float calculerPrix(Appartement appartement) {
       float prixPropose=appartement.getPrixPropose(), prixCalcule;
       prixCalcule=calculerPrixGenerale(appartement);
       if (appartement.getEtage()<=2) prixCalcule +=50000;
       return prixCalcule;
    }

    
    public float calculerPrix(Maison maison) {
        float prixPropose=maison.getPrixPropose(),prixCalcule;
        prixCalcule=calculerPrixGenerale(maison);
        if (maison.isGarage() || maison.isJardin() || maison.isPiscine()) prixCalcule += 0.005 * prixPropose;
        return prixCalcule;
    }


    
    public float calculerPrix(Inhabitable inhabitable) {
        float prixPropose=inhabitable.getPrixPropose(),prixCalcule;
        prixCalcule=calculerPrixGenerale(inhabitable);
        int a=inhabitable.getNbrFacade();
        if ( a > 1 ) prixCalcule += 0.005*prixPropose* a;
        return prixCalcule;
    }
}
