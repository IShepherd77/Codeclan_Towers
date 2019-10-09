import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    public Bedroom bedroom;
    public Guest guest1;
    public Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom("7", 2, "double");
        guest1 = new Guest("Ian");
        guest2 = new Guest("Vic");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals("7", bedroom.getRoomNumber());
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
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.getCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest1);
        assertEquals(1, bedroom.getCount());
    }
}
