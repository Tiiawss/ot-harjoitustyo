/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinollaapp.domain;


import ristinollaapp.domain.Ristinolla;
import ristinollaapp.domain.Game;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nytiia
 */
public class ristinollaTest {

    Ristinolla ristinolla;
    Game game;

    public ristinollaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ristinolla = new Ristinolla();
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> rivi1 = new ArrayList<Integer>();
        ArrayList<Integer> rivi2 = new ArrayList<Integer>();
        ArrayList<Integer> rivi3 = new ArrayList<Integer>();
        game = new Game(reader);
        game.setGame();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void setUpRow1() {
        int luku = 0;
        int i = 0;
        while (i < 3) {
            luku = game.rivi1.get(i);
            assertEquals(luku, 2);
            i++;
        }
    }

    @Test
    public void setUpRow2() {
        int luku = 0;
        int i = 0;
        while (i < 3) {
            luku = game.rivi2.get(i);
            assertEquals(luku, 2);
            i++;
        }
    }

    @Test
    public void setUpRow3() {
        int luku = 0;
        int i = 0;
        while (i < 3) {
            luku = game.rivi3.get(i);
            assertEquals(luku, 2);
            i++;
        }
    }

    @Test
    public void placeXplacesTheRightPlace() {
        int row = 1;
        int place = 1;
        while (row <= 3) {

            while (place <= 3) {
                game.placeX(row, place);
                if (row == 1) {
                    int luku = game.rivi1.get((place - 1));
                    assertEquals(luku, 1);
                }
                if (row == 2) {
                    int luku = game.rivi2.get((place - 1));
                    assertEquals(luku, 1);
                }
                if (row == 3) {
                    int luku = game.rivi3.get((place - 1));
                    assertEquals(luku, 1);
                }
                place++;
            }
            row++;
            place = 1;

        }
    }

    @Test
    public void placeOplacesTheRightPlace() {
        int row = 1;
        int place = 1;
        while (row <= 3) {

            while (place <= 3) {
                game.placeO(row, place);
                if (row == 1) {
                    int luku = game.rivi1.get((place - 1));
                    assertEquals(luku, 0);
                }
                if (row == 2) {
                    int luku = game.rivi2.get((place - 1));
                    assertEquals(luku, 0);
                }
                if (row == 3) {
                    int luku = game.rivi3.get((place - 1));
                    assertEquals(luku, 0);
                }
                place++;
            }
            row++;
            place = 1;

        }
    }

    @Test
    public void doesGameEndWhenThreeInARow() {
        game.placeX(1, 1);
        game.placeX(1, 2);
        game.placeX(1, 3);
        assertEquals(game.isDone(), true);

        int i = 0;
        while (i <= 1) {

            if (game.rivi1.get(0) == i && game.rivi1.get(1) == i && game.rivi1.get(2) == i) {
                assertEquals(game.isDone(), true);
            }
            if (game.rivi2.get(0) == i && game.rivi2.get(1) == i && game.rivi2.get(2) == i) {
                assertEquals(game.isDone(), true);
            }
            if (game.rivi3.get(0) == i && game.rivi3.get(1) == i && game.rivi3.get(2) == i) {
                assertEquals(game.isDone(), true);
            }
            if (game.rivi1.get(0) == i && game.rivi2.get(0) == i && game.rivi3.get(0) == i) {
                assertEquals(game.isDone(), true);
            }
            if (game.rivi1.get(1) == i && game.rivi2.get(1) == i && game.rivi3.get(1) == i) {
                assertEquals(game.isDone(), true);
            }
            if (game.rivi1.get(2) == i && game.rivi2.get(2) == i && game.rivi3.get(2) == i) {
                assertEquals(game.isDone(), true);
            }
            if (game.rivi1.get(0) == i && game.rivi2.get(1) == i && game.rivi3.get(2) == i) {
                assertEquals(game.isDone(), true);
            }
            if (game.rivi3.get(0) == i && game.rivi2.get(1) == i && game.rivi1.get(2) == i) {
                assertEquals(game.isDone(), true);
            }

            i++;
        }
    }

    @Test
    public void hello() {
    }
}
