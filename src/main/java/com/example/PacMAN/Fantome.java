package com.example.PacMAN;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Fantome extends Personnage {

    private Rectangle basCorps;


    private Circle oeilGauche;
    private Circle retineGauche;

    private Circle oeilDroit;
    private Circle retineDroite;


    public Fantome() {
        super("droite", Color.BLUE, Color.BLUE);
        basCorps = new Rectangle(0, 10, 20, 10);
        basCorps.setFill(Color.BLUE);

        oeilGauche = new Circle(6, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineGauche = new Circle(oeilGauche.getCenterX() + 1, 6, 1, Color.BLACK);

        oeilDroit = new Circle(14, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineDroite = new Circle(oeilDroit.getCenterX() + 1, 6, 1, Color.BLACK);


        super.getChildren().add(basCorps);
        super.getChildren().add(oeilGauche);
        super.getChildren().add(retineGauche);
        super.getChildren().add(oeilDroit);
        super.getChildren().add(retineDroite);
    }

    @Override
    public void deplacerAGauche() {
        super.deplacerAGauche();
        //affichage yeux
        retineGauche.setCenterY(oeilGauche.getCenterY());
        retineDroite.setCenterY(oeilDroit.getCenterY());
        retineGauche.setCenterX(oeilGauche.getCenterX()-1);
        retineDroite.setCenterX(oeilDroit.getCenterX()-1);

    }

    @Override
    public void deplacerADroite(double largeurJeu) {
        super.deplacerADroite(largeurJeu);
        retineGauche.setCenterY(oeilGauche.getCenterY());
        retineDroite.setCenterY(oeilDroit.getCenterY());
        retineGauche.setCenterX(oeilGauche.getCenterX()+1);
        retineDroite.setCenterX(oeilDroit.getCenterX()+1);
    }

    @Override
    public void deplacerEnBas(double hauteurJeu) {
        super.deplacerEnBas(hauteurJeu);
        //affichage yeux
        retineGauche.setCenterX(oeilGauche.getCenterX());
        retineDroite.setCenterX(oeilDroit.getCenterX());
        retineGauche.setCenterY(oeilGauche.getCenterY()+1);
        retineDroite.setCenterY(oeilDroit.getCenterY()+1);
    }

    @Override
    public void deplacerEnHaut() {
        super.deplacerEnHaut();
        //affichage yeux
        retineGauche.setCenterX(oeilGauche.getCenterX());
        retineDroite.setCenterX(oeilDroit.getCenterX());
        retineGauche.setCenterY(oeilGauche.getCenterY()-1);
        retineDroite.setCenterY(oeilDroit.getCenterY()-1);


    }


}