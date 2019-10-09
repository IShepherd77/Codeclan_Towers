import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    public Hotel hotel;
    public Guest guest;
    public Bedroom bedroom;
    public ConferenceRoom conferenceRoom;
    public Booking booking;

    @Before
    public void before(){
        hotel = new Hotel("Shepherd Towers");
        guest = new Guest("Ian");
        bedroom =  new Bedroom(7, 2, "double");
        conferenceRoom = new ConferenceRoom(10, "The Yeltzin");
        hotel.addBedroom(bedroom);
        hotel.checkIntoBedroom(bedroom, guest);
        booking = new Booking(2, bedroom);

    }

    @Test
    public void canGetHotelName(){
        assertEquals("Shepherd Towers", hotel.getName());
    }

    @Test
    public void canGetHotelBedroomCollectionCount(){
        assertEquals(1, hotel.getHotelBedroomCount());
    }

    @Test
    public void canCheckIntoBedroom(){
        assertEquals(1, bedroom.getCount());
    }

    @Test
    public void canCheckOutFromBedroom(){
        hotel.checkIntoBedroom(bedroom, guest);
        hotel.checkIntoBedroom(bedroom, guest);
        hotel.checkOutFromBedroom(bedroom, guest);
        assertEquals(1, bedroom.getCount());
    }

    @Test
    public void canGetNumberOfNightsFromBooking(){
        hotel.addBooking(booking);
        assertEquals(2, hotel.getNumberOfNights(booking));
    }

    @Test
    public void canAddBooking(){
        hotel.addBooking(booking);
        assertEquals(1, hotel.getHotelBedroomCount());
    }



}
