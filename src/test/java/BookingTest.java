import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    public Booking booking;
    public Bedroom bedroom;
    public ConferenceRoom conferenceRoom;
    public Guest guest;

    @Before
    public void before(){
        booking = new Booking(2, bedroom);

    }

    @Test
    public void canGetNumberOfNights(){
        assertEquals(2, booking.getNumberOfNightsBooked());
    }

    @Test
    public  void canGetBedroomBooked(){
        assertEquals(bedroom, booking.getBedroomBooked());
    }

    @Test
    public void canBookConferenceRoom(){
        assertEquals(conferenceRoom, booking.getConferenceRoomBooked());
    }

}
