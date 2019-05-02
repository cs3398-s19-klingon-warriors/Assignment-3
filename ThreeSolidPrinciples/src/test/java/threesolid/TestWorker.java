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
    private Robot r;

    @Test
    @DisplayName("Success!")

    public void newtest_A_S_WorkerPass(){
        assertNull(r, "This thing is NULL, bro.");
    }
    
    @Test
    @DisplayName("I'm a failure.")
    
     public void newtest_A_S_WorkerFail(){
        assertNotSame(r, r);
    }
    
}
