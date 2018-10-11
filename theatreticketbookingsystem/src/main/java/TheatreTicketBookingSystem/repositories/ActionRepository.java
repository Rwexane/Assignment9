package TheatreTicketBookingSystem.repositories;

import TheatreTicketBookingSystem.domain.Action;
import org.springframework.data.repository.CrudRepository;

public interface ActionRepository extends CrudRepository<Action, Long> {
}
