package noyeu;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;




public class Agence {

	private  ArrayList<BiensImmobiliers> listBien = new ArrayList<BiensImmobiliers>();
 private  Wilaya[] listWilaya =new Wilaya[58] ;
 private  ArrayList<Proprietaire> listProprietaire =new ArrayList<Proprietaire>();
 private String nomAgence;
 private ArrayList<BiensImmobiliers> archiveBien=new ArrayList<BiensImmobiliers>();
 private static String id="admin";
 private static String password="1234";
 private boolean connecte=false;

	public static String getId() {
		return id;
	}

	public static String getPassword() {
		return password;
	}

	public void setConnecte(boolean connecte) {
		this.connecte = connecte;
	}

	public Agence(String nomAgence, Wilaya[] listWilaya)
{
	this.nomAgence = nomAgence;
	this.listWilaya = listWilaya;

	
}


 
 public void connecter(String id,String password)
 {
 	if ((id.equals(Agence.id) )&& (password.equals(Agence.password)))
	{
		this.connecte=true;
		System.out.println("vous etes connecte.");
	}
 	else
	{
		System.out.println("id ou mot de pass incorrect.");
	}
 }
 public void deconnecter()
 {
 	this.connecte=false;
 }
 
 
 
public ArrayList<BiensImmobiliers> getListBien() {
	return listBien;
}



public ArrayList<Proprietaire> getListProprietaire() {

 	return listProprietaire;
}






public Wilaya[] getListWilaya() {
	return listWilaya;
}





public void setListWilaya(Wilaya[] listWilaya) {
	this.listWilaya = listWilaya;
}





public void setListProprietaire(ArrayList<Proprietaire> listProprietaire) {
	this.listProprietaire = listProprietaire;
}



public void setListBien(ArrayList<BiensImmobiliers> listBien) {
	this.listBien = listBien;
}

public boolean checkBien(BiensImmobiliers arg)

{
	int i=0;
	boolean trouv=false;
	while((i<this.listBien.size())&&(trouv==false))
	{
		if (arg.equals(this.listBien.get(i)))
		{
			trouv=true;
			
		}
		else
		{
			trouv=false;
		}
		i++;
	}
	return trouv;
}


public boolean checkProp(Proprietaire p)
{
	int i=0;
	boolean trouv=false;
	while((i<this.listProprietaire.size())&&(trouv==false))
	{
	   if (p.equals(this.listProprietaire.get(i))==true)
	   {
		   trouv=true;
	   }
	   else
	   {
		   trouv=false;
	   }
	   i++;
	}
	return trouv;
}



public void trierBien()
{
	for (int i = 0; i < this.listBien.size(); i++)                     //Loop for descending ordering
	{
		for (int j = 0; j <this.listBien.size(); j++)             //Loop for comparing other values        ///fpnction to sort a table 
		{
			if (this.listBien.get(j).getDate().before(this.listBien.get(i).getDate()) )                //Comparing other array elements
			{
				BiensImmobiliers tmp = this.listBien.get(i) ;         //Using temporary variable for storing last value
				this.listBien.set(i, this.listBien.get(j)) ;            //replacing value
				this.listBien.set(j, tmp) ;              //storing last value
			}
		}
	}
}





public void ajouterProp(Proprietaire p)
{
	if (this.connecte){
	int x=this.listProprietaire.size();
	if(this.checkProp(p)==false)
	{
		this.listProprietaire.add(x, p);
	}
	}
	else
	{
		System.out.println("veulliez connecter en tant qu'un administrateur pour faire cette operation. ");
	}
}






public void ajouterBien(BiensImmobiliers arg) 
{
	if (this.connecte) {
		if (!checkBien(arg)) {
			int x = this.listBien.size();
			arg.setPrixAgence(arg.getNatureTransaction().calculerPrix(arg));
			this.listBien.add(x, arg);
			this.trierBien();
			Proprietaire p = arg.getProprietaire();
			p.ajouteBien(arg);
			this.ajouterProp(p);
		}
		else {
			System.out.println("ce bien existe deja");
		}
	}
	else
	{
		System.out.println("veulliez connecter en tant qu'un administrateur pour faire cette operation. ");
	}
}



public void ajouterBien(BiensImmobiliers [] arg)
{
	if (this.connecte){
	int i=0;
	for(i=0;i<arg.length;i++)
	{
		this.ajouterBien(arg[i]);
	}
	}
	else
	{
		System.out.println("veulliez connecter en tant qu'un administrateur pour faire cette operation. ");
	}
}

/*
public void ajouterBien(Wilaya a, float b,Proprietaire c,NatureTransaction d,float e, boolean f, String g , String[] i )
{
	Date h =new Date(); //add with the current date
	BiensImmobiliers bien=new BiensImmobiliers(a, b, c, d, e, f, g, h, i);
	bien.setPrixAgence(bien.getNatureTransaction().calculerPrix(bien));
	int x =this.listBien.size();
	this.listBien.add(x,bien);
	this.trierBien();
	c.ajouteBien(bien);
	this.ajouterProp(c);
	this.trierBien();
}
*/




public void ajouterMaison(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,
		float prixPropose,  boolean negociable, String description,  String[] urlphoto,
		int nbPieces, boolean meuble, int nbrEtage, boolean garage, boolean jardin, boolean piscine,
		int superficieHabitable)
{
	Date h =new Date(); //add with the current date
	Maison m=new Maison(wilaya, superficie, proprietaire, natureTransaction, prixPropose, negociable, description, h, urlphoto, nbPieces, meuble, nbrEtage, garage, jardin, piscine, superficieHabitable);

	this.ajouterBien(m);

}





public void ajouterAppartement(Wilaya wilaya,float superficie,Proprietaire proprietaire,NatureTransaction natureTransaction,float prixPropose,boolean negociable,String description,String[] urlphoto,int nb_pieces,boolean meuble,int etage,boolean duplex,boolean ascenseur)
{
	Date h =new Date(); //add with the current date
	Appartement m=new Appartement(wilaya, superficie, proprietaire, natureTransaction, prixPropose, negociable, description, h, urlphoto, nb_pieces, meuble, etage, duplex, ascenseur);
	this.ajouterBien(m);

	
}





public void ajouterTerrainInhabitable(Wilaya wilaya, float superficie, Proprietaire proprietaire, NatureTransaction natureTransaction,
			float prixPropose,  boolean negociable, String description,  String[] urlphoto,
			int nbrFacade, String statusJuridique)
{
	Date h =new Date(); //add with the current date
	Inhabitable m=new Inhabitable(wilaya, superficie, proprietaire, natureTransaction, prixPropose, negociable, description, h, urlphoto, nbrFacade, statusJuridique);
	this.ajouterBien(m);

	
}




public boolean checkCritere(Cnature  arg , BiensImmobiliers arg2)
{
	boolean a;
	if(arg.getN()==arg2.getNatureTransaction().getNature())
	{
		a=true;
	}
	else
	{
		a=false;
	}
	return a;
}





public boolean checkCritere(Wilaya arg , BiensImmobiliers arg2)
{ 
	boolean a;
	if (arg2.getWilaya().equals(arg))
	{
		a=true;
	}
	else
	{
		a=false;
	}
	return a;
	
	
}




public boolean checkCritere(PrixMax arg , BiensImmobiliers arg2)
{ 
	boolean a;
	if (arg2.getPrixPropose()<=arg.getVal())
	{
		a=true;
	}
	else
	{
		a=false;
	}
	return a;
	
	
}






public boolean checkCritere(PrixMin arg , BiensImmobiliers arg2)
{ 
	boolean a;
	if (arg2.getPrixPropose()>=arg.getVal())
	{
		a=true;
	}
	else
	{
		a=false;
	}
	return a;
	
	
}









public boolean checkCritere(Surface arg , BiensImmobiliers arg2)
{ 
	boolean a;
	if (arg2.getSuperficie()==arg.getVal())
	{
		a=true;
	}
	else
	{
		a=false;
	}
	return a;
	
	
}




public boolean checkCritere(NbPiece arg , BiensImmobiliers arg2)
{ 
	boolean a;
	if(arg2 instanceof Habitable)
	{	
	Habitable b=(Habitable)arg2;
	if (b.getNbPieces()==arg.getVal())
	{
		a=true;
	}
	else
	{
		a=false;
	}
	}
	else
	{
		a=false;
		
	}
	return a;
	
	
}





public ArrayList<BiensImmobiliers> rechercheFiltre(ArrayList<Critere> arg)
{
	empty e=new empty();
	boolean a=true;
	ArrayList<BiensImmobiliers> tab = new ArrayList<BiensImmobiliers>();
  int i=0;
  int j=0 ;
  int k=0;
  for(i=0;i<this.listBien.size();i++)
  {
	for(j=0;j<arg.size();j++)
	{
		if(arg.get(j) instanceof PrixMax)
		{	
		a=a && this.checkCritere((PrixMax)arg.get(j), this.listBien.get(i));
		}
		if(arg.get(j) instanceof Wilaya)
		{
			a=a && this.checkCritere((Wilaya) arg.get(j), this.listBien.get(i));
		}
		if(arg.get(j) instanceof PrixMin)
		{	
		a=a && this.checkCritere((PrixMin)arg.get(j), this.listBien.get(i));
		}
		if(arg.get(j) instanceof Surface)
		{	
		a=a && this.checkCritere((Surface)arg.get(j), this.listBien.get(i));
		}
		if(arg.get(j) instanceof NbPiece)
		{	
		a=a && this.checkCritere((NbPiece)arg.get(j), this.listBien.get(i));
		}
		if(arg.get(j) instanceof Cnature)
		{	
		a=a && this.checkCritere((Cnature)arg.get(j), this.listBien.get(i));
		}
		
	}
	if(a==true)
	{
		tab.add(k, this.listBien.get(i));
		k++;
	}else
	{
		a=true;
	}
  }

  return tab;
}







public void afficherBienProp(Proprietaire arg)
{ 
	if (checkProp(arg)==true)
	{
	int i;
	for(i=0;i<arg.getListBienPossede().size();i++)
	{
 		System.out.println("************************************************************");

		arg.getListBienPossede().get(i).afficherBien();
	}
	}
	else
	{
		System.out.println("couldnt find what you are looking for");
	}
	
}




public void supprimerProp(Proprietaire arg)
{
	if (this.connecte){
	int i=0;
	boolean trouv=false;
	if(checkProp(arg)==true)
	{
		while((i<this.listProprietaire.size())&&(trouv==false))
		{
			if(arg.equals(this.listProprietaire.get(i)))
			{
				trouv=true;
				this.listProprietaire.remove(i);
			}
			i++;
		}
	}
	else
	{
		System.out.println("couldnt find the owner");
	}
	}
	else
	{
		System.out.println("veulliez connecter en tant qu'un administrateur pour faire cette operation. ");
	}
}


public void supprimerBien(BiensImmobiliers arg)
{
	if (this.connecte){
	int i =0;
	boolean trouv=false;
	if(checkBien(arg)==true)
	{
	while((i<this.listBien.size())&&(trouv==false))
	{
		if(arg.equals(this.listBien.get(i)))
		{
			trouv=true;
			arg.getProprietaire().supprimerBienPos(arg);
			this.listBien.remove(i);
		}
		i++;
	}
	
	if(arg.getProprietaire().getListBienPossede().size()==0)
	{
		this.supprimerProp(arg.getProprietaire());
	}
	
	}
	else
	{
		System.out.println("couldnt find what you are looking for");
	}
	}
	else
	{
		System.out.println("veulliez connecter en tant qu'un administrateur pour faire cette operation. ");
	}
}





public void archiverBien(BiensImmobiliers arg)
{
	if (this.connecte){
    if (this.checkBien(arg)==true)
    {
	int j=this.archiveBien.size();
	this.archiveBien.add(j, arg);
	this.supprimerBien(arg);
    }
    else 
    {
    	System.out.println("couldnt find what you are looking for");
    }
	}
	else
	{
		System.out.println("veulliez connecter en tant qu'un administrateur pour faire cette operation. ");
	}
	
}






public void affichage(ArrayList<Critere> arg)
{
	ArrayList<BiensImmobiliers > b= new ArrayList<BiensImmobiliers>();

     b=this.rechercheFiltre(arg);
     int i;
 	for(i=0;i<b.size();i++)
 	{
 		System.out.println("************************************************************");
 		b.get(i).afficherBien();
 	}
     


}





public void affichage()
{
	for(int i=0;i<this.listBien.size();i++)
	{
		System.out.println("************************************************************");
		this.listBien.get(i).afficherBien();
	}
}

public String GUIaffichage()
{
	String s = "\n";
	for(int i=0;i<this.listBien.size();i++)
	{
		s=s+"************************************************************"+"\n";
		s=s+this.listBien.get(i).affBien();
	}
	return s;
}



public void afficherArchive()
{
	if (this.archiveBien.size()==0)
	{
		System.out.println("archive vide");
	}
	else
	{
	int i ;
	for(i=0;i<this.archiveBien.size();i++)
	{
		System.out.println("**************************************************************");
		this.archiveBien.get(i).afficherBien();
	}
	}
}




public void gererTransaction(BiensImmobiliers arg)
{
	Scanner sc= new Scanner(System.in);
	
	if (checkBien(arg)==true)
	{
	System.out.print("ce bien est � ");
	arg.getNatureTransaction().afficherNature();
	System.out.println("avec prix de "+arg.getPrixAgence()+" la comession de l'agence est inclue");
	System.out.println("si vous vouler faire de business appuyez sur 1 sinon 0");
	int a= sc.nextInt();
	switch (a) {
	case 0:
		System.out.println("merci pour votre presence � "+this.nomAgence);
		break;
	case 1:
		System.out.println("merci pour accepter de faire de business avec vous  ");
		System.out.println("pouvez  vous passez par notre local la semain prochain  pour terminer les formalit�s administratives ou bien nous contacter pour choisire la date qui vous arrenge ");
		archiverBien(arg);
		break;
	default :
		System.out.println("problem de saisir reesseyez svp ");
		a=sc.nextInt();
	}
	}
	else 
	{
		System.out.println("desole on n'a pas pu trouver ce bien dans notre liste des biens disponible");
	}


}
	public void modifierBien(BiensImmobiliers arg)
	{
		if (this.connecte) {
			arg.modifier();
		}
		else
		{
			System.out.println("veulliez connecter en tant qu'un administrateur pour faire cette operation. ");
		}
	}


	public int indicewilaya(String s)
	{
		int i =0;
		boolean trouv =false;
		while( (i<this.listWilaya.length)&&(trouv==false))
		{
			if(s.equals(this.listWilaya[i].getNomWilaya()))
			{
				trouv=true;
			}
			else
			{
				i++;
			}
		}

		return (i);
	}


	public Proprietaire chercherp(Proprietaire arg)
	{
		int i=0;
		Boolean trouv=false;
		while ((i<this.listProprietaire.size())&&(trouv==false))
		{
			if( arg.equals(this.listProprietaire.get(i)))
			{
				trouv=true;
			}
			else {
				i++;
			}
		}
		return this.listProprietaire.get(i);

	}



}
