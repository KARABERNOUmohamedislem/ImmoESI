public class Echange extends NatureTransaction {
    private static Nature nature=Nature.Echange;
    
    public void afficherNature() {
        System.out.println(nature);
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

