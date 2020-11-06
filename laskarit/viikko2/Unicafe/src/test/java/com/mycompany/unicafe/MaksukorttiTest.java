package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }
    
    @Test
    public void konstruktoriAsettaaSaldonOikein() {
        assertEquals("saldo: 0.10", kortti.toString());
    }
    
    @Test
    public void kortilleVoiLadataRahaa() {
        kortti.lataaRahaa(25);
        assertEquals("saldo: 0.35", kortti.toString());
    }
     
    @Test
    public void kortiltaVoiOttaaRahaa() {
        kortti.otaRahaa(25);
        assertEquals("saldo: 0.10", kortti.toString());
    }
    @Test
    public void korttiEiMeneMiinukselle() {
        kortti.otaRahaa(45);
        assertEquals("saldo: 0.10", kortti.toString());
    }
    @Test
    public void rahatRiittavatOnTrue() {
        assertTrue(kortti.otaRahaa(5)==true);      
    }
    public void falseJosRahatEiRiita() {
        assertTrue(kortti.otaRahaa(40)==false);      
    }
    
    

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
}
