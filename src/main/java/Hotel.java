import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> hotelBedroomCollection;
    private ArrayList<ConferenceRoom> hotelConferenceRoomCollection;

    public Hotel(String name){
        this.name = name;
        this.hotelBedroomCollection = new ArrayList<Bedroom>();
        this.hotelConferenceRoomCollection = new ArrayList<ConferenceRoom>();
    }

    public String getName() {
        return this.name;
    }


    public int getHotelBedroomCount() {
        return this.hotelBedroomCollection.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.hotelBedroomCollection.add(bedroom);
    }

    public void checkIntoBedroom(Hotel hotel) {
        Guest guest = hotel.addGuest(guest);
        this.hotelBedroomCollection.add(guest);
    }
}
