package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Documentary;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
public class DocumentaryFactoryTest {

    Documentary movie;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("movie_id", 100);
        values.put("title", "IT");
        values.put("duration", 120);
    }

    @Test
    public void getDocumentary() throws Exception {
        movie = DocumentaryFactory.getDocumentary(values);
    }

}