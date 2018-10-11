package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Customer;
import TheatreTicketBookingSystem.domain.Reservation;
import TheatreTicketBookingSystem.domain.Viewing;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class ReservationFactory {
    public static Reservation getReservation(Map<String, Object> values){
        Reservation factoryReservation = new Reservation.Builder()
                .reservation_id((Long)values.get("reservation_id"))
                .seats((ArrayList<Integer>) values.get("seats"))
                .show_id((Viewing)values.get("show_id"))
                .total_price((Integer)values.get("total_price"))
                .customer_id((Customer)values.get("customer_id"))
                .build();
        return factoryReservation;
    }
}
