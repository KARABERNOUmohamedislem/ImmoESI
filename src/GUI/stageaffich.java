package GUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import noyeu.Agence;
import noyeu.BiensImmobiliers;

import java.io.IOException;
import java.util.ArrayList;

public class stageaffich extends Stage {

       public void firstwindow(Stage window,Agence agence)
       {

           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("firstwindow.fxml"));
           Parent root;
           try {
               root = loader.load();
               Scene f = new Scene(root);
               window.setScene(f);
               controlfirstwindow controller = loader.getController();//this how we creat the controller
               controller.setAgence(agence);
               controller.setWindow(window);
               window.show();
           }
           catch (Exception e)
           {
               System.out.printf("ggggggggg");
           }
       }



    public void connectwindow(Stage window,Agence a)
    {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("adminconnect.fxml"));
        Parent root;
        try {
            root = loader.load();
            Scene f = new Scene(root);
            window.setScene(f);
            controlconnect controller = loader.getController();//this how we creat the controller

            controller.setAgence(a);//we put the agency in a attribut in tha controlelr
            controller.setWindow(window);
            window.show();
        }
        catch (Exception e)
        {
            System.out.printf("ggggggggg");
        }

    }







    public void mainchoicewindow(Stage window,Agence a)
    {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("mainChoiceWindow.fxml"));
        Parent root;
        try {
            root = loader.load();
            Scene f = new Scene(root);
            window.setScene(f);
            mainchoicecontrol controller = loader.getController();//this how we creat the controller

            controller.setAgence(a);//we put the agency in a attribut in tha controlelr
             controller.setWindow(window);
            window.show();
        }
        catch (IOException e)
        {
            System.out.printf("ggggggggg1");
        }

    }




    public void standardchoicewindow(Stage window,Agence a)
    {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("standardchoice.fxml"));
        Parent root;
        try {
            root = loader.load();
            Scene f = new Scene(root);
            window.setScene(f);
            standardwindowcontrol controller = loader.getController();//this how we creat the controller

            controller.setAgence(a);//we put the agency in a attribut in tha controlelr
            controller.setWindow(window);
            window.show();
        }
        catch (IOException e)
        {
            System.out.printf("ggggggggg2");
        }

    }


    public void error()
    {
        Stage window=new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("error.fxml"));
        Parent root;
        try {
            root = loader.load();
            Scene f = new Scene(root);
            window.setScene(f);
            errorc controller = loader.getController();//this how we creat the controller


            window.show();
        }
        catch (IOException e)
        {
            System.out.printf("ggggggggg2");
        }

    }


    public void affichagewindow(Agence agence,ArrayList<BiensImmobiliers> lesbien)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("affichage.fxml"));
        Parent root;
        try {
            root = load.load();
            Scene f = new Scene(root);
            window.setScene(f);
            controlAffichage g = load.getController();//this how we creat the controller
            g.setAgence(agence );
            g.setLesbien(lesbien);//we put the agency in a attribut in tha controlelr
            window.show();
        }
        catch (Exception e)
        {
            System.out.printf("ggggggggg3");
        }
    }







    public void searchprop(Agence a)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("searchprop.fxml"));
        Parent root;
        try {
            root = load.load();
            Scene f = new Scene(root);
            window.setScene(f);
            searchpropcontrol g = load.getController();//this how we creat the controller

            g.setAgence(a);//we put the agency in a attribut in tha controlelr
            window.show();
        }
        catch (Exception e)
        {
            System.out.printf("ggggggggg5");
        }

    }

