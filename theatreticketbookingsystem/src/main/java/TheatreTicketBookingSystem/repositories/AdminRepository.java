package TheatreTicketBookingSystem.repositories;


import TheatreTicketBookingSystem.domain.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hasan on 10/29/2017.
 */

public interface AdminRepository extends CrudRepository<Admin, Long> {
}