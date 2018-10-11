package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Economy;
import TheatreTicketBookingSystem.repositories.EconomyRepository;
import TheatreTicketBookingSystem.services.EconomyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/11/04.
 */

@Service
public class EconomyServiceImpl implements EconomyService {

    @Autowired
    private EconomyRepository repository;
    //@Override
   // public Economy create(Economy entity) {
   //     return repository.save(entity) ;
    //}

    @Override
    public Economy create(Economy entity)
    {
        return repository.save(entity);
    }

    @Override
    public Economy readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Economy> readAll() {
        Iterable<Economy> economies = repository.findAll();
        Set economySet = new HashSet();
        for(Economy economy:economies){
            economySet.add(economy);
        }
        return economySet;
    }

    @Override
    public Economy update(Economy entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Economy entity) {
        repository.delete(entity);
    }
}
