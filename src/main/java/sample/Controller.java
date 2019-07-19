package sample;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class Controller {
    public ChoiceBox myChoiceBox;
    public Button myButton;
    public AnchorPane topMenu;
    public static GridPane myGridPane;

    public static synchronized GridPane getMyGridPane() {
        if(myGridPane == null) {
            myGridPane = new GridPane();
            myGridPane.setVisible(true);

            myGridPane.addRow(2);
            myGridPane.addColumn(1);
            System.out.println("columns: " + myGridPane.getColumnCount() + " rows: " + myGridPane.getRowCount());

        }
        return myGridPane;
    }

    public void setup() {
        AnchorPane topMenu = new AnchorPane();
        topMenu.getChildren().add(myChoiceBox);
        topMenu.getChildren().add(myButton);
        myGridPane.add(topMenu, 0, 1);
        topMenu.setVisible(false);
    }


    public void myButtonClicked(ActionEvent actionEvent) {
        System.out.println("myButtonClicked");

        NodeList.myNode1.show();

        System.out.println(NodeList.myNode1.myPane.getChildren());

    }
}


