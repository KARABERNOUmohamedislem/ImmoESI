import java.util.ArrayList;

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
	public boolean equals(Object obj) {
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
	}
    


}
