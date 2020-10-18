package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import noyeu.*;

import java.util.ArrayList;

public class filtrecontrol {



    public ChoiceBox<Nature> nature =new ChoiceBox<>();
    public CheckBox bynat;
    // ObservableList<Nature> nat = FXCollections.observableArrayList(Nature.Avendre,Nature.Echange,Nature.Location);

    Agence agence;


    public CheckBox cwilaya;
    public TextField wilaya;
    public CheckBox cprixmax;
    public TextField prixmax;
    public CheckBox cprixmin;
    public TextField prixmin;
    public CheckBox csurface;
    public TextField surface;
    public CheckBox cnbpiece;
    public TextField nbpiece;


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



    public void search(ActionEvent actionEvent) {
        ArrayList<Critere> critere=new ArrayList<Critere>();
        Avendre n = new Avendre();
        Location l = new Location();
        Echange e =new Echange();
        Surface s=new Surface();
        PrixMax px=new PrixMax();
        PrixMin pn=new PrixMin();
        NbPiece nbp=new NbPiece();
        Wilaya w=new Wilaya();

        if(cwilaya.isSelected())
        {
            try {
                int b=Integer.parseInt(this.wilaya.getText());
                w=this.agence.getListWilaya()[b];
                critere.add(w);

            }
            catch (NumberFormatException r)
            {
                System.out.printf("problem wilaya");
            }
        }

        if(csurface.isSelected()) {
            try {
                float b1 = Float.parseFloat(this.surface.getText());
                s.setVal(b1);
                critere.add(s);

            } catch (NumberFormatException r) {
                System.out.printf("problem surface");
            }
        }


        if(cprixmax.isSelected()) {
            try {
                float b1 = Float.parseFloat(this.prixmax.getText());
                px.setVal(b1);
                critere.add(px);

            } catch (NumberFormatException r) {
                System.out.printf("problem prixmax");
            }

        }

        if(cprixmin.isSelected()) {
            try {
                float b1 = Float.parseFloat(this.prixmin.getText());
                pn.setVal(b1);
                critere.add(pn);

            } catch (NumberFormatException r) {
                System.out.printf("problem prixmin");
            }
        }


        if(cnbpiece.isSelected()) {
            try {
                int b1 = Integer.parseInt(this.nbpiece.getText());
                nbp.setVal(b1);
                critere.add(nbp);

            } catch (NumberFormatException r) {
                System.out.printf("problem nb poece");
            }
        }

       if(bynat.isSelected())
        {
           Cnature cn=new Cnature(nature.getValue());
           critere.add(cn);


        }

        stageaffich window=new stageaffich();
        ArrayList<BiensImmobiliers> resu=new ArrayList<BiensImmobiliers>();
        resu=this.agence.rechercheFiltre(critere);
        window.affichagewindow(this.agence,resu);
    }
}
