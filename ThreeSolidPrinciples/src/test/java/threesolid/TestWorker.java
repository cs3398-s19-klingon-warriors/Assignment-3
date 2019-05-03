// copy from A17

package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.Test;

import org.junit.jupiter.api.*;

public class TestWorker{
    private Worker w = new Worker();
    private Robot r = new Robot();
    
   
    @Test
    @DisplayName("Testing New BaseWorker Function.")

    public void testWorkMethod(){
        assertEquals(w.new_work(), "I'm working already!");
    }


	@Test
   @DisplayName("My Passing Test")
   
   public void newTest_ts_WorkerPass(){
       assertNotSame(r, w);
   } 

   
   @Test
   @DisplayName("My Failing Test")
   
   public void newTest_ts_WorkerFail(){
       assertNull(r.getRebootSeconds());
   }  


/*
   @Test
   @DisplayName("My Failing Test")
   
   public void newTest_sg_WorkerFail(){
       assertNotEquals(w.working(), "I am working");
   }
*/
  
}