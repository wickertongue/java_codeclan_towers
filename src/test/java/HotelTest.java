import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(101, 1, "Single");
        bedroom2 = new Bedroom(102, 2, "Double");
        bedroom3 = new Bedroom(103, 3, "Family");
        guest1 = new Guest("Katie");
        guest2 = new Guest("Alex");
        guest3 = new Guest("Sky");
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
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
}

