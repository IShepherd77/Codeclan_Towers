import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    public Guest guest;

    @Before
    public void before(){
        guest = new Guest("Ian");
    }

    @Test
    public void canGetGuestName(){
        assertEquals("Ian", guest.getName());
    }

}
