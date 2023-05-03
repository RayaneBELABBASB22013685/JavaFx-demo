package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PremierExempleManipulantLesConteneurs extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Création du conteneur principal
        VBox vbox = new VBox();
        //Création de la bar de menu
        Menu menuFile = new Menu("file");
        MenuItem subMenuFileNew= new MenuItem("New");
        MenuItem subMenuFileOpen= new MenuItem("Open");
        MenuItem subMenuFileSave= new MenuItem("Save");
        MenuItem subMenuFileClose= new MenuItem("Close");
        menuFile.getItems().addAll(subMenuFileNew, subMenuFileOpen,subMenuFileSave,subMenuFileClose);

        Menu menuEdit = new Menu("edit");
        MenuItem subMenuEditCut= new MenuItem("Cut");
        MenuItem subMenuEditCopy= new MenuItem("Copy");
        MenuItem subMenuEditPaste= new MenuItem("Paste");
        menuEdit.getItems().addAll(subMenuEditCut, subMenuEditCopy,subMenuEditPaste);

        Menu menuHelp = new Menu("help");

        MenuBar menuBar = new MenuBar(menuFile, menuEdit, menuHelp);

        //Création de la milieu de page

        VBox MidControl = new VBox();
        VBox.setVgrow(MidControl, Priority.ALWAYS );


        VBox MidLeftControl = new VBox();
        MidLeftControl.setAlignment( Pos.BOTTOM_LEFT );

        Label ButtonLabel = new Label("Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");
        MidLeftControl.getChildren().addAll(ButtonLabel,btn1,btn2,btn3);

        GridPane FormulaireMid = new GridPane();
        FormulaireMid.setAlignment( Pos.BOTTOM_CENTER );
        //Création des label
        Label nameLabel = new Label("Name :");
        FormulaireMid.add (nameLabel,0,0);
        Label mailLabel = new Label("Email :");
        FormulaireMid.add (mailLabel,0,1);
        Label mdpLabel = new Label("Password :");
        FormulaireMid.add (mdpLabel,0,2);
        //création des textefield
        TextField namefield = new TextField();
        FormulaireMid.add (namefield,1,0);
        TextField mailfield = new TextField();
        FormulaireMid.add (mailfield,1,1);
        TextField mdpfield = new TextField();
        FormulaireMid.add (mdpfield,1,2);

        MidControl.getChildren().addAll(
                MidLeftControl,
                FormulaireMid
        );




        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_CENTER );
        Label basdepage = new Label("Ceci est un label de bas de page");
        bottomControls.getChildren().add( basdepage);


        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                menuBar,
                MidControl,
                bottomControls
        );

        Scene scene = new Scene(vbox );

        VBox.setMargin( MidControl, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier Exemple Manipulant Les Conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }
}
