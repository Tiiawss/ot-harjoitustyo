package ristinollaapp.domain;

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
/**
 * Luokka tekee pelilaudan ja pelin toteutuksen..
 */
public class Game {

    Scanner scan;
    ArrayList<Integer> rivi1 = new ArrayList<Integer>();
    ArrayList<Integer> rivi2 = new ArrayList<Integer>();
    ArrayList<Integer> rivi3 = new ArrayList<Integer>();

    //tähän myös linkki uiseen 
    /**
     * Metodi on konstruktori luokalle Game Se ottaa syötteenä scanner olion.
     *
     * @param syote Scanner scan
     *
     * @return
     */
    public Game(Scanner scan) {
        this.scan = scan;
        this.rivi1 = rivi1;
        this.rivi2 = rivi2;
        this.rivi3 = rivi3;

    }

    /**
     * Metodi aloittaa pelin kutsumalla ensin setGame metodia Se toimii while
     * loopilla joka saa arvon ture ja pysähtyy kun peli päättyy
     *
     *
     *
     * @return true kun peli on ohi
     */
    public boolean start() {

        setGame();
        while (true) {

            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            placeX(x1, x2);
            if (isDone()) {
                return true;
            }

            int o1 = scan.nextInt();
            int o2 = scan.nextInt();
            placeO(o1, o2);
            if (isDone()) {
                return true;
            }
        }
    }

    /**
     * Metodi luo pelin pelilaudan
     *
     *
     *
     *
     * @return void
     */
    public void setGame() {

        rivi1.add(0, 2);
        rivi1.add(1, 2);
        rivi1.add(2, 2);
        rivi2.add(0, 2);
        rivi2.add(1, 2);
        rivi2.add(2, 2);
        rivi3.add(0, 2);
        rivi3.add(1, 2);
        rivi3.add(2, 2);
    }

    /**
     * Metodi sijoittaa pelaajan 1 pelimerkin X Se ottaa syötteenä X:sän
     * sijainnin pelilaudalla
     *
     * @param x1,syöte kertoo mille kolmesta rivistä X sijoitetaan
     * @param x2,syöte kertoo mille valitun rivin kolmesta kohdasta X sijoitetaan
     *
     * @return void
     */
    public void placeX(int x1, int x2) {
        if (x1 == 1) {
            if (x2 == 1) {
                rivi1.add(0, 1);
            }
            if (x2 == 2) {
                rivi1.add(1, 1);
            }
            if (x2 == 3) {
                rivi1.add(2, 1);
            }
        }
        if (x1 == 2) {
            if (x2 == 1) {
                rivi2.add(0, 1);
            }
            if (x2 == 2) {
                rivi2.add(1, 1);
            }
            if (x2 == 3) {
                rivi2.add(2, 1);
            }
        }
        if (x1 == 3) {
            if (x2 == 1) {
                rivi3.add(0, 1);
            }
            if (x2 == 2) {
                rivi3.add(1, 1);
            }
            if (x2 == 3) {
                rivi3.add(2, 1);
            }
        }
    }

    /**
     * Metodi sijoittaa pelaajan 2 pelimerkin O Se ottaa syötteenä O:n sijainnin
     * pelilaudalla
     *
     * @param x1,syöte kertoo mille kolmesta rivistä O sijoitetaan
     * @param x2,syöte kertoo mille valitun rivin kolmesta kohdasta O sijoitetaan
     *
     * @return void
     */
    public void placeO(int x1, int x2) {
        if (x1 == 1) {
            if (x2 == 1) {
                rivi1.add(0, 0);
            }
            if (x2 == 2) {
                rivi1.add(1, 0);
            }
            if (x2 == 3) {
                rivi1.add(2, 0);
            }
        }
        if (x1 == 2) {
            if (x2 == 1) {
                rivi2.add(0, 0);
            }
            if (x2 == 2) {
                rivi2.add(1, 0);
            }
            if (x2 == 3) {
                rivi2.add(2, 0);
            }
        }
        if (x1 == 3) {
            if (x2 == 1) {
                rivi3.add(0, 0);
            }
            if (x2 == 2) {
                rivi3.add(1, 0);
            }
            if (x2 == 3) {
                rivi3.add(2, 0);
            }
        }
    }

    /**
     * Metodi kertoo onko peli pättynyt Se tarkistaa rivi kerrallaan onko
     * missään 3 samanlaista pelimerkkiä rivissä
     *
     * @param
     *
     * @return true jos peli päättynyt
     */
    public boolean isDone() {
        int i = 0;
        while (i <= 1) {
            if (rivi1.get(0) == i && rivi1.get(1) == i && rivi1.get(2) == i) {
                return true;
            }
            if (rivi2.get(0) == i && rivi2.get(1) == i && rivi2.get(2) == i) {
                return true;
            }
            if (rivi3.get(0) == i && rivi3.get(1) == i && rivi3.get(2) == i) {
                return true;
            }
            if (rivi1.get(0) == i && rivi2.get(0) == i && rivi3.get(0) == i) {
                return true;
            }
            if (rivi1.get(1) == i && rivi2.get(1) == i && rivi3.get(1) == i) {
                return true;
            }
            if (rivi1.get(2) == i && rivi2.get(2) == i && rivi3.get(2) == i) {
                return true;
            }
            if (rivi1.get(0) == i && rivi2.get(1) == i && rivi3.get(2) == i) {
                return true;
            }
            if (rivi3.get(0) == i && rivi2.get(1) == i && rivi1.get(2) == i) {
                return true;
            }
            i++;
        }
        return false;
    }

}
