package ristinollaapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author nytiia
 */
public class RistinollaUI extends Application {

    private Scanner reader = new Scanner(System.in);
    private Game game = new Game(reader);
    private int turn = 1;

    @Override
    public void start(Stage primaryStage) {
        
        game.setGame();
        Label turnLbl = new Label("");
        Label winner = new Label(" ");

        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
         turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
        winner.setText("");

        btn1.setText("    ");
        btn1.setStyle("-fx-background-color: #fff;");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(1, 1);

                    btn1.setText("O");
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(1, 1);

                    btn1.setText("X");
                     turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }

                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });
        btn3.setText("    ");
        btn3.setStyle("-fx-background-color: #fff;");
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(1, 3);

                    btn3.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(1, 3);

                    btn3.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;

            }
        });
        btn2.setText("    ");
        btn2.setStyle("-fx-background-color: #fff;");
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(1, 2);

                    btn2.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(1, 2);

                    btn2.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });
        btn4.setText("    ");
        btn4.setStyle("-fx-background-color: #fff;");
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(2, 1);

                    btn4.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(2, 1);

                    btn4.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });
        btn5.setText("    ");
        btn5.setStyle("-fx-background-color: #fff;");
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(2, 2);

                    btn5.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(2, 2);

                    btn5.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });
        btn6.setText("    ");
        btn6.setStyle("-fx-background-color: #fff;");
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(2, 3);

                    btn6.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(2, 3);

                    btn6.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });
        btn7.setText("    ");
        btn7.setStyle("-fx-background-color: #fff;");
        btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(3, 1);

                    btn7.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(3, 1);

                    btn7.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });
        btn8.setText("    ");
        btn8.setStyle("-fx-background-color: #fff;");
        btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(3, 2);

                    btn8.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(3, 2);

                    btn8.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });
        btn9.setText("    ");
        btn9.setStyle("-fx-background-color: #fff;");
        btn9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (turn % 2 == 0) {
                    game.placeO(3, 3);

                    btn9.setText("O");
                     turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(3, 3);

                    btn9.setText("X");
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    winner.setText("Peli päättyi");
                }
                turn++;
            }
        });

        BorderPane collab = new BorderPane();
        GridPane root = new GridPane();
        root.setHgap(12);
        root.setVgap(12);
        root.setPadding(new Insets(30, 30, 30, 30));
        root.add(btn1, 0, 0);
        root.add(btn2, 0, 1);
        root.add(btn3, 0, 2);
        root.add(btn4, 1, 0);
        root.add(btn5, 1, 1);
        root.add(btn6, 1, 2);
        root.add(btn7, 2, 0);
        root.add(btn8, 2, 1);
        root.add(btn9, 2, 2);
        collab.setTop(turnLbl);
        collab.setBottom(winner);
        collab.setCenter(root);

        Scene scene = new Scene(collab);

        primaryStage.setTitle("Ristinolla");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
