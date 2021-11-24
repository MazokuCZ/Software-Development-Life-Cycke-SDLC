package Jukebox;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class JukeBoxTest {
    private Jukebox testJB;
    private Database db;
    private java.util.List songListJB;
    private Song song1,song2;
    private int ccn=123;
    
    public JukeBoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      song1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214); 
      song2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
      
      songListJB = new java.util.ArrayList();
      
      songListJB.add(song1);
      songListJB.add(song2);
      
      db = new Database(songListJB);
        
      testJB = new Jukebox(db,ccn);
    }
    
    @After
    public void tearDown() {
        testJB = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testIsValidCreditCard() {
    	 assertEquals("Credit card is valid if value is greater than 0",true,testJB.isValidCreditCard());
     }
     
     @Test
     public void testGetCreditCard() {
         assertEquals("Test getCreditCard method",123,testJB.getCreditCard());
     }

     @Test
     public void testSetCreditCard() {
         testJB.setCreditCard(0000);
         assertEquals("Test setCreditCard method",0000,testJB.getCreditCard());
     }

     @Test
     public void testGetDb() {
         assertTrue("Test Database exist",testJB.getDb() instanceof Database);
         assertNotNull("Test Database not null",testJB.getDb());
     }

     @Test
     public void testSetDb() {
         Song song3 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
                 "Thani Oruvan", "Cricket.mp3", "Mp3", 214);      
         songListJB = new java.util.ArrayList();         
         songListJB.add(song3);    
         Database db1 = new Database(songListJB);
         testJB.setDb(db1);
         assertNotNull("Test Database not null",testJB.getDb());
         assertTrue("Test Database exist",testJB.getDb() instanceof Database);
     }
}
