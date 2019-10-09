public class Booking {

    private int nightsBooked;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    public Booking(int nightsBooked, Bedroom bedroom){
        this.nightsBooked = nightsBooked;
        this.bedroom = bedroom;
        this.conferenceRoom = conferenceRoom;
    }


    public int getNumberOfNightsBooked() {
        return this.nightsBooked;
    }

    public Bedroom getBedroomBooked() {
        return this.bedroom;
    }

    public ConferenceRoom getConferenceRoomBooked() {
        return this.conferenceRoom;
    }
}