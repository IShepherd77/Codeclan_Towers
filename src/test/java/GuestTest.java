import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    public Guest guest1;
    public Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Ian");
        guest2 = new Guest("Vic");
    }

    @Test
    public void canGetGuestName(){
        assertEquals("Ian", guest1.getName());
        assertEquals("Vic", guest2.getName());
    }

}
