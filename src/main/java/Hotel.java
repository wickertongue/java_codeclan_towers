import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;

    public Hotel() {
        bedrooms = new ArrayList<Bedroom>();
    }

    public int countRooms() {
        return bedrooms.size();
    }

    public void addRoom(Bedroom bedroom) {
        bedrooms.add(bedroom);
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
