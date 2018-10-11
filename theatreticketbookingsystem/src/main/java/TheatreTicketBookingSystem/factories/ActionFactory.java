package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Action;
import TheatreTicketBookingSystem.domain.Reservation;
import TheatreTicketBookingSystem.domain.Viewing;

import java.util.List;
import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class ActionFactory {

    public static Action getAction(Map<String, Object> values){
        Action factoryAction = new Action.Builder()
                .imagePath((String)values.get("imagePath"))
                .movie_id((Long)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .reservation((Reservation)values.get("reservation"))
                .viewing((List<Viewing>)values.get("viewing"))
                .build();
        return factoryAction;
    }
}
