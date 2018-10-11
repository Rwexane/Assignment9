package TheatreTicketBookingSystem.client;


import TheatreTicketBookingSystem.domain.Customer;
import TheatreTicketBookingSystem.domain.Reservation;
import TheatreTicketBookingSystem.services.Impl.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * Created by Tristan on 2017/11/05.
 */
@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/reservation")
public class ReservationController {

    @Autowired
    private ReservationServiceImpl reservationService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Reservation> getAllReservation()
    {
        return reservationService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addAction(@RequestBody Reservation reservation){
      // Reservation res = (Reservation)reservation;
        reservationService.create(reservation);
    }

    @RequestMapping(value="/find{reservationID}")
    public @ResponseBody Reservation findReservation(@PathVariable Long reservationID){
        return reservationService.readById(reservationID);

    }

    @RequestMapping(value="/findCustReservation", method = RequestMethod.POST)
    public Set<Reservation> findCustReservation(@RequestBody Customer customer){
        return reservationService.CustomerReservations(customer);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateReservation(@RequestBody Reservation reservation){
        reservationService.update(reservation);
    }

    @RequestMapping(value="/delete/{reservationID}",  method = RequestMethod.DELETE)
    public void deleteReservation(@PathVariable Reservation reservation){

        reservationService.delete(reservation);
    }



}
