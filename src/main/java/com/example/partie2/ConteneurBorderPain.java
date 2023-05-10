package com.example.partie2;

port javafx.application.Application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class ConteneurBorderPain extends Application {


    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();

        HBox topBox = new HBox();
        topBox.setAlignment(Pos.CENTER );

        Label labelChoice = new Label(" ");

        topBox.getChildren().add(labelChoice);
        root.setTop(topBox);

        HBox botBox = new HBox();

        Scene scene = new Scene(root);

        primaryStage.setScene( scene );
        primaryStage.setTitle("Hello application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();

    }

}

