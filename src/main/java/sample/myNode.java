package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class myNode {

    int myNodeID;
    int correctChoice;

    Pane myPane;
    Label questionLabel = new Label("Question Label");
    Label errorMessageLabel = new Label("Error");
    RadioButton choice1 = new RadioButton("Choice 1");
    RadioButton choice2 = new RadioButton("Choice 2");
    RadioButton choice3 = new RadioButton("Choice 3");
    ToggleGroup toggleGroup = new ToggleGroup();
    Button submitButton = new Button("Submit");


    void setup() {

        myPane = new Pane();
        myPane.setVisible(true);
        myPane.getChildren().add(questionLabel);
        myPane.getChildren().add(errorMessageLabel);
        myPane.getChildren().add(choice1);
        myPane.getChildren().add(choice2);
        myPane.getChildren().add(choice3);
        myPane.getChildren().add(submitButton);

        choice1.setToggleGroup(toggleGroup);
        choice2.setToggleGroup(toggleGroup);
        choice3.setToggleGroup(toggleGroup);

        errorMessageLabel.setTextFill(Color.RED);


        try {
            Controller.getMyGridPane().add(myPane, 0, 1, 1, 1);
//            this.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        myPane.setVisible(true);
    }

    public void hide() {
        myPane.setVisible(false);
//        Controller.myAnchorPane.getChildren().remove(myPane);

    }

    public myNode(int myNodeID) {
//        Label myLabel = new Label();
//        Controller.getMyGridPane().add(myLabel, 0, 1);
//        myLabel.setVisible(true);

    }


    public myNode(int myNodeID, int correctChoice, String questionLabelText, String choice1Text, String choice2Text, String choice3Text) {
        setup();

        this.myNodeID = myNodeID;
        this.correctChoice = correctChoice;
        choice1.setText(choice1Text);
        choice2.setText(choice2Text);
        choice3.setText(choice3Text);
        questionLabel.setText(questionLabelText);
        errorMessageLabel.setText("");

    }
}
