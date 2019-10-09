import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> bedroomCollection;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.bedroomCollection = new ArrayList<Guest>();
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }


    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public int getCount(){
        return this.bedroomCollection.size();
    }


    public void addGuest(Guest guest) {
        if(this.bedroomCollection.size() < this.capacity){
            this.bedroomCollection.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.bedroomCollection.remove(guest);
    }
}


