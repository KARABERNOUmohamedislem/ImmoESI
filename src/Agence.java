import java.util.ArrayList;
import java.util.Date; 



public class Agence {
 private  ArrayList<BiensImmobiliers> listBien = new ArrayList<BiensImmobiliers>();
 private  Wilaya[] listWilaya =new Wilaya[58] ;
 private  ArrayList<Proprietaire> listProprietaire =new ArrayList<Proprietaire>();
 private String nomAgence;
 private ArrayList<BiensImmobiliers> archiveBien=new ArrayList<BiensImmobiliers>();

 public Agence(String nomAgence, Wilaya[] listWilaya)
{
	this.nomAgence = nomAgence;
	this.listWilaya = listWilaya;

	
}
 
 
 
 
 
public ArrayList<BiensImmobiliers> getListBien() {
	return listBien;
}



public ArrayList<Proprietaire> getListProprietaire() {
	return listProprietaire;
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



public void ajouterProp(Proprietaire p)
{
	int x=this.listProprietaire.size();
	if(this.checkProp(p)==false)
	{
		this.listProprietaire.add(x, p);
	}
	else
	{
		System.out.println("already exisits");
	}
}




public void ajouterBien(BiensImmobiliers arg) 
{
    int x= this.listBien.size();
    arg.setPrixAgence(arg.getNatureTransaction().calculerPrix(arg));
	this.listBien.add(x, arg);
	this.trierBien();
	Proprietaire p=arg.getProprietaire();
	p.ajouteBien(arg);
	this.ajouterProp(p);
}

public void ajouterBien(Wilaya a, float b,Proprietaire c,NatureTransaction d,float e, boolean f, String g ,Date h, String[] i )
{
	BiensImmobiliers bien=new BiensImmobiliers(a, b, c, d, e, f, g, h, i);
	//bien.getNatureTransaction.calculerPrix(bien);
	int x =this.listBien.size();
	this.listBien.add(x,bien);
	this.trierBien();
	c.ajouteBien(bien);
	this.ajouterProp(c);
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



public boolean checkCritere(Cnature  arg , BiensImmobiliers arg2)  //fiha problem !!!
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
	if (arg2.getWilaya()==arg)
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


public ArrayList<BiensImmobiliers> rechercheFiltre(Critere [] arg)
{
	boolean a=true;
	ArrayList<BiensImmobiliers> tab = new ArrayList<BiensImmobiliers>();
  int i=0;
  int j=0 ;
  int k=0;
  for(i=0;i<this.listBien.size();i++)
  {
	for(j=0;j<arg.length;j++)
	{
		if(arg[j] instanceof PrixMax)
		{	
		a=a && this.checkCritere((PrixMax)arg[j], this.listBien.get(i));
		}
		if(arg[j] instanceof PrixMin)
		{	
		a=a && this.checkCritere((PrixMin)arg[j], this.listBien.get(i));
		}
		if(arg[j] instanceof Surface)
		{	
		a=a && this.checkCritere((Surface)arg[j], this.listBien.get(i));
		}
		if(arg[j] instanceof NbPiece)
		{	
		a=a && this.checkCritere((NbPiece)arg[j], this.listBien.get(i));
		}
		if(arg[j] instanceof Cnature)
		{	
		a=a && this.checkCritere((Cnature)arg[j], this.listBien.get(i));
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





public void modifierBien(BiensImmobiliers arg,Wilaya wilaya, float superficie, Proprietaire proprietaire,
		NatureTransaction natureTransaction, float prixPropose,  boolean negociable,
		String description, Date date, String[] urlphoto) // verifi si on peut modifier un paramatre oui on peut
{
	arg.modifier(wilaya, superficie, proprietaire, natureTransaction, prixPropose, negociable, description, date, urlphoto);
}



public void afficherBienProp(Proprietaire arg)
{ 
	int i;
	for(i=0;i<arg.getListBienPossede().size();i++)
	{
		arg.getListBienPossede().get(i).afficherBien();
	}
	
}

public void supprimerBien(BiensImmobiliers arg)
{
	int i =0;
	boolean trouv=false;
	while((i<this.listBien.size())&&(trouv==false))
	{
		if(arg.equals(this.listBien.get(i)))
		{
			trouv=true;
			this.listBien.remove(i);
			
		}
		i++;
	}
	
}


public void archiverBien(BiensImmobiliers arg)
{
    if (this.checkBien(arg)==true)
    {
	int j=this.archiveBien.size();
	this.archiveBien.add(j, arg);
	this.supprimerBien(arg);
    }
	
}

public void affichage(Critere[] arg)
{
	ArrayList<BiensImmobiliers > b=this.rechercheFiltre(arg);
	int i;
	for(i=0;i<b.size();i++)
	{
		b.get(i).afficherBien();
	}
}

public void affichage()
{
	for(int i=0;i<this.listBien.size();i++)
	{
		this.listBien.get(i).afficherBien();
	}
}




 
}
