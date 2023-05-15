package com.example.PacMAN;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static javafx.scene.paint.Color.RED;

public class Obstacle extends Rectangle {
    public Obstacle(double x, double y, int width, int height) {
        super(x,y,width,height);
        super.setFill(RED);
    }

    boolean estEnCollision2(Personnage personnage){
        return getBoundsInParent().contains(personnage.getBoundsInParent())
                || personnage.getBoundsInParent().contains(getBoundsInParent());
    }
}