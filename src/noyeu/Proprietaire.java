package noyeu;
import java.util.ArrayList;
import java.util.Objects;

public class Proprietaire {
    private String Nom;
    private String Prenom;
    private String Email;
    private String Address;
    private ArrayList<BiensImmobiliers> listBienPossede = new ArrayList<BiensImmobiliers>();
    private ArrayList<BiensImmobiliers> BienVendu = new ArrayList<BiensImmobiliers>();
   

    public Proprietaire(String Nom,String Prenom,String Email,String Adress)
    {
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Email=Email;
        this.Address=Adress;
    }
     
    public void afficherp()
	{
		System.out.println(this.Nom);
	}
    
    
    
    public ArrayList<BiensImmobiliers> getListBienPossede() {
		return listBienPossede;
	}





	public void setListBienPossede(ArrayList<BiensImmobiliers> listBienPossede) {
		this.listBienPossede = listBienPossede;
	}

	public void ajouteBien(BiensImmobiliers arg)
    {
    	this.listBienPossede.add(arg);
    }
    
    public  void afficherProp()
    {
    	System.out.println("nom: "+this.Nom);
    	System.out.println("prenom: "+this.Prenom);
    	System.out.println("email: "+this.Email);
    	System.out.println("address: "+this.Address);
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Proprietaire that = (Proprietaire) o;
		return Objects.equals(Nom, that.Nom) &&
				Objects.equals(Prenom, that.Prenom) &&
				Objects.equals(Email, that.Email) &&
				Objects.equals(Address, that.Address);
	}

	public String getNom() {
		return Nom;
	}

	public String getAddress() {
		return Address;
	}

	public String getEmail() {
		return Email;
	}

	public String getPrenom() {
		return Prenom;
	}

	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietaire other = (Proprietaire) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (BienVendu == null) {
			if (other.BienVendu != null)
				return false;
		} else if (!BienVendu.equals(other.BienVendu))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		if (Prenom == null) {
			if (other.Prenom != null)
				return false;
		} else if (!Prenom.equals(other.Prenom))
			return false;
		if (listBienPossede == null) {
			if (other.listBienPossede != null)
				return false;
		} else if (!listBienPossede.equals(other.listBienPossede))
			return false;
		return true;
	}*/



    
public void supprimerBienPos(BiensImmobiliers arg)
{
	
		int i =0;
		boolean trouv=false;
		while((i<this.listBienPossede.size())&&(trouv==false))
		{
			if(arg.equals(this.listBienPossede.get(i)))
			{
				trouv=true;
				this.listBienPossede.remove(i);
				
			}
			i++;
		}
		
}


}
