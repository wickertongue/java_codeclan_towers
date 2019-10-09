import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookingTest {
    private Booking booking;
    private ArrayList<Guest> guests;
    private Bedroom bedroom;

    @Before
    public void setUp() {
        booking = new Booking(guests, bedroom, "Booked");
    }
}