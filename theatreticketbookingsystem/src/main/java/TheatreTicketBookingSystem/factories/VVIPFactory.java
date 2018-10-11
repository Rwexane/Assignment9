package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.VVIP;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class VVIPFactory {
    public static VVIP getVVIP(Map<String, Object> values){
        VVIP factoryVVIP = new VVIP.Builder()
                .seat_id((Long)values.get("seat_id"))
                .price((Integer)values.get("price"))
                .class_name((String)values.get("class_name"))
                .build();
        return factoryVVIP;
    }
}
