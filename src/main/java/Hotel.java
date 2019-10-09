import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> hotelBedroomCollection;
    private ArrayList<ConferenceRoom> hotelConferenceRoomCollection;
    private ArrayList<Booking> hotelBookings;

    public Hotel(String name){
        this.name = name;
        this.hotelBedroomCollection = new ArrayList<Bedroom>();
        this.hotelConferenceRoomCollection = new ArrayList<ConferenceRoom>();
        this.hotelBookings = new ArrayList<Booking>();
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

    public void checkIntoBedroom(Bedroom bedroom, Guest guest) {
      bedroom.addGuest(guest);
    }

    public void checkOutFromBedroom(Bedroom bedroom, Guest guest){
        bedroom.removeGuest(guest);
    }

    public void addBooking(Booking booking){
        this.hotelBookings.add(booking);
    }

    public void getBookingCount(){
        this.hotelBookings.size();
    }

    public Booking getBedroomBooking(Bedroom bedroom, int nightsBooked) {
//        booking.getBedroomBooked(bedroom);
//  return a new Booking for specified number of nights
        return new Booking(nightsBooked, bedroom);

}

    public int getNumberOfNights(Booking booking) {
        return booking.getNumberOfNightsBooked();
    }
}
