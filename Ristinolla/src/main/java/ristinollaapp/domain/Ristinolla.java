package ristinollaapp.domain;

import ristinollaapp.domain.Game;
import java.util.ArrayList;
import java.util.Scanner;
import ristinollaapp.ui.RistinollaUI;
import static javafx.application.Application.launch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nytiia
 */
/**
 * Luokka käynnistää pelin
 */

public class Ristinolla {
//todo arkkitehtuuri kuvaus, testiluokka
    // paranna ui ta, kertoo kuka voittaa, nappi uuden pelin aloitamiseksi kun edellinen päättyy
    /**
     * @param args the command line arguments
     */
    //laitetaan myöhemmin olioksi ristikonluonti
    public static void main(String[] args) {
       

        RistinollaUI.main(args);

    }

}