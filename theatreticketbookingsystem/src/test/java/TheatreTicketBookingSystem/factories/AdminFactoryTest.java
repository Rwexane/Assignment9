package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Admin;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AdminFactoryTest {

    Map<String, Object> values;
    Admin admin;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("email", "tristan.ipaulus@gmail.com");
        values.put("admin_id", 100);
        values.put("name", "Tristan");
        values.put("surname", "Paulus");
    }

    @Test
    public void getAdmin() throws Exception {
        admin = AdminFactory.getAdmin(values);
        assertEquals("tristan.ipaulus@gmail.com", admin.getEmail());
        }
}