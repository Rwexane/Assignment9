package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Horror;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tristan on 2017/11/04.
 */
public class HorrorFactoryTest {

    Horror movie;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("movie_id", 100);
        values.put("duration", 120);
        values.put("title", "IT");
    }

    @Test
    public void getHorror() throws Exception {
        movie = HorrorFactory.getHorror(values);
        assertEquals("IT", movie.getTitle());
    }

}