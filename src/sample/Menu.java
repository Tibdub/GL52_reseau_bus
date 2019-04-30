package sample;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Menu extends Parent {

    /**
     * TODO
     * Faire un Hbox pour le menu
     */

    public Menu() {

        Text addArret = new Text("Ajouter un arret");
        addArret.setX(960);
        addArret.setY(170);

        Circle masterArret = new Circle(20, Color.GRAY);
        masterArret.setCenterX(1000);
        masterArret.setCenterY(200);

        //Création de l'arret lors du clic
        masterArret.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                creationArret();
                System.out.println(event.getX());
            }
        });


        //cahngement de couleur lors du survol du button
        masterArret.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {masterArret.setFill(Color.BLACK);}
        });
        masterArret.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {masterArret.setFill(Color.GREY);}
        });



        this.getChildren().add(addArret);
        this.getChildren().add(masterArret);
    }

    public void creationArret(){
        Arret arret = new Arret();
        arret.logoArret.setCenterX(100);
        arret.logoArret.setCenterY(100);
        this.getChildren().add(arret.logoArret);
        System.out.println("Arret ajouté !!");
    }
}

