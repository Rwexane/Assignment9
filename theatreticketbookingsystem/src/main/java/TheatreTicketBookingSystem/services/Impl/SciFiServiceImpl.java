package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.SciFi;
import TheatreTicketBookingSystem.repositories.SciFiRepository;
import TheatreTicketBookingSystem.services.ScifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SciFiServiceImpl implements ScifiService{

    @Autowired
    private SciFiRepository repository;
    @Override
    public SciFi create(SciFi entity) {
        return repository.save(entity) ;
    }

    @Override
    public SciFi readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<SciFi> readAll() {
        Iterable<SciFi> sciFis =repository.findAll();
        Set sciFisSet = new HashSet();
        for(SciFi sciFi:sciFis){
            sciFisSet.add(sciFi);
        }
        return sciFisSet;
    }

    @Override
    public SciFi update(SciFi entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(SciFi entity) {
        repository.delete(entity);
    }
}
