/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import maksukortti.Maksukortti;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaksukorttiTest {

    
   public MaksukorttiTest() {
   }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
   
    
   @Test
public void konstruktoriAsettaaSaldonOikein() {
    Maksukortti kortti = new Maksukortti(10);
    assertEquals("Kortilla on rahaa 9.0 euroa",  kortti.toString());
}
}

 
