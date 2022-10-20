import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class DocSearchTest
 {
    @Test
    public void urltest()
    {
        String s = "Don't know how to handle that path!";
        assertEquals(s, handleRequest());
    }
}
