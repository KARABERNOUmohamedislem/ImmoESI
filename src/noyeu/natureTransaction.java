package noyeu;
    abstract class NatureTransaction extends Critere {
    private Nature nature;
    public float calculerPrix(BiensImmobiliers b) {return 0;}
    abstract public void afficherNature();
	public Nature getNature() {
		return nature;
	}
	public void setNature(Nature nature) {
		this.nature = nature;
	}
    

}
