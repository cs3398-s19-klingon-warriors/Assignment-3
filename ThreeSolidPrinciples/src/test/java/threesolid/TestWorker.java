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
}
