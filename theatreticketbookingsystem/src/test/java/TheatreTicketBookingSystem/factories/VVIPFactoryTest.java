package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.VVIP;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tristan on 2017/11/04.
 */
public class VVIPFactoryTest {

    VVIP seat;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("seat_id", 100);
        values.put("price", 100);
        values.put("class_name", "VVIP");
    }

    @Test
    public void getVIP() throws Exception {
        seat = VVIPFactory.getVVIP(values);
        assertEquals(100, seat.getPrice());
    }

}