package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.Theatre;
import com.theatrix.repository.TheatreRepository;
import com.theatrix.service.OnlineMovie.TheatreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TheatreServiceImpl implements TheatreServices {

    @Autowired
    private TheatreRepository theatreRepository;

    @Override
    public Theatre save(Theatre id) {
        return theatreRepository.save(id);
    }

    @Override
    public Theatre findById(Long aLong) {
        return theatreRepository.findOne(aLong);
    }

    @Override
    public Theatre update(Theatre id) {
        return theatreRepository.save(id);
    }

    @Override
    public void delete(Theatre id) {
        theatreRepository.delete(id);
    }

    @Override
    public void bookMovie(Theatre id) {

    }
}
