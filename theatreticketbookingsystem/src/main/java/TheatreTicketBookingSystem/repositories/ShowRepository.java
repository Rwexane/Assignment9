package TheatreTicketBookingSystem.repositories;


import TheatreTicketBookingSystem.domain.Viewing;
import org.springframework.data.repository.CrudRepository;

public interface ShowRepository extends CrudRepository<Viewing, Long> {
}
