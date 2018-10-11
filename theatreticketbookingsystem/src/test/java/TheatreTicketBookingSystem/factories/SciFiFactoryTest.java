package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.SciFi;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/11/04.
 */
public class SciFiFactoryTest {

    SciFi movie;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("movie_id", 100);
        values.put("title", "The Fly");
        values.put("duration", 120);
    }

    @Test
    public void getSciFi() throws Exception {
        movie = SciFiFactory.getSciFi(values);
        //assertEquals(100, movie.getMovie_Id());
    }

}