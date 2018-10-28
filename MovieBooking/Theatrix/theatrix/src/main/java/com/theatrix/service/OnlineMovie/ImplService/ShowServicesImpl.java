package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.Show;
import com.theatrix.repository.ShowRepository;
import com.theatrix.service.OnlineMovie.ShowServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShowServicesImpl implements ShowServices {

    @Autowired
    private ShowRepository showRepository;

    @Override
    public Show save(Show id) {
        return showRepository.save(id);
    }

    @Override
    public Show findById(Long aLong) {
        return showRepository.findOne(aLong);
    }

    @Override
    public Show update(Show id) {
        return showRepository.save(id);
    }

    @Override
    public void delete(Show id) {
        showRepository.delete(id);
    }

    @Override
    public void bookMovie(Show id) {

    }
}
