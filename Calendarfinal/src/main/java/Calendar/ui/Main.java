/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar.ui;

import static javafx.application.Application.launch;

/**
 *
 * @author nytiia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                javafx.application.Application.launch(TodoUi.class);
            }
        }.start();
        //StartUpTest startUpTest = StartUpTest.waitForStartUpTest();
     //   startUpTest.printSomething();
    }
    }
    

