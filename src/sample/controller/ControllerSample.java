package sample.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.ImageCursor;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import sample.model.SampleModel;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSample implements Initializable {

    @FXML private Button btnImportMap;
    @FXML private ImageView map;

    private SampleModel model;

    @FXML
    public void importMap(Event e)
    {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Picture PNG", "*.png"));
        File f = fc.showOpenDialog(null);
        if (f != null){
            this.map.setImage(new Image("file:" + f.getAbsolutePath()));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
