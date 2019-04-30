package sample;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.Parent;
import javafx.scene.shape.Circle;

public class Arret extends Parent {

    static final Integer widthArret = 10;
    private String nomArret;
    Circle logoArret;

    public Arret() {

        logoArret = new Circle((double)widthArret,Color.GRAY);

        logoArret.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                logoArret.setCenterX(event.getX());
                logoArret.setCenterY(event.getY());
            }
        });

        //cahngement de couleur lors du survol du button
        logoArret.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {logoArret.setFill(Color.BLACK);}
        });
        logoArret.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {logoArret.setFill(Color.GREY);}
        });
    }

    public String getNomArret() {
        return nomArret;
    }

    public void setNomArret(String nomArret) {
        this.nomArret = nomArret;
    }
}
