package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.VIP;

import java.util.Map;
public class VIPFactory {
    public static VIP getVIP(Map<String, Object> values){
        VIP factoryVIP = new VIP.Builder()
                .seat_id((Long)values.get("seat_id"))
                .price((Integer)values.get("price"))
                .class_name((String)values.get("class_name"))
                .build();
        return factoryVIP;
    }
}
