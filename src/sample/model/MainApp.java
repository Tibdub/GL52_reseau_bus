package sample.model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Réseau de bus");

        initRootLayout();
        initPrimaryStage();
        addSample();
    }



    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        rootLayout = new RootLayout().initRootLayout();
    }

    /**
     * Initializes the primary layout.
     * Must be used after initializes the root layout
     */
    public void initPrimaryStage(){
        Scene scene = new Scene(rootLayout,1280,800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void addSample() {
        SampleModel sample = new SampleModel();
        rootLayout.setCenter(sample.initSample());
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
