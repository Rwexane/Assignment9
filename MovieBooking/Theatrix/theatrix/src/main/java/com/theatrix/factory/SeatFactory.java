package com.theatrix.factory;

import com.theatrix.domain.Seat;
import com.theatrix.utility.KeyGenerator;

public class SeatFactory {

    public static Seat buildSeat(String seat_class_category, int class_no_seat){

        Seat seat = new Seat.Builder()
                .seat_Class_ID(KeyGenerator.getEntityId())
                .seat_class_category(seat_class_category)
                .seat_quantity(class_no_seat)
                .build();
        return seat;
    }
}