public void addgood(Agence a)
     {
         Stage window = new Stage();
         FXMLLoader load = new FXMLLoader();
         load.setLocation(getClass().getResource("addGoods.fxml"));
         Parent root;
         try {
             root = load.load();
             Scene f = new Scene(root);
             window.setScene(f);
             addGoodController g = load.getController();//this how we creat the controller

             g.setAgence(a);//we put the agency in a attribut in tha controlelr
             window.show();
         }
         catch (Exception e)
         {
             System.out.printf("ggggggggg6");
         }

     }


     public void addhouse(Agence a)
     {
         Stage window = new Stage();
         FXMLLoader load = new FXMLLoader();
         load.setLocation(getClass().getResource("addhouse.fxml"));
         Parent root;
         try {
             root = load.load();
             Scene f = new Scene(root);
             window.setScene(f);
             addhousecontrol g = load.getController();//this how we creat the controller

             g.setAgence(a);//we put the agency in a attribut in tha controlelr
             window.show();
         }
         catch (Exception e)
         {
             System.out.printf("ggggggggg7");
         }

     }



    public void addaprtm(Agence a)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("addaprtm.fxml"));
        Parent root;
        try {
            root = load.load();
            Scene f = new Scene(root);
            window.setScene(f);
            addaprtmcontrol g = load.getController();//this how we creat the controller

            g.setAgence(a);//we put the agency in a attribut in tha controlelr
            window.show();
        }
        catch (Exception e)
        {
            System.out.printf("ggggggggg7");
        }

    }



    public void addtrn(Agence a)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("addtrn.fxml"));
        Parent root;
        try {
            root = load.load();
            Scene f = new Scene(root);
            window.setScene(f);
            addtrncontrol g = load.getController();//this how we creat the controller

            g.setAgence(a);//we put the agency in a attribut in tha controlelr
            window.show();
        }
        catch (Exception e)
        {
            System.out.printf("ggggggggg7");
        }

    }


    public void recherchfiltr(Agence a)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("rechercheCRTR.fxml"));
        Parent root;
        try {
            System.out.println("0");
            root = load.load();
            System.out.println("fghjkl2");
            Scene f = new Scene(root);
            System.out.println("fghjkl3");
            window.setScene(f);
            System.out.println("fghjkl4");
            filtrecontrol g = load.getController();//this how we creat the controller

            System.out.println("fghjkl5");

            g.setAgence(a);//we put the agency in a attribut in tha controlelr
            window.show();
        }
        catch (IOException e)
        {
            System.out.printf("ggggggggg97");
        }

    }

    public void modiferwindow(Agence agence,BiensImmobiliers bien)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("modifier.fxml"));
        Parent root;
        try {
            root = load.load();
            Scene f = new Scene(root);
            window.setScene(f);
            modifiercontrol g = load.getController();//this how we creat the controller

            g.setAgence(agence);//we put the agency in a attribut in tha controlelr
            g.setBien(bien);
            window.show();
        }
        catch (Exception e)
        {
            System.out.printf("ggggggggg7");
        }
    }


    public void affmsg(Agence agence)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("affichermsg.fxml"));
        Parent root;
        try {
            System.out.println("0");
            root = load.load();
            System.out.println("fghjkl2");
            Scene f = new Scene(root);
            System.out.println("fghjkl3");
            window.setScene(f);
            System.out.println("fghjkl4");
            msgcontrol g = load.getController();//this how we creat the controller

            System.out.println("fghjkl5");

            g.setAgence(agence);//we put the agency in a attribut in tha controlelr
            window.show();
        }
        catch (IOException e)
        {
            System.out.printf("ggggggggg97");
        }


    }

    public void affichagewindowstan(Agence agence,ArrayList<BiensImmobiliers> lesbien)
    {
        Stage window = new Stage();
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("affstand.fxml"));
        Parent root;
        try {
            root = load.load();
            Scene f = new Scene(root);
            window.setScene(f);
            affstandcontrol g = load.getController();//this how we creat the controller
            g.setAgence(agence );
            g.setLesbien(lesbien);//we put the agency in a attribut in tha controlelr
            window.show();
        }
        catch (Exception e)
        {
            System.out.printf("ggggggggg3");
        }
    }

}
