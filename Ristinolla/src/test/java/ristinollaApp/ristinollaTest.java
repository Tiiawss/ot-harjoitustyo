/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinollaApp;

import ristinollaApp.Ristinolla;
import ristinollaApp.Game;
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
    public void test1() {
        int luku = game.rivi1.get(0);
        assertEquals(luku, 2);
    }

    @Test
    public void test2() {
        int luku = game.rivi1.get(1);
        assertEquals(luku, 2);
    }

    @Test
    public void test3() {
        int luku = game.rivi1.get(2);
        assertEquals(luku, 2);
    }

    @Test
    public void test4() {
        int luku = game.rivi2.get(0);
        assertEquals(luku, 2);
    }

    @Test
    public void test5() {
        int luku = game.rivi2.get(1);
        assertEquals(luku, 2);
    }

    @Test
    public void test6() {
        int luku = game.rivi2.get(2);
        assertEquals(luku, 2);
    }

    @Test
    public void test7() {
        int luku = game.rivi3.get(0);
        assertEquals(luku, 2);
    }

    @Test
    public void test8() {
        int luku = game.rivi3.get(1);
        assertEquals(luku, 2);
    }

    @Test
    public void test9() {
        int luku = game.rivi3.get(2);
        assertEquals(luku, 2);
    }

    @Test
    public void Place1() {
        game.PlaceX(1, 1);
        int luku = game.rivi1.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place2() {
        game.PlaceX(1, 2);
        int luku = game.rivi1.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place3() {
        game.PlaceX(1, 3);
        int luku = game.rivi1.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place4() {
        game.PlaceX(2, 1);
        int luku = game.rivi2.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place5() {
        game.PlaceX(2, 2);
        int luku = game.rivi2.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place6() {
        game.PlaceX(2, 3);
        int luku = game.rivi2.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place7() {
        game.PlaceX(3, 1);
        int luku = game.rivi3.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place8() {
        game.PlaceX(3, 2);
        int luku = game.rivi3.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place9() {
        game.PlaceX(3, 3);
        int luku = game.rivi3.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place10() {
        game.PlaceO(1, 1);
        int luku = game.rivi1.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place20() {
        game.PlaceO(1, 2);
        int luku = game.rivi1.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place30() {
        game.PlaceO(1, 3);
        int luku = game.rivi1.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place40() {
        game.PlaceO(2, 1);
        int luku = game.rivi2.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place50() {
        game.PlaceO(2, 2);
        int luku = game.rivi2.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place60() {
        game.PlaceO(2, 3);
        int luku = game.rivi2.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place70() {
        game.PlaceO(3, 1);
        int luku = game.rivi3.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place80() {
        game.PlaceO(3, 2);
        int luku = game.rivi3.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place90() {
        game.PlaceO(3, 3);
        int luku = game.rivi3.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void hello() {
    }
}
