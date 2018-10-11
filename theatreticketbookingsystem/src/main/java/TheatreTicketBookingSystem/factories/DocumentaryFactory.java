package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Documentary;
import TheatreTicketBookingSystem.domain.Reservation;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class DocumentaryFactory {
    public static Documentary getDocumentary(Map<String, Object> values){
        Documentary factoryDocumentary = new Documentary.Builder()
                .imagePath((String)values.get("imagePath"))
                .movie_id((Long)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .reservation((Reservation)values.get("reservation"))
                .build();
        return factoryDocumentary;
    }
}
