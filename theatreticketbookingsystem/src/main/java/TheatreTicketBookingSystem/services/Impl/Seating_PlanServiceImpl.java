package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Seating_Plan;
import TheatreTicketBookingSystem.repositories.Seating_PlanRepository;
import TheatreTicketBookingSystem.services.Seating_PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/11/04.
 */

@Service
public class Seating_PlanServiceImpl implements Seating_PlanService {

    @Autowired
    private Seating_PlanRepository repository;
    @Override
    public Seating_Plan create(Seating_Plan entity) {
        return repository.save(entity) ;
    }

    @Override
    public Seating_Plan readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Seating_Plan> readAll() {
        Iterable<Seating_Plan> seatingPlans =repository.findAll();
        Set seatingPlansSet = new HashSet();
        for(Seating_Plan seatingPlan:seatingPlans){
            seatingPlansSet.add(seatingPlan);
        }
        return seatingPlansSet;
    }

    @Override
    public Seating_Plan update(Seating_Plan entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Seating_Plan entity) {
        repository.delete(entity);
    }
}
