package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import noyeu.*;

public class modifiercontrol {
    public ChoiceBox<Nature> nature =new ChoiceBox<>();
    public CheckBox cnature;
    public CheckBox cnego;
    public TextField surface;
    public CheckBox csurface;
    public TextField prix;
    public CheckBox cprix;
    public TextField wilaya;
    public CheckBox cwilaya;
    public ChoiceBox<Boolean> nego=new ChoiceBox<>();
    Agence agence;

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    BiensImmobiliers bien;

    public void setBien(BiensImmobiliers bien) {
        this.bien = bien;
    }

    public void initialize(){
        Avendre sale=new Avendre();
        Location rent =new Location();
        Echange  exchange=new Echange();
        nature.getItems().addAll(sale.getNature(),rent.getNature(),exchange.getNature());
        System.out.println("fffffffffffffffffffffffffffffff");

        nature.setValue(sale.getNature());

        Boolean yes=true;
        Boolean no=false;
        nego.getItems().addAll(yes,no);
        nego.setValue(no);


    }


    public VBox vboxlayout;
    public Button displaylab;




    public void submit(ActionEvent actionEvent) {
        System.out.println("dfghjklm");
        float surf=0;
        int nbetg;
        float prixag=0;
        float prixp=0;
        int nbp=0;
        Wilaya w = null;
        boolean nego = false;
        if(cwilaya.isSelected())
        {
            try {
                int b=Integer.parseInt(this.wilaya.getText());
                w=this.agence.getListWilaya()[b];

            }
            catch (NumberFormatException e)
            {
                System.out.printf("problem wilaya");
            }


        }
        else{w=this.bien.getWilaya();}
        if(cnego.isSelected())
        {
            nego=this.nego.getValue();

        }
        else {nego=this.bien.isNegociable();}

        if(csurface.isSelected())
        {
            try {
                float b1=Float.parseFloat(this.surface.getText());
                surf=b1;


            }
            catch (NumberFormatException e)
            {
                System.out.printf("problem surface");
            }
        }
        else {surf=this.bien.getSuperficie();}

        if(cprix.isSelected())
        {
            try {
                float b1=Float.parseFloat(this.prix.getText());
                prixp=b1;

            }
            catch (NumberFormatException e)
            {
                System.out.printf("problem prix");
            }

        }
        else {prixp=this.bien.getPrixPropose();}

        if(cnature.isSelected())
        {
            if(new Avendre().getNature()==this.nature.getValue()) {
                this.bien.modifier(w, surf, this.bien.getProprietaire(), new Avendre(), prixp, nego, this.bien.getDescription());
            }
            if(new Location().getNature()==this.nature.getValue()) {
                this.bien.modifier(w, surf, this.bien.getProprietaire(), new Location(), prixp, nego, this.bien.getDescription());
            }
            if(new Echange().getNature()==this.nature.getValue()) {
                this.bien.modifier(w, surf, this.bien.getProprietaire(), new Echange(this.agence.getListWilaya()[1]), prixp, nego, this.bien.getDescription());
            }


        }
        else
        {
            this.bien.modifier(w, surf, this.bien.getProprietaire(), this.bien.getNatureTransaction(), prixp, nego, this.bien.getDescription());

        }
    }
}
