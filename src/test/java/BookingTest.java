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
        bedroom = new Bedroom(101, 1, "Single", 4000);
        booking = new Booking(guests, bedroom, 2);
    }

    @Test
    public void canGetCheckedInStatus() {
        assertFalse(booking.getCheckedInStatus());
    }

    @Test
    public void canCheckIn() {
        booking.checkIn();
        assertTrue(booking.getCheckedInStatus());
    }

    @Test
    public void canGetCheckedOutStatus() {
        assertFalse(booking.getCheckedOutStatus());
    }

    @Test
    public void canCheckOut() {
        booking.checkOut();
        assertTrue(booking.getCheckedOutStatus());
    }

    @Test
    public void getNights() {
        assertEquals(2, booking.getNights());
    }

    @Test
    public void canGetBookingChargeCostValueAmountInPence() {
        assertEquals(8000, booking.getBookingChargeCostValueAmountInPence());
    }

    @Test
    public void canGetBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }
}