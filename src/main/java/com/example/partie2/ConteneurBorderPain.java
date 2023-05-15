package com.example.partie2;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ConteneurBorderPain extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label labelChoice;
    private Pane colorPane;
    private HBox btnBot;

    @Override
    public void start(Stage primaryStage) {

        root = new BorderPane();

        labelChoice = new Label();
        labelChoice.setAlignment(Pos.CENTER);

        colorPane = new Pane();
        colorPane.setPrefSize(400,200);

        btnBot = new HBox();
        btnBot.setAlignment(Pos.CENTER);
        btnBot.setPadding(new Insets(10,5,10,5));

        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");
        rouge.setOnAction(event -> {
            labelChoice.setText("Rouge choisi " + ++nbRouge + " fois");
            colorPane.setStyle("-fx-background-color: red");
        });
        vert.setOnAction(event -> {
            labelChoice.setText("Vert choisi " + ++nbVert + " fois");
            colorPane.setStyle("-fx-background-color: green");
        });
        bleu.setOnAction(event -> {
            labelChoice.setText("Bleu choisi " + ++nbBleu + " fois");
            colorPane.setStyle("-fx-background-color: blue");
        });
        btnBot.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(colorPane);
        root.setTop(labelChoice);
        root.setBottom(btnBot);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}