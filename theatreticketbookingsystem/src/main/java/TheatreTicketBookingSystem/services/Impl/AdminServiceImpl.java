package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Admin;
import TheatreTicketBookingSystem.repositories.AdminRepository;
import TheatreTicketBookingSystem.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hasan on 10/29/2017.
 */

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository repository;
    @Override
    public Admin create(Admin entity) {
        return repository.save(entity) ;
    }

    @Override
    public Admin readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Admin> readAll() {
        Iterable<Admin> admins =repository.findAll();
        Set adminSet = new HashSet();
        for(Admin admin:admins){
            adminSet.add(admin);
        }
        return adminSet;
    }

    @Override
    public Admin update(Admin entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Admin entity) {
        repository.delete(entity);
    }
}
