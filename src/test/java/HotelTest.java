import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    public Hotel hotel;
    public Guest guest;
    public Bedroom bedroom;
    public ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel("Camerian Towers");
        guest = new Guest("Paris");
        bedroom =  new Bedroom(7, 2, "double");
        conferenceRoom = new ConferenceRoom(10, "The Yeltzin");
        hotel.addBedroom(bedroom);
//        hotel.checkIntoBedroom(guest);
    }

    @Test
    public void canGetHotelName(){
        assertEquals("Camerian Towers", hotel.getName());
    }

    @Test
    public void canGetHotelBedroomCollectionCount(){
        assertEquals(1, hotel.getHotelBedroomCount());
    }

    @Test
    public void canCheckIntoBedroom(){
        hotel.checkIntoBedroom(bedroom, guest);
        assertEquals(1, bedroom.getCount());
    }

}
