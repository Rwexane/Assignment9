package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.Movie;
import com.theatrix.repository.MovieRepository;
import com.theatrix.service.OnlineMovie.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieServicesImpl implements MovieServices {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie save(Movie id) {
        return movieRepository.save(id);
    }

    @Override
    public Movie findById(Long aLong) {
        return movieRepository.findOne(aLong);
    }

    @Override
    public Movie update(Movie id) {
        return movieRepository.save(id);
    }

    @Override
    public void delete(Movie id) {
        movieRepository.delete(id);
    }

    @Override
    public void bookMovie(Movie id) {

    }
}
