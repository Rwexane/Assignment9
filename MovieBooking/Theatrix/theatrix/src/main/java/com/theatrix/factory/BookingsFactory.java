package com.theatrix.factory;

import com.theatrix.domain.Booking;
import com.theatrix.utility.KeyGenerator;

public class BookingsFactory {

    public static Booking buildBookings(Long customerId, Long movieId, Long theatreId, Long showId
    , Long seatId, String date, int noSeats){

        Booking booking = new Booking.Builder()
                .id(KeyGenerator.getEntityId())
                .custIdVal(customerId)
                .movieIdVal(movieId)
                .theatreIdVal(theatreId)
                .showIdVal(showId)
                .seatIdVal(seatId)
                .dateVal(date)
                .numCustVal(noSeats)
                .build();

        return booking;
    }
}
