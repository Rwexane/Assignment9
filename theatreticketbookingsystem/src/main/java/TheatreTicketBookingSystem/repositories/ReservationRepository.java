package TheatreTicketBookingSystem.repositories;

import TheatreTicketBookingSystem.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
