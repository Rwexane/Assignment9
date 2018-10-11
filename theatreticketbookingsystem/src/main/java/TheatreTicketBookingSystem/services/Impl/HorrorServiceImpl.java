package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Horror;
import TheatreTicketBookingSystem.repositories.HorrorRepository;
import TheatreTicketBookingSystem.services.HorrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class HorrorServiceImpl implements HorrorService {

    @Autowired
    private HorrorRepository repository;
    @Override
    public Horror create(Horror entity) {
        return repository.save(entity) ;
    }

    @Override
    public Horror readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Horror> readAll() {
        Iterable<Horror> horrors =repository.findAll();
        Set horrorSet = new HashSet();
        for(Horror horror:horrors){
            horrorSet.add(horror);
        }
        return horrorSet;
    }

    @Override
    public Horror update(Horror entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Horror entity) {
        repository.delete(entity);
    }
}
