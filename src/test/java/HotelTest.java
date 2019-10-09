import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private ArrayList<Guest> guests;
    private Booking booking1;
    private Booking booking2;
    private Booking booking3;

    @Before
    public void setUp(){
        hotel = new Hotel();

        bedroom1 = new Bedroom(101, 1, "Single", 8000);
        bedroom2 = new Bedroom(102, 2, "Double", 10000);
        bedroom3 = new Bedroom(103, 3, "Family", 50000);

        guest1 = new Guest("Katie");
        guest2 = new Guest("Alex");
        guest3 = new Guest("Sky");

        guests = new ArrayList<Guest>();

        booking1 = new Booking(guests, bedroom1, 3);
        booking2 = new Booking(guests, bedroom2, 2);
        booking3 = new Booking(guests, bedroom3, 1);

        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        guests.add(guest1);
    }

    @Test
    public void canCountRooms() {
        assertEquals(2, hotel.countRooms());
    }

    @Test
    public void canAddRoom() {
        hotel.addRoom(bedroom3);
        assertEquals(3, hotel.countRooms());
    };

    @Test
    public void canCountBookings() {
        assertEquals(0, hotel.countBookings());
    }

    @Test
    public void canAddBooking() {
        hotel.addBooking(booking1);
        assertEquals(1, hotel.countBookings());
    }

    @Test
    public void countGuests() {
        hotel.addGuest(guest1);
        assertEquals(1, hotel.countGuests());
    }

    @Test
    public void canCreateNewBooking() {
        hotel.createNewBooking(guests, bedroom1, 2);
        assertEquals(1, hotel.countBookings());
    }

    @Test
    public void canGetRoom() {
        assertEquals(bedroom1, hotel.getRoom(101));
    }

    @Test
    public void cantCreateNewBookingRoomFull() {
        guests.add(guest2);
        hotel.createNewBooking(guests, bedroom1, 2);
        assertEquals(0, hotel.countBookings());
    }

    @Test
    public void canGetVacantBedrooms() {

    }
}

