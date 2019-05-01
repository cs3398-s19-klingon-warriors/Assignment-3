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
    @Test
    @DisplayName("Work Method Test")

    public void testWorkMethod(){
        assertEquals(w.new_work(),"I'm working already!","Mismatch between test text and method text");
    }

   @Test
   @DisplayName("My Passing Test")
   public void newTest_sg_WorkerPass(){
       assertEquals(w.old_work(), "I'm tired of working already!");
   }  
   @Test
   @DisplayName("My Failing Test")
   public void newTest_sg_WorkerFail(){
       assertNotEquals(w.working(), "I am working");
   }
  
}
