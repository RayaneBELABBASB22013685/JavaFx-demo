package com.example.pendu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class jeuPenduMain extends Application {
    private int life ;
    private Button btnreplay;
    private Label labelpendu;
    private Image image;
    private ImageView iv;
    private  BorderPane root;
    private HBox hBox;


    @Override
    public void start(Stage primaryStage) throws Exception {

        root = new BorderPane();
        labelpendu = new Label();
        image= new Image(jeuPenduMain.class.getResource("pendu7.png").toString());
        iv= new ImageView();
        iv.setImage(image);
        labelpendu.setGraphic(iv);
        hBox=new HBox();
        hBox.getChildren().add(labelpendu);



        root.setCenter(hBox);




        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("pendu");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();

    }
}
