package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Viewing;
import org.junit.Before;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/11/04.
 */
public class ShowFactoryTest {

    Map<String, Object> values;
    Viewing show;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("show_id", 100);
        values.put("movie_id", 100);
        values.put("show_date", new Date());
    }

//    @Test
//    public void getShow() throws Exception {
//        show = ViewingFactory.getShow(values);
//        assertEquals(100, show.getMovie_Id());
//    }

}