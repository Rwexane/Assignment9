package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.Customer;
import com.theatrix.repository.CustomerRepository;
import com.theatrix.service.OnlineMovie.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServicesImpl implements CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(Customer id) {
        return customerRepository.save(id);
    }

    @Override
    public Customer findById(Long aLong) {
        return customerRepository.findOne(aLong);
    }

    @Override
    public Customer update(Customer id) {
        return customerRepository.save(id);
    }

    @Override
    public void delete(Customer id) {
        customerRepository.delete(id);
    }

    @Override
    public void bookMovie(Customer id) {

    }
}
