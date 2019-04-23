// copy from A17

package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker
{
private Worker w = new Worker();
@Test
@DisplayName("Work Method Test")
public void testWorkMethod()
{
assertEquals(w.new_work(),6,"Mismatch between test text and method text");
}
}
