package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exo1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane borderPane = new BorderPane();


        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        ToolBar topControls = new ToolBar();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");
        MenuItem menu1new = new MenuItem("New");
        MenuItem menu1open = new MenuItem("Open");
        MenuItem menu1save = new MenuItem("Save");
        MenuItem menu1close = new MenuItem("Close");

        MenuItem menu2cut = new MenuItem("Cut");
        MenuItem menu2copy = new MenuItem("Copy");
        MenuItem menu2paste = new MenuItem("Paste");

        menu1.getItems().add(menu1new);
        menu1.getItems().add(menu1open);
        menu1.getItems().add(menu1save);
        menu1.getItems().add(menu1close);

        menu2.getItems().add(menu2cut);
        menu2.getItems().add(menu2copy);
        menu2.getItems().add(menu2paste);

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        borderPane.setTop(menuBar);
        BorderPane.setMargin(menuBar, new Insets(10, 10, 10, 10));


        // bouton gauche
        Label label1 = new Label("Boutons : ");
        Button btnLeft1 = new Button("Bouton1");
        Button btnLeft2 = new Button("Bouton2");
        Button btnLeft3 = new Button("Bouton3");

        VBox vb = new VBox(label1, btnLeft1, btnLeft2, btnLeft3);
        vb.setAlignment(Pos.CENTER_LEFT);
        BorderPane.setMargin(vb, new Insets(10, 10, 10, 10));
        borderPane.setLeft(vb);
        // Set margin for left area.
        BorderPane.setMargin(btnLeft1, new Insets(10, 10, 10, 10));

        // Ajout des contrôleurs au conteneur principal
        borderPane.getChildren().addAll(
                topControls
        );


        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderPane);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}