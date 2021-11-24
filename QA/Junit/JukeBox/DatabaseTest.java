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


public class DatabaseTest {
   private java.util.List songList;
   private Song testSong1,testSong2;
   private Database testDB;
   
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        songList =  new java.util.ArrayList();
        
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        
        songList.add(testSong1);
        songList.add(testSong2);
        
        testDB = new Database(songList);
    }
    
    @After
    public void tearDown() {
        songList = null;
        testDB = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSongList() {
       assertEquals("SongList if empty should have 0 elements",false,songList.isEmpty());
     }
     
     @Test
     public void testGetSongList() {
         assertEquals("Test getSongList",songList,testDB.getSongList());
     }
    
     @Test
     public void testAddSong() {
         testDB.addSong(testSong1);
         assertEquals("Test addSong",songList,testDB.getSongList());
     }
     @Test
     public void testRemoveSong() {
         testDB.removeSong(testSong1);
         assertEquals("Test removeSong",songList,testDB.getSongList());
     }
     @Test
     public void testRemoveSongByIndex() {
         testDB.removeSong(1);
         assertEquals("Test removeSongByIndex method",songList,testDB.getSongList());
     }
  
}