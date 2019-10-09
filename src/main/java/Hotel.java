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

    public void createNewBooking(ArrayList<Guest> guests, Bedroom bedroom, int nights) {
        if (guests.size() <= bedroom.getCapacity()) {
            addBooking(new Booking(guests, bedroom, nights));
        } // throw an error?
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

    public void updateBookingCheckedIn(Booking booking) {
        booking.checkIn();
    }

    public void updateBookingCheckedOut(Booking booking) {
        booking.checkOut();
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<Bedroom>(bedrooms);
        for (Booking booking : bookings) {
            if (booking.getCheckedInStatus() && !booking.getCheckedOutStatus()) {
                vacantBedrooms.remove(booking.getBedroom());
            }
        }
        return vacantBedrooms;
    }
}
