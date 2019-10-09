import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Booking> bookings;
    private ArrayList<Guest> guests;

    public Hotel() {
        bedrooms = new ArrayList<Bedroom>();
        bookings = new ArrayList<Booking>();
        guests = new ArrayList<Guest>();
    }

    public int countRooms() {
        return bedrooms.size();
    }

    public void addRoom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public int countBookings() {
        return bookings.size();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public int countGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void createNewBooking(ArrayList<Guest> guests, Bedroom bedroom, String status) {
        addBooking(new Booking(guests, bedroom, status));
    }

    public Bedroom getRoom(int roomNumber) {
        Bedroom result = null;
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber) {
                result = bedroom;
                break;
            }
        }
        return result;
    }



}
