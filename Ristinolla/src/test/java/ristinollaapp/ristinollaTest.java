/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinollaapp;

import ristinollaapp.Ristinolla;
import ristinollaapp.Game;
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
        game.placeX(1, 1);
        int luku = game.rivi1.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place2() {
        game.placeX(1, 2);
        int luku = game.rivi1.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place3() {
        game.placeX(1, 3);
        int luku = game.rivi1.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place4() {
        game.placeX(2, 1);
        int luku = game.rivi2.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place5() {
        game.placeX(2, 2);
        int luku = game.rivi2.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place6() {
        game.placeX(2, 3);
        int luku = game.rivi2.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place7() {
        game.placeX(3, 1);
        int luku = game.rivi3.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place8() {
        game.placeX(3, 2);
        int luku = game.rivi3.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place9() {
        game.placeX(3, 3);
        int luku = game.rivi3.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place10() {
        game.placeO(1, 1);
        int luku = game.rivi1.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place20() {
        game.placeO(1, 2);
        int luku = game.rivi1.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place30() {
        game.placeO(1, 3);
        int luku = game.rivi1.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place40() {
        game.placeO(2, 1);
        int luku = game.rivi2.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place50() {
        game.placeO(2, 2);
        int luku = game.rivi2.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place60() {
        game.placeO(2, 3);
        int luku = game.rivi2.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void Place70() {
        game.placeO(3, 1);
        int luku = game.rivi3.get(0);
        assertEquals(luku, 1);
    }

    @Test
    public void Place80() {
        game.placeO(3, 2);
        int luku = game.rivi3.get(1);
        assertEquals(luku, 1);
    }

    @Test
    public void Place90() {
        game.placeO(3, 3);
        int luku = game.rivi3.get(2);
        assertEquals(luku, 1);
    }

    @Test
    public void hello() {
    }
}
