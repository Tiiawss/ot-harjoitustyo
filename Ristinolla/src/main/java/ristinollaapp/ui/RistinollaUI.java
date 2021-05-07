package ristinollaapp.ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ristinollaapp.domain.Game;
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
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author nytiia
 */
public class RistinollaUI extends Application {

    private Scanner reader = new Scanner(System.in);
    private Game game = new Game(reader);
    private int turn = 1;
    private int loppu =0;

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
        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 20);
        turnLbl.setFont(font);
        winner.setFont(font);
            
        btn1.setText("");
        btn1.setFont(font);
        btn1.setStyle("-fx-background-color: #fff;");
        btn1.setPrefSize(50, 50);
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn1.getText() == "X" || btn1.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(1, 1);

                    btn1.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(1, 1);

                    btn1.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }

                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });
        btn2.setText("");
        btn2.setFont(font);
        btn2.setStyle("-fx-background-color: #fff;");
        btn2.setPrefSize(50, 50);
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn2.getText() == "X" || btn2.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(1, 2);

                    btn2.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(1, 2);

                    btn2.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });

        btn3.setText("");
        btn3.setFont(font);
        btn3.setStyle("-fx-background-color: #fff;");
        btn3.setPrefSize(50, 50);
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn3.getText() == "X" || btn3.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(1, 3);

                    btn3.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(1, 3);

                    btn3.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;

            }
        });

        btn4.setText("");
        btn4.setFont(font);
        btn4.setStyle("-fx-background-color: #fff;");
        btn4.setPrefSize(50, 50);
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn4.getText() == "X" || btn4.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(2, 1);

                    btn4.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(2, 1);

                    btn4.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });
        btn5.setText("");
        btn5.setFont(font);
        btn5.setStyle("-fx-background-color: #fff;");
        btn5.setPrefSize(50, 50);
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn5.getText() == "X" || btn5.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(2, 2);

                    btn5.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(2, 2);

                    btn5.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });
        btn6.setText("");
        btn6.setFont(font);
        btn6.setStyle("-fx-background-color: #fff;");
        btn6.setPrefSize(50, 50);
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn6.getText() == "X" || btn6.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(2, 3);

                    btn6.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(2, 3);

                    btn6.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });
        btn7.setText("");
        btn7.setFont(font);
        btn7.setStyle("-fx-background-color: #fff;");
        btn7.setPrefSize(50, 50);
        btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn7.getText() == "X" || btn7.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(3, 1);

                    btn7.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(3, 1);

                    btn7.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });
        btn8.setText("");
        btn8.setFont(font);
        btn8.setStyle("-fx-background-color: #fff;");
        btn8.setPrefSize(50, 50);
        btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn8.getText() == "X" || btn8.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(3, 2);

                    btn8.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(3, 2);

                    btn8.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });
        btn9.setText("");
        btn9.setFont(font);
        btn9.setStyle("-fx-background-color: #fff;");
        btn9.setPrefSize(50, 50);
        btn9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (btn9.getText() == "X" || btn9.getText() == "O") {
                    return;
                }
                if (turn % 2 == 0) {
                    game.placeO(3, 3);

                    btn9.setText("O");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 1, sijoita X");
                } else {
                    game.placeX(3, 3);

                    btn9.setText("X");
                    loppu++;
                    if (loppu==9){
                        turnLbl.setText("Peli päättyi");
                        return;
                    }
                    turnLbl.setText("Vuoro: Pelaaja 2, sijoita O");
                }
                if (game.isDone()) {
                    turnLbl.setText("Peli päättyi");
                    if (turn % 2 == 0) {
                        winner.setText("Voittaja oli pelaaja 2, O");
                    } else {
                        winner.setText("Voittaja oli pelaaja 1, X");
                    }
                }
                turn++;
            }
        });

        BorderPane collab = new BorderPane();
        collab.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, new CornerRadii(0), Insets.EMPTY)));
        GridPane root = new GridPane();
        root.setHgap(20);
        root.setVgap(20);
        root.setPadding(new Insets(100, 100, 100, 100));
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
