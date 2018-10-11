package TheatreTicketBookingSystem.repositories;


import TheatreTicketBookingSystem.domain.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long> {
}