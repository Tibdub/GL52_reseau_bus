package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Reseau de bus");
        Group root = new Group();
        Scene scene1 = new Scene(root,1280,800);

        Menu mon_menu = new Menu();
        root.getChildren().add(mon_menu);

        Carte ma_carte = new Carte(primaryStage);
        root.getChildren().add(ma_carte);



        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}










