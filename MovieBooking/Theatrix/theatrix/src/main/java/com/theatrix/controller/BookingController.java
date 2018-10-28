package com.theatrix.controller;

import com.google.gson.Gson;
import com.theatrix.domain.*;
import com.theatrix.service.OnlineMovie.ImplService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/booking")
public class BookingController
{
    @Autowired
    private BookingServicesImpl bookingService;
    private CustomerServicesImpl customerService;
    private MovieServicesImpl movieService;
    private TheatreServiceImpl theatreService;
    private ShowServicesImpl showService;
    private SeatServicesImpl seatService;


private BookingDetails getBookingDetails(Long id)
{
    Booking booking = bookingService.findById(id);
    Customer customer = customerService.findById(booking.getCustomerId());
    Movie movie = movieService.findById(booking.getMovieId());
    Theatre theatre = theatreService.findById(booking.getTheatreId());
    Show show = showService.findById(booking.getShowId());
    Seat seat = seatService.findById(booking.getSeatId());

    BookingDetails bookingDetail = new BookingDetails();
    bookingDetail.setBookingID(booking.getId());
    bookingDetail.setCustName(customer.getName());
    bookingDetail.setMoviename(movie.getName());
    bookingDetail.setTheatreName(theatre.getName());
    bookingDetail.setShowName(show.getShow_date());
    bookingDetail.setSeatNo(seat.getClass_no_seat());

    return bookingDetail;

}

    private class BookingDetails
    {

        private String  custName, moviename, theatreName, showName,  date;
        private int seatNo;


        private Long bookingID;

        public void setSeatNumber(Long seatNumber) {
            this.seatNumber = seatNumber;
        }

        private Long seatNumber;

        public Long getBookingID() {
            return bookingID;
        }

        public void setBookingID(Long bookingID) {
            this.bookingID = bookingID;
        }

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public String getMoviename() {
            return moviename;
        }

        public void setMoviename(String moviename) {
            this.moviename = moviename;
        }

        public String getTheatreName() {
            return theatreName;
        }

        public void setTheatreName(String theatreName) {
            this.theatreName = theatreName;
        }

        public String getShowName() {
            return showName;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }





        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getSeatNo() {
            return seatNo;
        }

        public void setSeatNo(int seatNo) {
            this.seatNo = seatNo;
        }





    }

    @GetMapping(path="/read/{id}")
    public @ResponseBody String readOneBooking(@RequestParam Long id) {

        BookingDetails bookingDetails = getBookingDetails(id);

        return new Gson().toJson(bookingDetails);
    }





    @GetMapping(path="/add/{customer_ID}/{movie_ID}/{theatre_ID}/{show_ID}/{seat_ID}/{date}/{noSeats}")
    public @ResponseBody
    String addNewBooking(@RequestParam Long customer_ID, @RequestParam Long movie_ID, @RequestParam Long theatre_ID,
                      @RequestParam Long show_ID,  @RequestParam Long seat_ID,  @RequestParam String date,
                      @RequestParam int noSeats) {

        Booking booking = new Booking.Builder()
                .custIdVal(customer_ID)
                .movieIdVal(movie_ID)
                .theatreIdVal(theatre_ID)
                .showIdVal(show_ID)
                .seatIdVal(seat_ID)
                .dateVal(date)
                .numCustVal(noSeats)
                .build();

        bookingService.save(booking);
        return new Gson().toJson(booking);
    }


    @GetMapping(path="/add/{booking_id}/{customer_ID}/{movie_ID}/{theatre_ID}/{show_ID}/{seat_ID}/{date}/{noSeats}")
    public @ResponseBody
    String updateBooking(@RequestParam Long booking_id, @RequestParam Long customer_ID, @RequestParam Long movie_ID,
                         @RequestParam Long theatre_ID, @RequestParam Long show_ID,  @RequestParam Long seat_ID,
                         @RequestParam String date, @RequestParam int noSeats) {

        Booking booking = new Booking.Builder()
                .id(booking_id)
                .custIdVal(customer_ID)
                .movieIdVal(movie_ID)
                .theatreIdVal(theatre_ID)
                .showIdVal(show_ID)
                .seatIdVal(seat_ID)
                .dateVal(date)
                .numCustVal(noSeats)
                .build();

        bookingService.save(booking);
        return new Gson().toJson(booking);
    }

    @GetMapping(path="/delete/{id}")
    public @ResponseBody String deleteBooking (@RequestParam Long id) {

        Booking booking = bookingService.findById(id);
        bookingService.delete(booking);

        return new Gson().toJson(booking);
    }


}
