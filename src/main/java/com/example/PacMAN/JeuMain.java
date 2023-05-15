package com.example.PacMAN;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class JeuMain extends Application {

    private Scene scene;
    private BorderPane root;

    @Override
    public void start(Stage primaryStage) {

        root = new BorderPane();

        //Acteurs du jeu
        Personnage pacman = new Pacman();
        Personnage fantome = new Fantome();
        // on positionne le fantôme 20 positions vers la droite
        fantome.setLayoutX(60 * 10);
        // let's build a wall
        Obstacle wall = new Obstacle(20*10,8*10,14*10,35*10);
        //panneau du jeu
        Pane jeu = new Pane();
        jeu.setPrefSize(640, 480);
        jeu.getChildren().add(pacman);
        jeu.getChildren().add(fantome);
        jeu.getChildren().add(wall);
        root.setCenter(jeu);


        //panneau de défaite
        Pane ecran2 = new Pane();
        BorderPane GameOver = new BorderPane();
        Label labelLoose = new Label("GAME OVER");
        labelLoose.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        labelLoose.setAlignment( Pos.CENTER);
        Button btnExit = new Button("exit");
        btnExit.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            javafx.application.Platform.exit();
        });
        GameOver.setTop(labelLoose);
        GameOver.setCenter(btnExit);
        ecran2.getChildren().add(GameOver);


        //on construit une scene 640 * 480 pixels
        scene = new Scene(root);

        //Gestion du déplacement du personnage
        deplacer(pacman, fantome,ecran2,wall);

        primaryStage.setTitle("... Pac Man ...");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Permet de gérer les événements de type clavier, pression des touches
     * pour le j1(up,down, right, left), pour le j2( z,q,s,d)
     *
     * @param j1
     * @param j2
     */
    private void deplacer(Personnage j1, Personnage j2,Pane ecran2, Obstacle wall) {


        scene.setOnKeyPressed((KeyEvent event) -> {
            double j1x = j1.getLayoutX();
            double j1y = j1.getLayoutY();
            double j2x = j2.getLayoutX();
            double j2y = j2.getLayoutY();
            switch (event.getCode()) {
                case LEFT:
                    j1.deplacerAGauche();
                    break;
                case RIGHT:
                    j1.deplacerADroite(scene.getWidth());
                    break;
                case DOWN:
                    j1.deplacerEnBas(scene.getHeight());
                    break;
                case UP:
                    j1.deplacerEnHaut();
                    break;
                case Q:
                    j2.deplacerAGauche();
                    break;
                case D:
                    j2.deplacerADroite(scene.getWidth());
                    break;
                case S:
                    j2.deplacerEnBas(scene.getHeight());
                    break;
                case Z:
                    j2.deplacerEnHaut();
                    break;


            }

            if (j1.estEnCollision(j2)) {
                root.setCenter(ecran2);

            }
            if (wall.estEnCollision2(j1)){
                j1.setLayoutX(j1x);
                j1.setLayoutY(j1y);
            }
            if (wall.estEnCollision2(j2)){
                j2.setLayoutX(j2x);
                j2.setLayoutY(j2y);
            }
        });
    }
}