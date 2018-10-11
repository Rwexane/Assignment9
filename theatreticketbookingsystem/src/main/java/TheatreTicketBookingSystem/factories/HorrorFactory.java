package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Horror;
import TheatreTicketBookingSystem.domain.Reservation;
import TheatreTicketBookingSystem.domain.Viewing;

import java.util.List;
import java.util.Map;

public class HorrorFactory {
    public static Horror getHorror(Map<String, Object> values){
        Horror factoryHorror = new Horror.Builder()
                .imagePath((String)values.get("imagePath"))
                .movie_id((Integer)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .reservation((Reservation)values.get("reservation"))
                .viewing((List<Viewing>)values.get("viewing"))
                .build();
        return factoryHorror;
    }
}
