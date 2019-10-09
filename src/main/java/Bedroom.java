import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType;
    }
}
