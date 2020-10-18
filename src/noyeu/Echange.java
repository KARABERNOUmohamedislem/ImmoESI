package noyeu;
public class Echange extends NatureTransaction {
    private static Nature nature=Nature.Echange;
    private Wilaya wilayaDEchange;

    public Echange(Wilaya wilayaDEchange){
        this.wilayaDEchange=wilayaDEchange;
    }

    public void setWilayaDEchange(Wilaya wilayaDEchange) {
        this.wilayaDEchange = wilayaDEchange;
    }

    public Echange() {

    }

    @Override
    public  Nature getNature() {
        return nature;
    }

    public Wilaya getWilayaDEchange() {
        return wilayaDEchange;
    }

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
        Avendre avendre=new Avendre();
        if (appartement.getWilaya()!=this.wilayaDEchange)
        {   float a =0;

            a += 0.0025 * appartement.getPrixPropose();
            return avendre.calculerPrix(appartement)+a;
        }
        else {
            return avendre.calculerPrix(appartement);
        }
    }

    
    public float calculerPrix(Maison maison) {
        Avendre avendre=new Avendre();
        if (maison.getWilaya()!=this.wilayaDEchange)
        {   float a =0;

            a += 0.0025 * maison.getPrixPropose();
            return avendre.calculerPrix(maison)+a;
        }
        else {
            return avendre.calculerPrix(maison);
        }
    }

  
    public float calculerPrix(Inhabitable inhabitable) {
        Avendre avendre=new Avendre();
        if (inhabitable.getWilaya()!=this.wilayaDEchange)
        {   float a =0;

            a += 0.0025 * inhabitable.getPrixPropose();
            return avendre.calculerPrix(inhabitable)+a;
        }
        else {
            return avendre.calculerPrix(inhabitable);
        }
    }
}

