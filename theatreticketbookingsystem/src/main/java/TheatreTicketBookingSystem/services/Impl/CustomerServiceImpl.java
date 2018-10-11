package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Customer;
import TheatreTicketBookingSystem.repositories.CustomerRepository;
import TheatreTicketBookingSystem.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/11/04.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;
    @Override
    public Customer create(Customer entity) {
        return repository.save(entity) ;
    }

    @Override
    public Customer readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Customer> readAll() {
        Iterable<Customer> customers =repository.findAll();
        Set customerSet = new HashSet();
        for(Customer customer:customers){
            customerSet.add(customer);
        }
        return customerSet;
    }


    public Customer login(String email, String password) {
        Iterable<Customer> customers =repository.findAll();
        Customer cust = null;
        for(Customer customer:customers){
            if(customer.getPassword().equals(password) && customer.getEmail().equals(email)) {
                cust = customer;
                break;
            }
        }
        return cust;
    }

    @Override
    public Customer update(Customer entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Customer entity) {
        repository.delete(entity);
    }
}
