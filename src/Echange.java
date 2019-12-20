public class Echange extends NatureTransaction {
    private static Nature nature=Nature.Echange;
    
    public void afficherNature() {
        System.out.println(nature);
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
        Avendre avendre=new Avendre();
        return avendre.calculerPrix(appartement);

    }

    
    public float calculerPrix(Maison maison) {
        Avendre avendre=new Avendre();
        return avendre.calculerPrix(maison);
    }

  
    public float calculerPrix(Inhabitable inhabitable) {
        Avendre avendre=new Avendre();
        return avendre.calculerPrix(inhabitable);
    }
}

