//package sample;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }
//
//
//    public static void main(String[] args) {
//
//        System.out.println(System.getProperty("user.dir"));
//
//
//        launch(args);
//    }
//}


package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Group root = new Group();
        primaryStage.setTitle("Hello World");

        Scene myScene = new Scene(root, 600, 400);
        myScene.setFill(Color.AQUA);
        primaryStage.setScene(myScene);
        primaryStage.show();







        NodeList.createNodes();
        NodeList.myNode1.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
