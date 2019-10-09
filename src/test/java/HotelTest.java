import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    public Hotel hotel;
    public Guest guest1;
    public Guest guest2;
    public Bedroom bedroom;
    public ConferenceRoom conferenceRoom;
    public Booking booking;

    @Before
    public void before(){
        hotel = new Hotel("Shepherd Towers");
        guest1 = new Guest("Ian");
        guest2 = new Guest("Vic");
        bedroom =  new Bedroom("7", 2, "double");
        conferenceRoom = new ConferenceRoom(10, "The Yeltzin");
        booking = new Booking(2, bedroom);
        hotel.addBedroom(bedroom);
        hotel.checkIntoBedroom(bedroom, guest1);


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
        hotel.checkIntoBedroom(bedroom, guest1);
        hotel.checkIntoBedroom(bedroom, guest2);
        hotel.checkOutFromBedroom(bedroom, guest1);
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
