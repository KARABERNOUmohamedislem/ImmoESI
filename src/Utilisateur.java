import java.util.ArrayList;

public class Utilisateur {
	
public ArrayList<BiensImmobiliers> filtrer(Agence a,ArrayList<Critere> arg1) throws empty
{
	return (a.rechercheFiltre(arg1));
}

	
public void afficherRenseignement(Agence a,BiensImmobiliers arg)
{
	if(a.checkBien(arg)==true)
	{
	  arg.afficherBien();
	}
	else
	{
		System.out.println("couldn't find what you're looking for ");
	}
}

public void afficherRenseignement(Agence a)
{
	a.affichage();
}



public void afficherRenseignement(Agence a, ArrayList<Critere> arg2)
{
	a.affichage(arg2);
}



public void demandeTransaction()
{
	System.out.println("i want to do business ");
}

public void demandeTransaction(Agence a, BiensImmobiliers b)
{
	System.out.println("je veux faire de business");
	a.gererTransaction(b);
}
}
