package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.VVIP;
import TheatreTicketBookingSystem.repositories.VVIPRepository;
import TheatreTicketBookingSystem.services.VVIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/11/04.
 */

@Service
public class VVIPServiceImpl implements VVIPService {

    @Autowired
    private VVIPRepository repository;
    @Override
    public VVIP create(VVIP entity) {
        return repository.save(entity) ;
    }

    @Override
    public VVIP readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<VVIP> readAll() {
        Iterable<VVIP> vvips =repository.findAll();
        Set vvipSet = new HashSet();
        for(VVIP vvip:vvips){
            vvipSet.add(vvip);
        }
        return vvipSet;
    }

    @Override
    public VVIP update(VVIP entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(VVIP entity) {
        repository.delete(entity);
    }
}
