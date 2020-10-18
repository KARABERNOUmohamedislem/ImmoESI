package noyeu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
    public ArrayList<String> msg=new ArrayList<String>();


    public BiensImmobiliers( ){}
    /*public BiensImmobiliers(Wilaya wilaya, float superficie, Proprietaire proprietaire,
			NatureTransaction natureTransaction, float prixPropose,  boolean negociable,
			String description, Date date, String[] urlphoto)throws prixNegative
	{
    	if (prixPropose<0)throw new prixNegative();
		this.wilaya = wilaya;
		this.superficie = superficie;
		this.proprietaire = proprietaire;
		this.natureTransaction = natureTransaction;
		this.PrixPropose = prixPropose;
		this.negociable = negociable;
		this.description = description;
		this.date = date;
		this.urlphoto = urlphoto;
	}*/

	public BiensImmobiliers(Wilaya wilaya, float superficie, Proprietaire proprietaire,
							NatureTransaction natureTransaction, float prixPropose,  boolean negociable,
							String description, Date date, String[] urlphoto)
	{
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

	public boolean isNegociable() {
		return negociable;
	}

	public void setNegociable(boolean negociable) {
		this.negociable = negociable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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



    public String affBien()
	{
		String s="\n";

		this.wilaya.afficherNomWilaya();
		s=s+"Superficie : "+ this.superficie+"\n";
		s=s+"Date d'ajout : "+this.date+"\n";
		s=s+"Description : "+this.description+"\n";
		/*System.out.print("Nature de transaction voulu : ");*/
		/*this.natureTransaction.afficherNature();*/
		if (this.PrixAgence >100000) {
			s=s+"Prix : " + this.PrixAgence/10 + " x10 DA"+"\n";
		}
		else
		{
			s=s+"Prix : " + this.PrixAgence + "  DA"+"\n";
		}
		if (this.PrixPropose >100000) {
			s=s+"Prix Propose : " + this.PrixPropose/10 + " x10 DA"+"\n";
		}
		else
		{
			s=s+"Prix propose : " + this.PrixPropose + "  DA"+"\n";
		}

		if (this.negociable) s=s+"Negociable"+"\n";
		else s=s+"Non Negociable"+"\n";

          return s;

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
			String description/*, Date date, String[] urlphoto*/)
	{
		this.wilaya = wilaya;
		this.superficie = superficie;
		this.proprietaire = proprietaire;
		this.natureTransaction = natureTransaction;
		PrixPropose = prixPropose;
	
		this.negociable = negociable;
		this.description = description;
		this.date=new Date();
		this.setPrixAgence(this.getNatureTransaction().calculerPrix(this));
		/*this.date = date;
		this.urlphoto = urlphoto;*/
		
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

	public void modifier()
	{
		Scanner h=new Scanner(System.in);
		System.out.println("modifier surface 1-oui 0-non");
		if (h.nextInt()==1)
		{
			System.out.println("donne moi la nouvelle surface");
			this.superficie=h.nextFloat();
		}
		System.out.println("modifier prix props� 1-oui 0-non");
		if(h.nextInt()==1)
		{
			System.out.println("donne le nouveau prix");
			this.PrixPropose=h.nextFloat();

		}
		System.out.println("modifier nature 1-oui 0-non");
		if (h.nextInt()==1){
			System.out.println("1-a vendre 2-location 3-echange");
			int r=h.nextInt();
			switch (r){
				case 1:
					Avendre n=new Avendre();
					this.natureTransaction=n;
					break;
				case 2:
					Location l=new Location();
					this.natureTransaction=l;
					break;
				case 3:
					Echange k=new Echange(this.wilaya);
					this.natureTransaction=k;
					break;

			}
		}
		System.out.println("modifier modifier la negociabilit� 1-oui 0-non");
		if (h.nextInt()==1)
		{
			System.out.println("1-negociable 0-nonnegociable");
			if(h.nextInt()==1)
			{
				this.negociable=true;
			}
			else
			{
				this.negociable=false;
			}
		}
		System.out.println("modifier description 1-oui 0-non");
		if(h.nextInt()==1)
		{
			this.description=h.next();
		}
		this.setPrixAgence(this.getNatureTransaction().calculerPrix(this));

	}

	public void setPrixPropose(float prixPropose) {
		PrixPropose = prixPropose;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}


}
