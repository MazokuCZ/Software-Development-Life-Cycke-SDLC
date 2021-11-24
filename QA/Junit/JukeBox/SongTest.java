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

public class SongTest {
    private Song testSong1, testSong2;
    public SongTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        testSong2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
    }
    
    @After
    public void tearDown() {
        testSong1 = null;
        testSong2 = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testIsLong1() {
       assertEquals("Song is long if length is more than 50",true,testSong1.isLong());
     }
     @Test
     public void testIsLong2() {
       assertEquals("Song is long if length is more than 50",true,testSong2.isLong());
     }
     
     @Test
     public void testGetName() {
       assertEquals("Test getName method","Kadhal Cricket",testSong2.getName());
     }
     
     @Test
     public void testSetName() {
    	 testSong1.setName("Kannala Kannala");
       assertEquals("Test setName method","Kannala Kannala",testSong1.getName());
     }
     
     @Test
     public void testGetArtist() {
       assertEquals("Test getArtist method","Kharesma Ravichandran",testSong2.getArtist());
     }
     
     @Test
     public void testSetArtist() {
       testSong2.setArtist("Kaushik Krish");
       assertEquals("Test setArtist method","Kaushik Krish",testSong2.getArtist());
     }
     
     @Test
     public void testGetAlbum() {
       assertEquals("Test getAlbum method","Thani Oruvan",testSong2.getAlbum());
     }
     
     @Test
     public void testSetAlbum() {
    	 testSong2.setAlbum("Lovely");
       assertEquals("Test setAlbum method","Lovely",testSong2.getAlbum());
     }
     
     @Test
     public void testGetUrl() {
       assertEquals("Test getUrl method","Cricket.mp3",testSong2.getUrl());
     }
     
     @Test
     public void testSetUrl() {
       testSong2.setUrl("Kannala.mp3");
       assertEquals("Test setUrl method","Kannala.mp3",testSong2.getUrl());
     }
     
     @Test
     public void testGetFormat() {
       assertEquals("Test getFormat method","Mp3",testSong2.getFormat());
     }
     @Test
     public void testSetFormat() {
       testSong2.setFormat("Mp4");
       assertEquals("Test setFormat method","Mp4",testSong2.getFormat());
     }
     
     @Test
     public void testGetDuration() {
       assertEquals("Song is long if length is more than 50",true,testSong2.isLong());
     }
     
     @Test
     public void testSetDuration() {
       assertEquals("Song is long if length is more than 50",true,testSong2.isLong());
     }
}
