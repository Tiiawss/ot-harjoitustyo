
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nytiia
 * 
 */

//package calendarview;


public class CalendarView extends Application{

    
     
  @Override
  public void start(Stage s) {
  
      
    
        // set title for the stage 
        s.setTitle("creating date picker"); 
  
        // create a tile pane 
        TilePane r = new TilePane(); 
  
        // create a date picker 
        DatePicker d = new DatePicker(); 
  
        // add button and label 
        r.getChildren().add(d); 
  
        // create a scene 
        Scene sc = new Scene(r, 200, 200); 
  
        // set the scene 
        s.setScene(sc); 
  
        s.show(); 
    } 
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
  
         launch(args); 
    }
    
}
