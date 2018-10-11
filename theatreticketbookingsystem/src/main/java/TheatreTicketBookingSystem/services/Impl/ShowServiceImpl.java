package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Viewing;
import TheatreTicketBookingSystem.repositories.ShowRepository;
import TheatreTicketBookingSystem.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/11/04.
 */

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowRepository repository;
    @Override
    public Viewing create(Viewing entity) {
        return repository.save(entity) ;
    }

    @Override
    public Viewing readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Viewing> readAll() {
        Iterable<Viewing> shows =repository.findAll();
        Set ShowSet = new HashSet();
        for(Viewing show:shows){
            ShowSet.add(show);
        }
        return ShowSet;
    }

    @Override
    public Viewing update(Viewing entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Viewing entity) {
        repository.delete(entity);
    }
}
