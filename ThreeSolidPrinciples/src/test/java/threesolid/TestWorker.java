// copy from A17

package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
<<<<<<< HEAD
=======

//import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.Test;
>>>>>>> ccd4f70825f5e8909cec42bb5150c5a84dcc3993


<<<<<<< HEAD
public class TestWorker
{
private Worker w = new Worker();
@Test
@DisplayName("Work Method Test")
public void testWorkMethod()
{
assertEquals(w.new_work(),6,"Mismatch between test text and method text");
}
=======
public class TestWorker{
    private Worker w = new Worker();

    @Test
    @DisplayName("Work Method Test")

    public void testWorkMethod(){
        assertEquals(w.new_work(),"I'm working already!","Mismatch between test text and method text");
    }
>>>>>>> ccd4f70825f5e8909cec42bb5150c5a84dcc3993
}
