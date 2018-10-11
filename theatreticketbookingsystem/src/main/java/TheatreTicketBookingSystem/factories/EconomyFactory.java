package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Economy;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class EconomyFactory {
    public static Economy getEconomy(Map<String, Object> values){
        Economy factoryEconomy = new Economy.Builder()
                .seat_id((Long)values.get("seat_id"))
                .price((Integer)values.get("price"))
                .class_name((String)values.get("class_name"))
                .build();
        return factoryEconomy;
    }
}
