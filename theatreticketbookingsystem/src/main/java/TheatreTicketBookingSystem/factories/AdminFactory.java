package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Admin;

import java.util.Map;

/**
 * Created by Hasan on 10/29/2017.
 */
public class AdminFactory {

    public static Admin getAdmin(Map<String, Object> values){
        Admin factoryAdmin = new Admin.Builder()
                .admin_id((Long)values.get("admin_id"))
                .email((String) values.get(("email")))
                .name((String) values.get("name"))
                .surname((String) values.get("surname"))
                .build();
        return factoryAdmin;
    }
}
