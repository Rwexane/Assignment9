package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Seating_Plan;

import java.util.ArrayList;
import java.util.Map;

public class Seating_PlanFactory {
    public static Seating_Plan getSeating_Plan(Map<String, Object> values){
        Seating_Plan factorySeating_Plan = new Seating_Plan.Builder()
                .seat_plan_id((Long)values.get("seat_plan_id"))
                .seats_avail((Integer)values.get("seats_avail"))
                .seats((ArrayList<Integer>)values.get("seats"))
                .seats_booked((Integer)values.get("seats_booked"))
                .show_id((Integer)values.get("show_id"))
                .build();
        return factorySeating_Plan;
    }
}
