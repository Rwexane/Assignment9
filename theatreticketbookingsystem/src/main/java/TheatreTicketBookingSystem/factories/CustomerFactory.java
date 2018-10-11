package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Customer;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class CustomerFactory {
    public static Customer getCustomer(Map<String, Object> values){
        Customer factoryCustomer = new Customer.Builder()
                .customer_id((Long)values.get("customer_id"))
                .cell((String) values.get("cell"))
                .email((String)values.get("email"))
                .name((String)values.get("name"))
                .surname((String)values.get("surname"))
                //.password((String)values.get("password"))
                .build();
        return factoryCustomer;
    }
}
