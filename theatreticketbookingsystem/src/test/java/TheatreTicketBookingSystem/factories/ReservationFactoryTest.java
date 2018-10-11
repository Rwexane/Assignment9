package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Reservation;
import org.junit.Before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservationFactoryTest {

    Reservation reservation;
    Map<String, Object> values;
    List<Integer> seats;

    @Before
    public void setUp() throws Exception {
        seats = new ArrayList<Integer>();
        seats.add(0);
        seats.add(0);

        values = new HashMap<String, Object>();
        values.put("reservation_id", 100);
        values.put("seats", seats);
        values.put("show_id", 100);
        values.put("total_price", 100);
        values.put("customer_id", 100);
    }

//    @Test
//    public void getReservation() throws Exception {
//        reservation = ReservationFactory.getReservation(values);
//        assertEquals(seats, reservation.getSeats());
//    }

}