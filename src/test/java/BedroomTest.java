import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void setUp() {
        bedroom = new Bedroom(101, 2, "Double");
        guest = new Guest("Bob");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals("Double", bedroom.getRoomType());
    }
}
