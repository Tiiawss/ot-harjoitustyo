/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nytiia
 */
package Calendar.ui;

import java.util.Locale;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calendar  extends Application{
    
     private Stage stage;
    private DatePicker checkInDatePicker;
    
    
    
 
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        stage.setTitle("Kalenterin kuori");
        initUI();
        stage.show();
    }
 
    private void initUI() {
        VBox vbox = new VBox(20);
        vbox.setStyle("-fx-padding: 20;");
        Scene s = new Scene(vbox, 500, 500);
        stage.setScene(s);

        checkInDatePicker = new DatePicker();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label checkInlabel = new Label("Päivämäärä:");
        gridPane.add(checkInlabel, 0, 0);

        GridPane.setHalignment(checkInlabel, HPos.LEFT);
        gridPane.add(checkInDatePicker, 0, 1);
        vbox.getChildren().add(gridPane);
    }
    
    @Override
    public void init() throws Exception {
      // ...
    }

    
   


   public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        launch(args);
    }
    
          
    
    
}
