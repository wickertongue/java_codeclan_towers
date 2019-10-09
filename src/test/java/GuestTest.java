import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class GuestTest {

    private Guest guest;

    @Before
    public void setUp() {
        guest = new Guest("Bob");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", guest.getName());
    }

}
