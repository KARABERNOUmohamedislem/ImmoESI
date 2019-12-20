import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    	Avendre n=new Avendre();
    	Location l=new Location();
    	Echange e=new Echange();
    
    	
    	ArrayList<BiensImmobiliers> listBien = new ArrayList<BiensImmobiliers>();
    	
    	 ArrayList<Proprietaire> listProprietaire =new ArrayList<Proprietaire>();
    	 Proprietaire p=new Proprietaire("isla01m","moh2amed","ii","al984ger");
         Wilaya w=new Wilaya("alger",100000);
         Proprietaire p2=new Proprietaire("isla5m","4mohamed","ii","alg899er");
         Wilaya w2=new Wilaya("bmrds",10550000);
         Proprietaire p3=new Proprietaire("isla89m","mo23hamed","ii","144alger");
         Wilaya w3=new Wilaya("blida",12600000);
         Date a= new Date(2015, 02, 24);
         String[] tab = {"no"};

         Maison m=new Maison(w, 5455, p, n, 9855, false, "jgf", a, tab, 5, false, 5, false, 	true, true, 69);       
         BiensImmobiliers b=new BiensImmobiliers(w, 15509, p, l, 55485,  false, "fffff", a, tab);
         Date a1= new Date(2015, 02, 23);
         String[] tab1 = {"no"};
         BiensImmobiliers b1=new BiensImmobiliers(w, 15580, p2, n, 545, true,  "fffff", a1, tab1);
         Date a2= new Date(2015, 02, 22);
         String[] tab2 = {"no"};
         Wilaya[] listWilaya =new Wilaya[58] ;
         BiensImmobiliers b2=new BiensImmobiliers(w, 17550, p3, e, 5545,  false, "fffff", a2, tab2);
      /*  listBien.add(0, b);
        listBien.add(1, b1);
        listBien.add(2,b2);
        listProprietaire.add(0, p);
        listProprietaire.add(1, p2);
        listProprietaire.add(2, p3);
        listWilaya[0]=w;
        listWilaya[1]=w2;
        listWilaya[2]=w3;*/
        
        Agence ag=new Agence("ffff",listWilaya);
        ag.ajouterBien(m);
        ag.ajouterBien(b1);
        ag.ajouterBien(b2);


        ag.affichage();

        Critere[] cr=new Critere[10];
        NbPiece ap =new NbPiece(5);
        PrixMin pa=new PrixMin(1);
        Cnature nature=new Cnature(Nature.Avendre);

        cr[0]=nature;
      
        
        ArrayList<BiensImmobiliers> br = new ArrayList<BiensImmobiliers>();
        br=ag.rechercheFiltre(cr);
        //ag.affichage(cr);

        System.out.println(br.size());

        
        
  

        Date[] dt=new Date[3];
        dt[0]=a;
        dt[1]=a1;
        dt[2]=a2;
        int x;
        //ag.supprimerBien(b);

/*for (int i = 0; i < listBien.size(); i++)                     //Loop for descending ordering
	{
		for (int j = 0; j <listBien.size(); j++)             //Loop for comparing other values        ///fpnction to sort a table 
		{
			if (listBien.get(j).getDate().before(listBien.get(i).getDate()) )                //Comparing other array elements
			{
				BiensImmobiliers tmp = listBien.get(i) ;         //Using temporary variable for storing last value
				listBien.set(i, listBien.get(j)) ;            //replacing value
				listBien.set(j, tmp) ;              //storing last value
			}
		}
	}*/
      /* ag.trierBien();*/
 //ag.modifierBien(b, w3, 6555, p2,n, 548, true, "vfvf", a2, tab2);
 //b.afficherBien()
//System.out.println( b.getNatureTransaction().calculerPrix(b));
/*b.setPrixAgence(n.calculerPrix(b));
System.out.println(n.calculerPrixGenerale(m));
 System.out.println(b.getPrixAgence());
 //n.afficherNature();*/

        //ag.affichage();
      //  m.getNatureTransaction().afficherNature();
        //System.out.println(m.getNature().calculerPrix(m));
    }
}
