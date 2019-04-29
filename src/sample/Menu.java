package sample;

import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;

public class Menu extends Parent {

    /**TODO
     * Mettre la classe Carte en param de Menu pour acceder au contenu et le mettre dans un des onglets ?
      */

    public Menu() {


        TabPane layout = new TabPane();
        layout.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        Tab tab1 = new Tab("Carte");


        layout.getTabs().add(tab1);


        Tab tab2 = new Tab("Read");
        layout.getTabs().add(tab2);

        this.getChildren().add(layout);
    }
}
