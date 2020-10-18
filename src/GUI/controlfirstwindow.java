package GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import noyeu.Agence;

public class controlfirstwindow {
    private Agence agence;
    Stage window;

    public void setWindow(Stage window) {
        this.window = window;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public RadioButton standarduserRB;
    public RadioButton adminRb;
    public Button submitBt;
    public ToggleGroup userselect;

    public void submitconnection(ActionEvent actionEvent) {

        stageaffich window=new stageaffich();
        if(userselect.getSelectedToggle().equals(standarduserRB))
        {
            window.standardchoicewindow(this.window,this.agence);
        }
        else
        {
            if(userselect.getSelectedToggle().equals(adminRb))
            {
                window.connectwindow(this.window,this.agence);
            }
        }

    }
}
