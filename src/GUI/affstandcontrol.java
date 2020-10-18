package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import noyeu.*;

import java.util.ArrayList;


public class affstandcontrol {




    Agence agence;

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Label displaylab;
    public VBox vboxlayout;
    private ArrayList<BiensImmobiliers> lesbien =new ArrayList<BiensImmobiliers>();


    public void setLesbien(ArrayList<BiensImmobiliers> lesbien) {
        this.lesbien = lesbien;
    }



    public void display(MouseEvent mouseEvent) {
        int h=this.lesbien.size();
        Avendre avendre =new Avendre();
        Echange echange=new Echange();
        Location location=new Location();
        ///////add a conditio if the list was empty //////
        System.out.println(h);
        for (int i=0;i<h;i++) {
            if (this.lesbien.get(i) instanceof Maison) {
                Label lab=new Label("this is a house");
                Label lab1 = new Label("state :");
                Label lab2 = new Label(this.lesbien.get(i).getWilaya().getNomWilaya());

                HBox hBox1=new HBox();
                hBox1.getChildren().addAll(lab1,lab2);

                Label lab3 = new Label("surface :");
                Label lab4 = new Label(""+this.lesbien.get(i).getSuperficie());

                HBox hBox2=new HBox();
                hBox2.getChildren().addAll(lab3,lab4);

                Label lab5 = new Label("adding date");
                Label lab6 = new Label(""+this.lesbien.get(i).getDate());
                HBox hBox3=new HBox();
                hBox3.getChildren().addAll(lab5,lab6);

                Label lab7 = new Label("description :");
                Label lab8 = new Label(this.lesbien.get(i).getDescription());
                HBox hBox4=new HBox();
                hBox4.getChildren().addAll(lab7,lab8);

                Label lab9 = new Label("nature of transaction :");
                Label lab10 = new Label();
                if(this.lesbien.get(i).getNatureTransaction() instanceof Avendre)
                {
                    lab10.setText("for sale");
                }
                if(this.lesbien.get(i).getNatureTransaction() instanceof Location)
                {
                    lab10.setText("for rent");
                }
                if(this.lesbien.get(i).getNatureTransaction() instanceof Echange)
                {
                    lab10.setText("for exchange with"+" "+((Echange) this.lesbien.get(i).getNatureTransaction()).getWilayaDEchange().getNomWilaya());
                }


                HBox hBox5=new HBox();
                hBox5.getChildren().addAll(lab9,lab10);

                Label lab11 = new Label("full price :");
                Label lab12 = new Label(""+this.lesbien.get(i).getPrixAgence());

                HBox hBox6=new HBox();
                hBox6.getChildren().addAll(lab11,lab12);

                Label lab13 = new Label("intial price :");
                Label lab14 = new Label(""+this.lesbien.get(i).getPrixPropose());

                HBox hBox7=new HBox();
                hBox7.getChildren().addAll(lab13,lab14);

                Label lab15 = new Label("negociable :");
                Label lab16 = new Label(this.lesbien.get(i).isNegociable()? "oui":"non");
                HBox hBox8=new HBox();
                hBox8.getChildren().addAll(lab15,lab16);

                Label lab17 = new Label("pool is available :");
                Label lab18 = new Label(((Maison) this.lesbien.get(i)).isPiscine()?"oui":"non");

                HBox hBox9=new HBox();
                hBox9.getChildren().addAll(lab17,lab18);

                Label lab19 = new Label("garage is available :");
                Label lab20 = new Label(((Maison) this.lesbien.get(i)).isGarage()?"oui":"non");

                HBox hBox10=new HBox();
                hBox10.getChildren().addAll(lab19,lab20);


                Label lab21 = new Label("how many floors :");
                Label lab22 = new Label(""+((Maison) this.lesbien.get(i)).getNbrEtage());
                HBox hBox11=new HBox();
                hBox11 .getChildren().addAll(lab21,lab22);


                Label lab23 = new Label("garden is available :");
                Label lab24 = new Label(((Maison) this.lesbien.get(i)).isJardin()?"oui":"non");

                HBox hBox12=new HBox();
                hBox12.getChildren().addAll(lab23,lab24);
                System.out.println(this.lesbien.get(i).getProprietaire().getNom());
                vboxlayout.getChildren().addAll(lab,hBox1,hBox2,hBox3,hBox4,hBox5,hBox6,hBox7,hBox8,hBox9,hBox10,hBox11,hBox12);
            }

            if (this.lesbien.get(i) instanceof Appartement) {
                Label lab=new Label("this is an apartment");
                Label lab1 = new Label("state :");
                Label lab2 = new Label(this.lesbien.get(i).getWilaya().getNomWilaya());

                HBox hBox1=new HBox();


                Label lab3 = new Label("surface :");
                Label lab4 = new Label(""+this.lesbien.get(i).getSuperficie());

                HBox hBox2=new HBox();
                hBox2.getChildren().addAll(lab3,lab4);

                Label lab5 = new Label("adding date");
                Label lab6 = new Label(""+this.lesbien.get(i).getDate());
                HBox hBox3=new HBox();
                hBox3.getChildren().addAll(lab5,lab6);

                Label lab7 = new Label("description :");
                Label lab8 = new Label(this.lesbien.get(i).getDescription());
                HBox hBox4=new HBox();
                hBox4.getChildren().addAll(lab7,lab8);

                Label lab9 = new Label("nature of transaction :");
                Label lab10 = new Label();
                if(this.lesbien.get(i).getNatureTransaction() instanceof Avendre)
                {
                    lab10.setText("for sale");
                }
                if(this.lesbien.get(i).getNatureTransaction() instanceof Location)
                {
                    lab10.setText("for rent");
                }
                if(this.lesbien.get(i).getNatureTransaction() instanceof Echange)
                {
                    lab10.setText("for exchange with"+" "+((Echange) this.lesbien.get(i).getNatureTransaction()).getWilayaDEchange().getNomWilaya());
                }

                HBox hBox5=new HBox();
                hBox5.getChildren().addAll(lab9,lab10);

                Label lab11 = new Label("full price :");
                Label lab12 = new Label(""+this.lesbien.get(i).getPrixAgence());

                HBox hBox6=new HBox();
                hBox6.getChildren().addAll(lab11,lab12);

                Label lab13 = new Label("intial price :");
                Label lab14 = new Label(""+this.lesbien.get(i).getPrixPropose());

                HBox hBox7=new HBox();
                hBox7.getChildren().addAll(lab13,lab14);

                Label lab15 = new Label("negociable :");
                Label lab16 = new Label(this.lesbien.get(i).isNegociable()? "oui":"non");
                HBox hBox8=new HBox();
                hBox8.getChildren().addAll(lab15,lab16);



                Label lab17 = new Label("floor num=° :");
                Label lab18 = new Label(""+((Appartement) this.lesbien.get(i)).getEtage());
                HBox hBox9=new HBox();

                Label lab19 = new Label("Duplex :");
                Label lab20 = new Label(((Appartement) this.lesbien.get(i)).isDuplex()?"oui":"non");

                HBox hBox10=new HBox();

                Label lab21 = new Label("elevator :");
                Label lab22 = new Label(((Appartement) this.lesbien.get(i)).isAscenseur()?"oui":"non");

                HBox hBox11=new HBox();

                hBox1.getChildren().addAll(lab1,lab2);

                hBox9.getChildren().addAll(lab17,lab18);
                hBox10.getChildren().addAll(lab19,lab20);
                hBox11 .getChildren().addAll(lab21,lab22);



                vboxlayout.getChildren().addAll(lab,hBox1,hBox2,hBox3,hBox4,hBox5,hBox6,hBox7,hBox8,hBox9,hBox10,hBox11);
            }
            if (this.lesbien.get(i) instanceof Inhabitable) {
                Label lab = new Label("this is a terrain");
                Label lab1 = new Label("state :");
                Label lab2 = new Label(this.lesbien.get(i).getWilaya().getNomWilaya());

                HBox hBox1=new HBox();


                Label lab3 = new Label("surface :");
                Label lab4 = new Label(""+this.lesbien.get(i).getSuperficie());

                HBox hBox2=new HBox();
                hBox2.getChildren().addAll(lab3,lab4);

                Label lab5 = new Label("adding date");
                Label lab6 = new Label(""+this.lesbien.get(i).getDate());
                HBox hBox3=new HBox();
                hBox3.getChildren().addAll(lab5,lab6);

                Label lab7 = new Label("description :");
                Label lab8 = new Label(this.lesbien.get(i).getDescription());
                HBox hBox4=new HBox();
                hBox4.getChildren().addAll(lab7,lab8);

                Label lab9 = new Label("nature of transaction :");
                Label lab10 = new Label();
                if(this.lesbien.get(i).getNatureTransaction() instanceof Avendre)
                {
                    lab10.setText("for sale");
                }
                if(this.lesbien.get(i).getNatureTransaction() instanceof Location)
                {
                    lab10.setText("for rent");
                }
                if(this.lesbien.get(i).getNatureTransaction() instanceof Echange)
                {
                    lab10.setText("for exchange with"+" "+((Echange) this.lesbien.get(i).getNatureTransaction()).getWilayaDEchange().getNomWilaya());
                }

                HBox hBox5=new HBox();
                hBox5.getChildren().addAll(lab9,lab10);

                Label lab11 = new Label("full price :");
                Label lab12 = new Label(""+this.lesbien.get(i).getPrixAgence());

                HBox hBox6=new HBox();
                hBox6.getChildren().addAll(lab11,lab12);

                Label lab13 = new Label("intial price :");
                Label lab14 = new Label(""+this.lesbien.get(i).getPrixPropose());

                HBox hBox7=new HBox();
                hBox7.getChildren().addAll(lab13,lab14);

                Label lab15 = new Label("negociable :");
                Label lab16 = new Label(this.lesbien.get(i).isNegociable()? "yes":"no");
                HBox hBox8=new HBox();
                hBox8.getChildren().addAll(lab15,lab16);


                Label lab17 = new Label("how many fronts :");
                Label lab18 = new Label(""+((Inhabitable) this.lesbien.get(i)).getNbrFacade());

                HBox hBox9=new HBox();

                Label lab19 = new Label("legal status :");
                Label lab20 = new Label(((Inhabitable) this.lesbien.get(i)).getStatusJuridique());

                HBox hBox10=new HBox();

                hBox1.getChildren().addAll(lab1,lab2);
                hBox9.getChildren().addAll(lab17,lab18);
                hBox10.getChildren().addAll(lab19,lab20);



                vboxlayout.getChildren().addAll(lab,hBox1,hBox2,hBox3,hBox4,hBox5,hBox6,hBox7,hBox8,hBox9,hBox10);





            }

            Button msg=new Button("message");
            TextField msg2=new TextField();
            int finalI3 = i;


            msg.setOnAction(e->{this.lesbien.get(finalI3).msg.add(msg2.getText());});


            HBox hBox14=new HBox();
            hBox14.getChildren().addAll(msg2);
            HBox hBox13=new HBox();
            hBox13.getChildren().addAll(msg);
            vboxlayout.getChildren().addAll(hBox14,hBox13);


        }

    }



}


