package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.VIP;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class VIPFactoryTest {

    VIP seat;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("seat_id", 100);
        values.put("price", 100);
        values.put("class_name", "VIP");
    }

    @Test
    public void getVIP() throws Exception {
        seat = VIPFactory.getVIP(values);
        assertEquals(100, seat.getPrice());
    }

}