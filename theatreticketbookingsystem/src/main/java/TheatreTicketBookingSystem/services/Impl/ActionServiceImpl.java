package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Action;
import TheatreTicketBookingSystem.repositories.ActionRepository;
import TheatreTicketBookingSystem.services.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ActionServiceImpl implements ActionService{


    @Autowired
    private ActionRepository repository;
    @Override
    public Action create(Action entity) {
        return repository.save(entity) ;
    }

    @Override
    public Action readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Action> readAll() {
        Iterable<Action> actions =repository.findAll();
        Set actionSet = new HashSet();
        for(Action action:actions){
            actionSet.add(action);
        }
        return actionSet;
    }

    @Override
    public Action update(Action entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Action entity) {
        repository.delete(entity);
    }
}

