package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Documentary;
import TheatreTicketBookingSystem.repositories.DocumentaryRepository;
import TheatreTicketBookingSystem.services.DocumentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class DocumentaryServiceImpl implements DocumentaryService{

    @Autowired
    private DocumentaryRepository repository;
    @Override
    public Documentary create(Documentary entity) {
        return repository.save(entity) ;
    }

    @Override
    public Documentary readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Documentary> readAll() {
        Iterable<Documentary> documentaries =repository.findAll();
        Set documentarySet = new HashSet();
        for(Documentary documentary:documentaries){
            documentarySet.add(documentary);
        }
        return documentarySet;
    }

    @Override
    public Documentary update(Documentary entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Documentary entity) {
        repository.delete(entity);
    }
}
