import java.util.ArrayList;

public class Booking {
    private ArrayList<Guest> guests;
    private Bedroom bedroom;
    private String status;

    public Booking (ArrayList<Guest> guests, Bedroom bedroom, String status) {
        this.guests = guests;
        this.bedroom = bedroom;
        this.status = status;
    }
}
