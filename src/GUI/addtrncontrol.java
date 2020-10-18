package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import noyeu.*;

public class addtrncontrol {
    public TextField wilaya;
    public TextField surface;
    public TextField description;
    public TextField photo;
    public TextField facade;
    public TextField status;
    public TextField prixp;
    public CheckBox nego;
    public Button owner;
    public Button submit;
    public TextField address;
    public TextField mail;
    public TextField firstname;
    public TextField lastname;
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

    
    
    public void addall(ActionEvent actionEvent) {

        Wilaya w = new Wilaya();
        float surf =0;
        String desc ;
        String[] pic =new String[5] ;
        float prix = 0;
        int face = 0;
       
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
            int b=Integer.parseInt(this.facade.getText());
            face=b;
            

        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem wilaya");
        }


        


        try {
            float b=Float.parseFloat(this.prixp.getText());
            prix=b;


        }
        catch (NumberFormatException e)
        {
            System.out.printf("problem prix");
        }
        String stat=this.status.getText();
        desc=this.description.getText();
        Proprietaire prop2;
        Proprietaire prop =new Proprietaire(this.lastname.getText(),this.firstname.getText(),this.mail.getText(),this.address.getText());
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
            if(prix<0) {throw (new prixNegative());}
            if(face<0){throw (new nbrFacadeNegative());}
            if(new Avendre().getNature()==this.nature.getValue())
            {
                this.agence.ajouterTerrainInhabitable(w,surf,prop2,new Avendre(),prix,this.nego.isSelected(),desc,pic
                        ,face,stat);
            }

            if(new Location().getNature()==this.nature.getValue())
            {
                this.agence.ajouterTerrainInhabitable(w,surf,prop2,new Location(),prix,this.nego.isSelected(),desc,pic
                        ,face,stat);
            }
            if(new Echange().getNature()==this.nature.getValue())
            {
                this.agence.ajouterTerrainInhabitable(w,surf,prop2,new Echange(this.agence.getListWilaya()[1]),prix,this.nego.isSelected(),desc,pic
                        ,face,stat);
            }

        }
        catch (prixNegative t)
        {
            this.prixp.setText("no negative prices");
            this.prixp.setStyle("-fx-text-fill:red;-fx-font-size:15px;");

        }
        catch (nbrFacadeNegative t)
        {
            this.facade.setText("no negative prices");
            this.facade.setStyle("-fx-text-fill:red;-fx-font-size:15px;");

        }

        if(new Avendre().getNature()==this.nature.getValue())
        {
            this.agence.ajouterTerrainInhabitable(w,surf,prop2,new Avendre(),prix,this.nego.isSelected(),desc,pic
                    ,face,stat);
        }

        if(new Location().getNature()==this.nature.getValue())
        {
            this.agence.ajouterTerrainInhabitable(w,surf,prop2,new Location(),prix,this.nego.isSelected(),desc,pic
                    ,face,stat);
        }
        if(new Echange().getNature()==this.nature.getValue())
        {
            this.agence.ajouterTerrainInhabitable(w,surf,prop2,new Echange(this.agence.getListWilaya()[1]),prix,this.nego.isSelected(),desc,pic
                    ,face,stat);
        }


    }
}
