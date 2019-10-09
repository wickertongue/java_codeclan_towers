import java.util.ArrayList;

public class Booking {
    private ArrayList<Guest> guests;
    private Bedroom bedroom;
    private boolean checkedIn;
    private boolean checkedOut;
    private int nights;

    public Booking (ArrayList<Guest> guests, Bedroom bedroom, int nights) {
        this.guests = guests;
        this.bedroom = bedroom;
        checkedIn = false;
        checkedOut = false;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public boolean getCheckedInStatus() {
        return checkedIn;
    }

    public void checkIn() {
        checkedIn = true;
    }

    public boolean getCheckedOutStatus() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public int getNights() {
        return nights;
    }

    public int getBookingChargeCostValueAmountInPence() {
        return nights * bedroom.getRoomRate();
    }

}
