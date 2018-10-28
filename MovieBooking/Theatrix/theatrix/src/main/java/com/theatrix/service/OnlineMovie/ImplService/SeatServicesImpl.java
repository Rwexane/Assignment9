package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.Seat;
import com.theatrix.repository.SeatRepository;
import com.theatrix.service.OnlineMovie.SeatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeatServicesImpl implements SeatServices {

    @Autowired
   private SeatRepository seatRepository;

    @Override
    public Seat save(Seat id) {
        return seatRepository.save(id);
    }

    @Override
    public Seat findById(Long aLong) {
        return seatRepository.findOne(aLong);
    }

    @Override
    public Seat update(Seat id) {
        return seatRepository.save(id);
    }

    @Override
    public void delete(Seat id) {
        seatRepository.delete(id);
    }

    @Override
    public void bookMovie(Seat id) {

    }
}
