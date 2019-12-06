public class Echange extends NatureTransaction {
    private static Nature nature=Nature.Echange;
    @Override
    public void afficherNature() {
        System.out.println(nature);
    }

    @Override
    public float calculerPrix(Appartement appartement) {
        Avendre avendre=new Avendre();
        return avendre.calculerPrix(appartement);

    }

    @Override
    public float calculerPrix(Maison maison) {
        Avendre avendre=new Avendre();
        return avendre.calculerPrix(maison);
    }

    @Override
    public float calculerPrix(Inhabitable inhabitable) {
        Avendre avendre=new Avendre();
        return avendre.calculerPrix(inhabitable);
    }
}

