package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tristan on 2017/11/04.
 */
public class CustomerFactoryTest {

    Customer customer;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("customer_id", 100);
        values.put("cell", "0828374837");
        values.put("email", "tristan@gmail.com");
        values.put("name", "Tristan");
        values.put("surname", "Paulus");
    }

    @Test
    public void getCustomer() throws Exception {
        customer = CustomerFactory.getCustomer(values);
        assertEquals("tristan@gmail.com", customer.getEmail());
    }

}