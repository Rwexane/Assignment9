package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Economy;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tristan on 2017/11/04.
 */
public class EconomyFactoryTest {

    Economy seat;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("seat_id", 100);
        values.put("price", 40);
        values.put("class_name", "Economy");
    }

    @Test
    public void getEconomy() throws Exception {
        seat = EconomyFactory.getEconomy(values);
        assertEquals("Economy", seat.getClass_name());
    }

}