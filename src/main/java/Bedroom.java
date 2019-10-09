import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String roomType;
    private int roomRate;

    public Bedroom(int roomNumber, int capacity, String roomType, int roomRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.roomRate = roomRate;
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

    public int getRoomRate() {
        return roomRate;
    }
}
