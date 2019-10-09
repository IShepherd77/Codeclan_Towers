import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> conferenceRoomCollection;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this. name = name;
        this.conferenceRoomCollection = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.conferenceRoomCollection.size();
    }

    public void addGuest(Guest guest) {
        if(this.conferenceRoomCollection.size() < this.capacity){
            this.conferenceRoomCollection.add(guest);
        }
    }


    public void removeGuest(Guest guest) {
        this.conferenceRoomCollection.remove(guest);
    }
}
