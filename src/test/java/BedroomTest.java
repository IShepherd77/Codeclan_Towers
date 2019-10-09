import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    public Bedroom bedroom;
    public Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(7, 2, "double");
        guest = new Guest("Ian");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(7, bedroom.getRoomNumber());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("double", bedroom.getRoomType());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.getCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(1, bedroom.getCount());
    }





}
