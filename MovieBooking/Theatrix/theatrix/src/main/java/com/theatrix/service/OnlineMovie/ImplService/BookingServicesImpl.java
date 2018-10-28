package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.Booking;
import com.theatrix.repository.BookingRepository;
import com.theatrix.service.OnlineMovie.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingServicesImpl implements BookingServices {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking save(Booking id) {
        return bookingRepository.save(id);
    }

    @Override
    public Booking findById(Long aLong) {
        return bookingRepository.findOne(aLong);
    }

    @Override
    public Booking update(Booking id) {
        return bookingRepository.save(id);
    }

    @Override
    public void delete(Booking id) {
        bookingRepository.delete(id);
    }

    @Override
    public void bookMovie(Booking id) {

        bookingRepository.save(id);
    }
}
