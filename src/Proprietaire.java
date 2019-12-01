public class Proprietaire {
    private String Nom;
    private String Prenom;
    private String Email;
    private String Address;
    private BiensImmobiliers[] list;
    private BiensImmobiliers[] bienVendu;

    public Proprietaire(String Nom,String Prenom,String Email,String Adress)
    {
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Email=Email;
        this.Address=Adress;
    }


}
