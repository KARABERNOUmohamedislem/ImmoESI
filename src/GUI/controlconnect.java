package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import noyeu.Agence;

public class controlconnect {
    private Agence agence;
    Stage window;

    public void setWindow(Stage window) {
        this.window = window;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public TextField usernamefield;
    public TextField passwordfield;
    public Button submitbutton;

    public void connect(ActionEvent actionEvent) {
        stageaffich window=new stageaffich();
        if((this.agence.getId().equals(usernamefield.getText()))&&(this.agence.getPassword().equals(passwordfield.getText())))
        {

            stageaffich j=new stageaffich();
            j.mainchoicewindow(this.window,this.agence);

        }
        else
        {

            this.passwordfield.setStyle("-fx-text-fill:red;-fx-font-size:12px;");
            this.usernamefield.setStyle("-fx-text-fill:red;-fx-font-size:12px;");
            stageaffich stg =new stageaffich();
            stg.error();
        }

    }
}
