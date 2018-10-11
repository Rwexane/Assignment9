package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Seating_Plan;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tristan on 2017/11/04.
 */
public class Seating_PlanFactoryTest {

    List<Integer> seats;
    Seating_Plan plan;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        seats = new ArrayList<Integer>();
        seats.add(0);
        seats.add(1);

        values = new HashMap<String, Object>();
        values.put("seat_plan_id", 100);
        values.put("seats_avail", 20);
        values.put("seats", seats);
        values.put("seats_booked", 55);
        values.put("show_id", 100);
    }

    @Test
    public void getSeating_Plan() throws Exception {
        plan = Seating_PlanFactory.getSeating_Plan(values);
        assertEquals(seats, plan.getSeats());
    }

}