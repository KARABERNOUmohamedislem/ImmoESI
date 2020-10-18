package GUI;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import noyeu.Agence;

public class msgcontrol {
    public Label displaylab;
    public VBox layout;
    Agence agence;

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public void dispaly(MouseEvent mouseEvent) {
        int i=0;
        for(i=0;i<this.agence.getListBien().size();i++)
        {
            Label lab=new Label("les message du bien"+(i+1)+" :");
            this.layout.getChildren().add(lab);
            for(int j=0;j<this.agence.getListBien().get(i).msg.size();j++)
            {
                Label lab1 =new Label("message"+(j+1)+" : "+this.agence.getListBien().get(i).msg.get(j));
                this.layout.getChildren().add(lab1);
            }

        }
    }
}
