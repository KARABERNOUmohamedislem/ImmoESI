package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import noyeu.*;

public class addaprtmcontrol {

    public CheckBox meuble;
    public TextField prixp;
    public CheckBox nego;
    public ToggleGroup selction;
    public TextField lastname;
    public TextField firstname;
    public TextField adress;
    public TextField mail;
    public ChoiceBox<Nature> nature =new ChoiceBox<>();


    Agence agence;
    Proprietaire proprietaire;

    public void setAgence(Agence agence) {
        this.agence = agence;

    }

    public void initialize(){
        Avendre sale=new Avendre();
        Location rent =new Location();
        Echange  exchange=new Echange();
        nature.getItems().addAll(sale.getNature(),rent.getNature(),exchange.getNature());
        System.out.println("fffffffffffffffffffffffffffffff");

        nature.setValue(sale.getNature());


    }



    public TextField wilaya;
    public TextField surface;
    public TextField nbpiece;
    public TextField etage;
    public TextField description;
    public TextField photo;

    public RadioButton duplex;
    public RadioButton simplex;
    
    public CheckBox assenceur;

    public Button submit;



    public void addall(ActionEvent actionEvent) {

        Wilaya w = new Wilaya();
        float surf =0;
        float prix=0;
        int nps =0;
        int net=0;
        String desc;
        String[] pic =new String[5] ;
        float surfh = 0;
        boolean grg;
        boolean pcn;
        boolean mebl;
        boolean jrdn;
        try {
            int b=Integer.parseInt(this.wilaya.getText());
            w=this.agence.getListWilaya()[b];

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem wilaya");
        }


        try {
            float b1=Float.parseFloat(this.surface.getText());
            surf=b1;


        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem surface");
        }


        try {
            float b1=Float.parseFloat(this.prixp.getText());
            prix=b1;

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem prix");
        }



        try {
            int b2=Integer.parseInt(this.nbpiece.getText());
            nps=b2;

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem nbpieced");
        }



        try {
            int b3=Integer.parseInt(this.etage.getText());
            net=b3;

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem etage");
        }

        pic[0]=this.photo.getText();


        desc=this.description.getText();
        Boolean dupX = true;

        if(selction.getSelectedToggle().equals(duplex))
        {
            dupX=true;
        }
        else
        {
            if(selction.getSelectedToggle().equals(simplex))
            {
                dupX=false;
            }
        }
        Proprietaire prop2;
        Proprietaire prop =new Proprietaire(this.lastname.getText(),this.firstname.getText(),this.mail.getText(),this.adress.getText());
        if(this.agence.checkProp(prop))
        {
            //this.agence.ajouterAppartement(w,surf,this.agence.chercherp(prop),new Avendre(),prix,nego.isSelected(),desc,pic,nps,this.meuble.isSelected(),net,dupX,this.assenceur.isSelected());
              prop2=this.agence.chercherp(prop);
        }
        else
        {
           // this.agence.ajouterAppartement(w,surf,prop,new Avendre(),prix,nego.isSelected(),desc,pic,nps,this.meuble.isSelected(),net,dupX,this.assenceur.isSelected());
            prop2=prop;
        }


        try{
            if(prix<0) {throw (new prixNegative());}
            if(nps<0){throw (new nbrPiecesNegative());}
            if (net<0){throw (new nbrEtageNegative());}
            if(new Avendre().getNature()==this.nature.getValue())
            {
                this.agence.ajouterAppartement(w,surf,prop2,new Avendre(),prix,nego.isSelected(),desc,pic,nps,this.meuble.isSelected(),net,dupX,this.assenceur.isSelected());

            }

            if(new Location().getNature()==this.nature.getValue())
            {
                this.agence.ajouterAppartement(w,surf,prop2,new Location(),prix,nego.isSelected(),desc,pic,nps,this.meuble.isSelected(),net,dupX,this.assenceur.isSelected());

            }
            if(new Echange().getNature()==this.nature.getValue())
            {
                this.agence.ajouterAppartement(w,surf,prop2,new Echange(this.agence.getListWilaya()[1]),prix,nego.isSelected(),desc,pic,nps,this.meuble.isSelected(),net,dupX,this.assenceur.isSelected());

            }

            System.out.printf("fggfdsqqsdfghgfdxw<qsdfghgfd");


        }
        catch (prixNegative t)
        {
            this.prixp.setText("no neagative prices");
            this.prixp.setStyle("-fx-text-fill:red;-fx-font-size:15px;");
        }
        catch (nbrPiecesNegative t)
        {
            this.nbpiece.setText("no neagative pieces");
            this.nbpiece.setStyle("-fx-text-fill:red;-fx-font-size:15px;");
        }
        catch (nbrEtageNegative t)
        {
            this.etage.setText("no neagative floors");
            this.etage.setStyle("-fx-text-fill:red;-fx-font-size:15px;");
        }









    }

}
