import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    public ConferenceRoom conferenceRoom;
    public Guest guest;
    public Guest guest2;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(10, "Roosevelt Suite");
        guest = new Guest("Bob");
        conferenceRoom.addGuest(guest);
    }

    @Test
    public void canGetCapacityOfConferenceRoom(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetConferenceRoomName(){
        assertEquals("Roosevelt Suite", conferenceRoom.getName());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuest(guest);
        assertEquals(2, conferenceRoom.getCount());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(1, conferenceRoom.getCount());
    }

}
