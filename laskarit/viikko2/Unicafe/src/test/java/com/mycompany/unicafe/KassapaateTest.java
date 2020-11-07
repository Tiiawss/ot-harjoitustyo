/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

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
public class KassapaateTest {
    Kassapaate kassa;
   Maksukortti kortti;
    
   @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = new Maksukortti(400); 
    }
     @Test
    public void AluksiLounasTilanneOikein() {
        
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }

      @Test
    public void AluksiRahaTilanneOikein() {
        assertEquals(100000, kassa.kassassaRahaa());
    }
   
      @Test
    public void KateisOstoEdullinenRahaLisaantyy() {
        kassa.syoEdullisesti(300);
        assertEquals(100240, kassa.kassassaRahaa());
    }
     @Test
    public void KateisOstoEdullinenEiToimiJosRahaaLiianVahan() {
        kassa.syoEdullisesti(1);
        
        assertEquals(100000, kassa.kassassaRahaa());
    }
     @Test
    public void KateisOstoEdullinenMyytyjenMaaraOikein() {
        kassa.syoEdullisesti(500);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
    
    
 @Test
    public void KateisOstoEdullinenEiLisaannyJosRahaaLiianVahan() {
        kassa.syoEdullisesti(1);
        
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    
     @Test
    public void KateisOstoMaukasRahaLisaantyy() {
        kassa.syoMaukkaasti(400);
        assertEquals(100400, kassa.kassassaRahaa());
    }
     @Test
    public void KateisOstoMaukasEiToimiJosRahaaLiianVahan() {
        kassa.syoMaukkaasti(1);
        
        assertEquals(100000, kassa.kassassaRahaa());
    }
     @Test
    public void KateisOstoMaukasMyytyjenMaaraOikein() {
        kassa.syoMaukkaasti(500);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
    
    
 @Test
    public void KateisOstoMaukasEiLisaannyJosRahaaLiianVahan() {
        kassa.syoMaukkaasti(1);
        
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
      
    
    
    
    
      @Test
    public void KorttiOstoEdullinenRahaEiLisaantyy() {
        kassa.syoEdullisesti(kortti);
        assertEquals(100000, kassa.kassassaRahaa());
    }
     @Test
    public void KorttiOstoEdullinenSaldoMuuttuu() {
        kassa.syoEdullisesti(kortti);
      
        
        assertEquals(160, kortti.saldo());
    }
    
     @Test
    public void KorttiOstoEdullinenEiToimiJosRahaaLiianVahan() {
        kassa.syoEdullisesti(kortti);
        kassa.syoEdullisesti(kortti);
        
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
     @Test
    public void KorttiOstoEdullinenMyytyjenMaaraOikein() {
        kassa.syoEdullisesti(kortti);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
    
    
 @Test
    public void KorttiOstoEdullinenEiMuutaKortinSaldoaJosRahaaLiianVahan() {
        kassa.syoEdullisesti(kortti);
        kassa.syoMaukkaasti(kortti);
        assertEquals(160, kortti.saldo());
    }
    
        @Test
    public void KorttiOstoMaukasRahaEiLisaantyy() {
        kassa.syoMaukkaasti(kortti);
        assertEquals(100000, kassa.kassassaRahaa());
    }
     @Test
    public void KorttiOstoMaukasSaldoMuuttuu() {
        kassa.syoMaukkaasti(kortti);
      
        
        assertEquals(0, kortti.saldo());
    }
    
     @Test
    public void KorttiOstoMaukasEiToimiJosRahaaLiianVahan() {
        kassa.syoMaukkaasti(kortti);
        kassa.syoMaukkaasti(kortti);
      
        
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
     @Test
    public void KorttiOstoMaukasMyytyjenMaaraOikein() {
        kassa.syoMaukkaasti(kortti);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
    
    
 @Test
    public void KorttiOstoMaukasEiMuutaKortinSaldoaJosRahaaLiianVahan() {
        kassa.syoMaukkaasti(kortti);
        kassa.syoMaukkaasti(kortti);
        assertEquals(0, kortti.saldo());
    }
    
    

    @Test
    public void KorttilleRahanLataaminenLisaaKassaanRahaa() {
        kortti.lataaRahaa(400);
        
        assertEquals(100000, kassa.kassassaRahaa());
    }
        @Test
    public void KorttilleRahanLataaminenMuuttaSaldoaOikein() {
        kortti.lataaRahaa(400);
        
        assertEquals(800, kortti.saldo());
    }
}
