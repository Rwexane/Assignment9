package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Customer;
import TheatreTicketBookingSystem.domain.Reservation;
import TheatreTicketBookingSystem.repositories.ReservationRepository;
import TheatreTicketBookingSystem.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/11/04.
 */

@Service
public class ReservationServiceImpl implements ReservationService{

        @Autowired
        private ReservationRepository repository;
        @Override
        public Reservation create(Reservation entity) {
            return repository.save(entity) ;
        }

        @Override
        public Reservation readById(Long id) {
            return repository.findOne(id);
        }

        @Override
        public Set<Reservation> readAll() {
            Iterable<Reservation> reservations =repository.findAll();
            Set reservationSet = new HashSet();
            for(Reservation reservation:reservations){
                reservationSet.add(reservation);
            }
            return reservationSet;
        }

     public Set<Reservation> CustomerReservations(Customer customer) {
        Iterable<Reservation> reservations =repository.findAll();
        Set reservationSet = new HashSet();
        for(Reservation reservation:reservations){
            if(reservation.getCustomer().getCustomer_id() == customer.getCustomer_id())
            reservationSet.add(reservation);
        }
        return reservationSet;
    }

        @Override
        public Reservation update(Reservation entity) {
            return repository.save(entity);
        }

        @Override
        public void delete(Reservation entity) {
            repository.delete(entity);
        }
}
