package com.example.partie1;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Random;

public class TicTacToe extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Create the GridPane
        GridPane root = new GridPane();
        root.setGridLinesVisible(true);
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getColumnConstraints().add(new ColumnConstraints(50));

        //Create the labels with the images
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                Random random = new Random();
                int nombre = random.nextInt(3);
                if (nombre==0){
                    Label label1 = new Label();
                    Image image1 = new Image( TicTacToe.class.getResource("Croix.png").toString() );
                    ImageView iv1 = new ImageView();
                    iv1.setImage(image1);
                    label1.setGraphic(iv1);
                    GridPane.setConstraints(label1,i,j);
                    root.getChildren().addAll(label1);
                }
                if (nombre==1){
                    Label label2 = new Label();
                    Image image2 = new Image( TicTacToe.class.getResource("Rond.png").toString() );
                    ImageView iv2 = new ImageView();
                    iv2.setImage(image2);
                    label2.setGraphic(iv2);
                    GridPane.setConstraints(label2,i,j);
                    root.getChildren().addAll(label2);
                }
                if (nombre==2){
                    Label label3 = new Label();
                    Image image3 = new Image( TicTacToe.class.getResource("Vide.png").toString() );
                    ImageView iv3 = new ImageView();
                    iv3.setImage(image3);
                    label3.setGraphic(iv3);
                    GridPane.setConstraints(label3,i,j);
                    root.getChildren().addAll(label3);
                }
            }

        }




        Scene scene = new Scene(root );

        primaryStage.setScene( scene );
        primaryStage.setResizable(false);
        primaryStage.setTitle("Tic Tac Toe");

        primaryStage.show();


    }
}
