package noyeu;
import java.util.Date;
import java.util.Scanner;

public class Inhabitable extends BiensImmobiliers {
    private int nbrFacade;
    private String statusJuridique;

   

   /* public Inhabitable(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,
                       float prixPropose,  boolean negociable, String description, Date date, String[] urlphoto,
                       int nbrFacade, String statusJuridique)throws nbrFacadeNegative,prixNegative
    {
        super(wilaya, superficie, proprietaire, natureTransaction, prixPropose,  negociable, description,
                date, urlphoto);
        if (nbrFacade<1)throw new nbrFacadeNegative();
        this.nbrFacade = nbrFacade;
        this.statusJuridique = statusJuridique;
    }*/




    public Inhabitable(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,
                       float prixPropose,  boolean negociable, String description, Date date, String[] urlphoto,
                       int nbrFacade, String statusJuridique)
    {
        super(wilaya, superficie, proprietaire, natureTransaction, prixPropose,  negociable, description,
                date, urlphoto);

        this.nbrFacade = nbrFacade;
        this.statusJuridique = statusJuridique;
    }

	@Override
    public void afficherBien() {
        super.afficherBien();
        System.out.println("Type du Bien : Terrain");
        System.out.println("Les informations supplementaires sur le terrain :");
        System.out.println("Le nombre de façade : "+this.nbrFacade);
        System.out.println("Status juridique : "+this.statusJuridique);
    }

    public String getStatusJuridique() {
        return statusJuridique;
    }

    public void setStatusJuridique(String statusJuridique) {
        this.statusJuridique = statusJuridique;
    }

    public String affBien()
    {
        String s;
        s=super.affBien();
        s=s+"Type du Bien : Terrain"+"\n";
        s=s+"Les informations supplementaires sur le terrain :"+"\n";
        s=s+"Le nombre de façade : "+this.nbrFacade+"\n";
        s=s+"Status juridique : "+this.statusJuridique+"\n";
        return s;

    }

    public int getNbrFacade() {
        return nbrFacade;
    }
    public void modifier()
    {
        super.modifier();
        Scanner h=new Scanner(System.in);
        System.out.println("modifier nbr de facade");
        if (h.nextInt()==1)
        {
            System.out.println("donne moi le neuveau nbr facadz");
            this.nbrFacade=h.nextInt();
        }
        System.out.println("modifier status juridique 1-oui 0-non");
        if(h.nextInt()==1)
        {
            this.statusJuridique=h.next();
        }
        this.setPrixAgence(this.getNatureTransaction().calculerPrix(this));

    }
}
