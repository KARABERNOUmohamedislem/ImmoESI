public class Main {
    public static void main(String[] args) {
        Avendre n=new Avendre();
        Proprietaire p=new Proprietaire("islam","mohamed","ii","alger");
        Wilaya w=new Wilaya("alger",100000);
        String[] tab = {"no"};
        BiensImmobiliers b=new BiensImmobiliers(w,100,p,n,1000000,1200000,true,"very good","4/7/2019",tab);
        b.afficherBien();
    }
}
