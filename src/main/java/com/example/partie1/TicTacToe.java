package com.example.partie1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TicTacToe extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane BASE = new GridPane();

        //les images de l'exo
        ImageView imageCroix = new ImageView("/Croix.png");
        ImageView imageRond = new ImageView("Exercice2/Rond.png");
        ImageView imageVide = new ImageView("Exercice2/Vide.png");

        //labem
        Label Croix00 = new Label();
        Croix00.setGraphic(imageCroix);


        Scene scene = new Scene(BASE );

        primaryStage.setScene( scene );
        primaryStage.setWidth( 300 );
        primaryStage.setHeight( 300 );
        primaryStage.setResizable(false);
        primaryStage.setTitle("Tic Tac Toe");

        primaryStage.show();


    }
}
