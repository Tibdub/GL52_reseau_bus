package sample;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Carte extends Parent {

    private FileChooser fileChooser;
    private File file;

    public Carte(Stage primaryStage) {

        fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image files", "*.png")
        );
        Button button = new Button("Importer une carte");
        button.setTranslateX(940);
        button.setTranslateY(400);

        button.setOnAction(e -> {
            file = fileChooser.showOpenDialog(primaryStage);
            if(file != null){

                ImageView fond_carte = null;
                try {
                    fond_carte = new ImageView(new Image(new FileInputStream(file.getPath())));
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

                /**TODO : faire ça proprement ?**/
                //Pour le moment ne remplace pas l'image, on recouvre avec un carré blanc puis on en créer une nouvelle..
                Rectangle rec_cleaner = new Rectangle(0,0,850,1200);
                rec_cleaner.setFill(Color.WHITE);
                this.getChildren().add(rec_cleaner);

                fond_carte.setFitHeight(750);
                fond_carte.setPreserveRatio(true);
                fond_carte.setX(20);
                fond_carte.setY(20);
                this.getChildren().add(fond_carte);
            }
        });

        this.getChildren().add(button);
    }
}
