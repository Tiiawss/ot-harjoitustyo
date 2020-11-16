
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


public class Calendar extends Application{

    
     
  @Override
  public void start(Stage s) {
  
      
    
      
        s.setTitle("creating date picker"); 
  
  
        TilePane r = new TilePane(); 
  
   
        DatePicker d = new DatePicker(); 
  
       
        r.getChildren().add(d); 
  
      
        Scene sc = new Scene(r, 300, 300); 
  
        
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
