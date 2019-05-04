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
    @DisplayName("New Work Method Test")
    public void testWorkMethod(){
        assertEquals(w.new_work(),"Ready for new work","Mismatch between test text and method text");
    }

    @Test
    @DisplayName("Break Time Test")
    public void checkBreakTime()
    {
	int current_time = 6 ;
        assertNotSame(w.break_time(),current_time,"Problem: worker needs to take a break");
    }

      @Test
    @DisplayName("All Good Test")
    public void testAllGood()
    {
        assertTrue(w.all_good(),"Oh no! We are not all good");
    }


}
