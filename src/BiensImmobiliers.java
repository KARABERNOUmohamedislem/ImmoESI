import java.util.Arrays;
import java.util.Date;

public class BiensImmobiliers {
    private Wilaya wilaya;
    private float superficie;
    private Proprietaire proprietaire;
    private NatureTransaction natureTransaction;
    private float PrixPropose;
    private float PrixAgence;
    private boolean negociable;
    private String description;
    private Date date;
    private String[] urlphoto;

   
    public BiensImmobiliers(Wilaya wilaya, float superficie, Proprietaire proprietaire,
			NatureTransaction natureTransaction, float prixPropose,  boolean negociable,
			String description, Date date, String[] urlphoto) {
		this.wilaya = wilaya;
		this.superficie = superficie;
		this.proprietaire = proprietaire;
		this.natureTransaction = natureTransaction;
		this.PrixPropose = prixPropose;
		this.negociable = negociable;
		this.description = description;
		this.date = date;
		this.urlphoto = urlphoto;
	}
    

	public float getPrixAgence() {
		return PrixAgence;
	}


	public void setPrixAgence(float prixAgence) {
		PrixAgence = prixAgence;
	}


	public void afficherBien()
    {
        this.wilaya.afficherNomWilaya();
        System.out.println("Superficie : "+ this.superficie);
        System.out.println("Date d'ajout : "+this.date);
        System.out.println("Description : "+this.description);
        System.out.print("Nature de transaction voulu : ");
        this.natureTransaction.afficherNature();
        if (this.PrixAgence >100000) {
			System.out.println("Prix : " + this.PrixAgence/10 + " x10 DA");
		}
        else
		{
			System.out.println("Prix : " + this.PrixAgence + "  DA");
		}
		if (this.PrixPropose >100000) {
			System.out.println("Prix Propose : " + this.PrixPropose/10 + " x10 DA");
		}
		else
		{
			System.out.println("Prix propose : " + this.PrixPropose + "  DA");
		}

        if (this.negociable) System.out.println("Negociable");
        else System.out.println("Non Negociable");

    }


    public Wilaya getWilaya() {
        return wilaya;
    }

    public float getPrixPropose() {
        return PrixPropose;
    }

    public float getSuperficie() {
        return superficie;
    }


	public NatureTransaction getNatureTransaction() {
		return natureTransaction;
	}


	public void setNatureTransaction(NatureTransaction natureTransaction) {
		this.natureTransaction = natureTransaction;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Proprietaire getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	
	public void modifier(Wilaya wilaya, float superficie, Proprietaire proprietaire,
			NatureTransaction natureTransaction, float prixPropose,  boolean negociable,
			String description, Date date, String[] urlphoto)
	{
		this.wilaya = wilaya;
		this.superficie = superficie;
		this.proprietaire = proprietaire;
		this.natureTransaction = natureTransaction;
		PrixPropose = prixPropose;
	
		this.negociable = negociable;
		this.description = description;
		this.date = date;
		this.urlphoto = urlphoto;
		
	}


	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BiensImmobiliers other = (BiensImmobiliers) obj;
		if (Float.floatToIntBits(PrixAgence) != Float.floatToIntBits(other.PrixAgence))
			return false;
		if (Float.floatToIntBits(PrixPropose) != Float.floatToIntBits(other.PrixPropose))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (natureTransaction == null) {
			if (other.natureTransaction != null)
				return false;
		} else if (!natureTransaction.equals(other.natureTransaction))
			return false;
		if (negociable != other.negociable)
			return false;
		if (proprietaire == null) {
			if (other.proprietaire != null)
				return false;
		} else if (!proprietaire.equals(other.proprietaire))
			return false;
		if (Float.floatToIntBits(superficie) != Float.floatToIntBits(other.superficie))
			return false;
		if (!Arrays.equals(urlphoto, other.urlphoto))
			return false;
		if (wilaya == null) {
			if (other.wilaya != null)
				return false;
		} else if (!wilaya.equals(other.wilaya))
			return false;
		return true;
	}
	
	
	
    
}
