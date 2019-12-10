import java.util.ArrayList; 



public class Agence {
 private  ArrayList<BiensImmobiliers> listBien = new ArrayList<BiensImmobiliers>();
 private  Wilaya[] listWilaya =new Wilaya[58] ;
 private  ArrayList<Proprietaire> listProprietaire =new ArrayList<Proprietaire>();
 private String nomAgence;
 private ArrayList<BiensImmobiliers> archiveBien=new ArrayList<BiensImmobiliers>();

 public Agence(String nomAgence,ArrayList<BiensImmobiliers> listBien, Wilaya[] listWilaya, ArrayList<Proprietaire> listProprietaire)
{
	this.nomAgence = nomAgence;
	this.listBien = listBien;
	this.listWilaya = listWilaya;
	this.listProprietaire = listProprietaire;
	
}
 
 
 
public ArrayList<BiensImmobiliers> getListBien() {
	return listBien;
}



public void setListBien(ArrayList<BiensImmobiliers> listBien) {
	this.listBien = listBien;
}



public void ajouterBien(BiensImmobiliers arg)
{
	arg.getNatureTransaction().calculerPrix(arg);
	int i = this.listBien.size(); 
	this.listBien.set(i, arg);
	this.trierBien();
	
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

/*public BiensImmobiliers rechercherBien(BiensImmobiliers arg)
{
	int i=0;
	boolean trouv=false;
	while( (i<listBien.size()) && (trouv==false))
	{
		if(arg==listBien.get(i))
		{
			
			trouv=true;
			return listBien.get(i);
		}
		else
		{
		i++;
		}
	}
	
}*/

public boolean checkCritere(NatureTransaction  arg , BiensImmobiliers arg2) 
{
	boolean a;
	if(arg.getNature()==arg2.getNatureTransaction().getNature())
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


public BiensImmobiliers[] rechercheFiltre(Critere [] arg)
{
	boolean a=true;
	BiensImmobiliers[] tab =new BiensImmobiliers[50];
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
		if(arg[j] instanceof NatureTransaction)
		{	
		a=a && this.checkCritere((NatureTransaction)arg[j], this.listBien.get(i));
		}
		
	}
	if(a==true)
	{
		tab[k]=this.listBien.get(i);
		k++;
	}else
	{
		a=true;
	}
  }
  return tab;
}





public void modifierBien(BiensImmobiliers arg) // verifi si on peut modifier un paramatre oui on peut
{
	
}


public void archiveBien(BiensImmobiliers arg)
{
	
}

public void afficherBienProp(Proprietaire arg)
{
	
}





 
}
