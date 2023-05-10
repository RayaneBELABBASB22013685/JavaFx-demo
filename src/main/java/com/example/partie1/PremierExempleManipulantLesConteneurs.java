package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PremierExempleManipulantLesConteneurs extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Création du conteneur principal
        BorderPane root = new BorderPane();
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

        root.setTop(menuBar);

        //Création de la milieu de page
        HBox leftmidbox = new HBox() ;
        Separator sep = new Separator(Orientation.VERTICAL);




        VBox MidLeftControl = new VBox();
        MidLeftControl.setAlignment( Pos.CENTER );
        MidLeftControl.setSpacing(10);

        Label ButtonLabel = new Label("Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");
        MidLeftControl.getChildren().addAll(ButtonLabel,btn1,btn2,btn3);

        leftmidbox.getChildren().addAll(
                MidLeftControl,
                sep
        );

        root.setLeft(leftmidbox);

        GridPane FormulaireMid = new GridPane();
        FormulaireMid.setAlignment( Pos.CENTER );
        FormulaireMid.setHgap(10);
        FormulaireMid.setVgap(10);
        FormulaireMid.setPadding(new Insets(10));
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

        //les boutons sous le formulaire
        //mettre les boutons dans le hbox n'est pas une obligation
        HBox boutonFormulaire = new HBox();
        boutonFormulaire.setAlignment(Pos.CENTER);
        boutonFormulaire.setSpacing(10);

        Button boutonSubmit = new Button("Submit");
        Button boutonCancel = new Button("Cancel");

        boutonFormulaire.getChildren().addAll(boutonSubmit,boutonCancel);

        FormulaireMid.add(boutonFormulaire, 0, 3, 2, 1);


        root.setCenter(FormulaireMid);



        VBox bottomControls = new VBox();
        bottomControls.setAlignment(Pos.CENTER );
        Label basdepage = new Label("Ceci est un label de bas de page");
        Separator sepbot = new Separator(Orientation.HORIZONTAL);
        bottomControls.getChildren().addAll( sepbot, basdepage);

        root.setBottom(bottomControls);





        Scene scene = new Scene(root );


        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier Exemple Manipulant Les Conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }
}
