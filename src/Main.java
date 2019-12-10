import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    	Avendre n=new Avendre();
    	Location l=new Location();
    	
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
         BiensImmobiliers b=new BiensImmobiliers(w, 15509, p, l, 55485,  false, "fffff", a, tab);
         Date a1= new Date(2015, 02, 23);
         String[] tab1 = {"no"};
         BiensImmobiliers b1=new BiensImmobiliers(w, 15580, p2, n, 545, true,  "fffff", a1, tab1);
         Date a2= new Date(2015, 02, 22);
         String[] tab2 = {"no"};
         Wilaya[] listWilaya =new Wilaya[58] ;
         BiensImmobiliers b2=new BiensImmobiliers(w, 17550, p3, n, 5545,  false, "fffff", a2, tab2);
        listBien.add(0, b);
        listBien.add(1, b1);
        listBien.add(2,b2);
        listProprietaire.add(0, p);
        listProprietaire.add(1, p2);
        listProprietaire.add(2, p3);
        listWilaya[0]=w;
        listWilaya[1]=w2;
        listWilaya[2]=w3;
        
        Agence ag=new Agence("wikala", listBien, listWilaya, listProprietaire);
        Critere[] cr=new Critere[5];
        PrixMax ap =new PrixMax(2540965);
        PrixMin pa=new PrixMin(600);
        cr[0]=ap;
        cr[1]=pa;
        
        BiensImmobiliers[] br=new BiensImmobiliers[10];
        br=ag.rechercheFiltre(cr);
        
        
        
  
     /*   System.out.println(br[0].getPrixPropose());
        System.out.println(br[1].getPrixPropose());
        System.out.println(br[2].getPrixPropose());*/
        Date[] dt=new Date[3];
        dt[0]=a;
        dt[1]=a1;
        dt[2]=a2;
        int x;

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
 for(int i=0;i<br.length;i++)
 {
	 System.out.println("------------------------------------------------------------");
	 br[i].afficherBien();
 }
        

    }
}
