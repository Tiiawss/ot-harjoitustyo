package ristinollaApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author nytiia
 */
public class RistinollaUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
        
        btn1.setText(" -");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                btn1.setText("X");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        
        Scene scene = new Scene(root, 600, 600);
        
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
