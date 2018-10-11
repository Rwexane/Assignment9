package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.VIP;
import TheatreTicketBookingSystem.repositories.VIPRepository;
import TheatreTicketBookingSystem.services.VIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VIPServiceImpl implements VIPService {

    @Autowired
    private VIPRepository repository;
    @Override
    public VIP create(VIP entity) {
        return repository.save(entity) ;
    }

    @Override
    public VIP readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<VIP> readAll() {
        Iterable<VIP> vips =repository.findAll();
        Set vipSet = new HashSet();
        for(VIP vip:vips){
            vipSet.add(vip);
        }
        return vipSet;
    }

    @Override
    public VIP update(VIP entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(VIP entity) {
        repository.delete(entity);
    }
}
