import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    public Bedroom bedroom;
    public Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(7, 2, "double");
        guest = new Guest("Paris");
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

}
