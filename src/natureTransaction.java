abstract class NatureTransaction {
    private Nature nature;
    abstract public float calculerPrix(Appartement appartement);
    abstract public float calculerPrix(Maison maison);
    abstract public float calculerPrix(Inhabitable inhabitable);
    abstract public void afficherNature();

}
