package com.example.partie2;


import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class exo4 extends Application {
    private Label topLabel = new Label("");
    private int compteurVert = 0;
    private int compteurRouge = 0;
    private int compteurBleu = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Creatoin du borderPane
        BorderPane borderPane = new BorderPane();

        //TopLabel
        HBox topHBox = new HBox(topLabel);
        topHBox.setAlignment(Pos.CENTER);
        borderPane.setTop(topHBox);
        Scene scene = new Scene(borderPane);



        //BottomButtons
        Button vert = new Button("Vert");
        vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleButonClickVert(actionEvent) );
        Button rouge = new Button("Rouge");
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleButonClickRouge(actionEvent) );
        Button bleu = new Button("Bleu");
        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleButonClickBleu(actionEvent) );

        HBox bottomHBox = new HBox(vert,rouge,bleu);
        bottomHBox.setAlignment(Pos.CENTER);
        bottomHBox.setSpacing(10);
        bottomHBox.setPadding(new Insets(5));
        borderPane.setBottom(bottomHBox);
        //milieu

        Pane pane = new Pane();


        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 400 );
        primaryStage.setHeight( 200 );
        primaryStage.setTitle("Zig ou Net ?");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    private void handleButonClickVert(MouseEvent actionEvent) {
        compteurVert +=1;
        topLabel.setText("Compteur de Vert : " + compteurVert);

    }
    private void handleButonClickRouge(MouseEvent actionEvent) {
        compteurRouge+=1;
        topLabel.setText("Compteur de Rouge : " + compteurRouge);
    }
    private void handleButonClickBleu(MouseEvent actionEvent) {
        compteurBleu+=1;
        topLabel.setText("Compteur de Bleu : " + compteurBleu);
    }
    public void handle(Event event) {

    }
}