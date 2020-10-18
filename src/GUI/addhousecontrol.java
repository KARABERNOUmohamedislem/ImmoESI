package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import noyeu.*;

public class addhousecontrol extends Stage {
    public TextField wilaya;
    public TextField surface;
    public TextField nbpiece;
    public TextField nbetage;
    public TextField description;
    public TextField photo;
    public TextField surfacehabitable;
    public CheckBox garage;
    public CheckBox picine;
    public CheckBox meuble;
    public CheckBox jardin;

    public CheckBox nego;
    public TextField prixp;
    public TextField lastname;
    public TextField firstname;
    public TextField mail;
    public TextField adress;
    public ChoiceBox<Nature> nature =new ChoiceBox<>();
    private Agence agence;
    private Proprietaire proprietaire;
    //private Stage window;




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



    public void addall(ActionEvent actionEvent) {
        /*in this method add all the results of wht you have in text fields and stuff and dont forgrt the ownr
        inthe attribut
         */
        Wilaya w = new Wilaya();
        float surf =0;
        int nps =0;
        int net=0;
        String desc;
        String[] pic =new String[5] ;
        float surfh = 0;
        float prix = 0;
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
            int b2=Integer.parseInt(this.nbpiece.getText());
            nps=b2;
        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem nbpieced");
        }



        try {
            int b3=Integer.parseInt(this.nbetage.getText());
            net=b3;

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem etage");
        }




        try {
            float b4=Float.parseFloat(this.surfacehabitable.getText());
            surfh=b4;

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem surf");
        }

        try {
            float b4=Float.parseFloat(this.prixp.getText());
            prix=b4;

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem surf");
        }

        desc=this.description.getText();
        pic[0]=photo.getText();
        grg=garage.isSelected();
        pcn=picine.isSelected();
        jrdn=jardin.isSelected();
        mebl=meuble.isSelected();
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

        try {
            if(nps<0){throw (new nbrPiecesNegative());}
            if(net<0){throw (new nbrEtageNegative());}
            if(surfh>surf){throw (new superficieHabitableNotSupTotale());}

            if(new Avendre().getNature()==this.nature.getValue())
            {
                this.agence.ajouterMaison(w,surf,prop2,new Avendre(),prix,this.nego.isSelected(),desc,
                        pic,nps,mebl,net,grg,jrdn,pcn, (int) surfh);

            }

            if(new Location().getNature()==this.nature.getValue())
            {
                this.agence.ajouterMaison(w,surf,prop2,new Location(),prix,this.nego.isSelected(),desc,
                        pic,nps,mebl,net,grg,jrdn,pcn, (int) surfh);

            }
            if(new Echange().getNature()==this.nature.getValue())
            {
                this.agence.ajouterMaison(w,surf,prop2,new Echange(this.agence.getListWilaya()[1]),prix,this.nego.isSelected(),desc,
                        pic,nps,mebl,net,grg,jrdn,pcn, (int) surfh);

            }




        }
        catch (nbrEtageNegative t)
        {
            this.nbetage.setText("no neagative floors");
            this.nbetage.setStyle("-fx-text-fill:red;-fx-font-size:15px;");

        }
        catch (superficieHabitableNotSupTotale t)
        {
            this.surfacehabitable.setText("livabale surface can't be sup than totale surface");
            this.surfacehabitable.setStyle("-fx-text-fill:red;-fx-font-size:15px;");
        }
        catch (nbrPiecesNegative t)
        {
            this.nbetage.setText("nb piecec canèt be negatif");
            this.nbetage.setStyle("-fx-text-fill:red;-fx-font-size:15px;");

        }







    }
}
