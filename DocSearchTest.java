import static org.junit.Assert.*;

import java.net.URI;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class DocSearchTest
 {
    @Test
    public void urltest()
    {
        Handler h = new Handler(null);
        String s = "Don't know how to handle that path!";
        assertEquals(s, h.handleRequest("link.com")));
    }
}
