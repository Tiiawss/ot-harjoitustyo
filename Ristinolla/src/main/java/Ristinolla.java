
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nytiia
 */
public class Ristinolla {

    /**
     * @param args the command line arguments
     */
    //laitetaan myöhemmin olioksi ristikonluonti
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        Ristinolla r = new Ristinolla();
        Game game = new Game(reader);
        game.Start();
    }
    
}
