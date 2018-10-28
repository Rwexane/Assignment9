package com.theatrix.controler;

import com.google.gson.Gson;
import com.theatrix.domain.Customer;
import com.theatrix.factory.CustomerFactory;
import com.theatrix.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "/customer")
public class CustomerController {
    private CustomerRepository customerRepository;
    //adding customer details
    @GetMapping(path ="/addCustomer/{firstname}/{lastname}/{cellphone}/{email}/{age}/{password}")
    public @ResponseBody
    String addCustomer(@RequestParam String firstname,
                       @RequestParam String lastname, @RequestParam String cellphone,
                       @RequestParam String email, @RequestParam String age,
                       @RequestParam String password)
    {
        Customer customer = CustomerFactory.buildCustomer(firstname,lastname,cellphone,email,age,password);
        if(customer!=null){
            customerRepository.save(customer);
            System.out.println("customer Record Added Successfully\n");
        }
        else{
            System.out.println("customer Record failed to add\n");
        }
        return new Gson().toJson(customer);
    }
    //reads single customer details
    @GetMapping(path ="/readSingleCustomer/{customerId}")
    public @ResponseBody String readSingleCustomer(@RequestParam Long customerId)
    {
        Customer customer = customerRepository.findOne(customerId);
        System.out.println("display single customer record Successfully\n");
        return new Gson().toJson(customer);
    }
    //reads all customer
    @GetMapping(path ="/readAllCustomers")
    public @ResponseBody Iterable<Customer> getAllCustomers()
    {
        System.out.println("displaying customers \n");
        return customerRepository.findAll();
    }
    //delete customer
    @GetMapping(path ="/deleteCustomerAccount/{customerId}")
    public @ResponseBody String deleteCustomerAccount(@RequestParam Long customerId)
    {
        Customer customer = customerRepository.findOne(customerId);
        if(customer ==null){
            System.out.println("Record does not exists");
        }
        else{
            customerRepository.delete(customerId);
            System.out.println("your record deleted successfully Successfully\n");
        }
        return new Gson().toJson(customer);
    }
    //update customer details
    @GetMapping(path ="/updateCustomer/{userIdentity}")
    public @ResponseBody String updateCustomer(@RequestParam Long customerId,@RequestParam String firstname,
                                               @RequestParam String lastname,@RequestParam String cellphone,
                                               @RequestParam String email,@RequestParam String age,
                                               @RequestParam String password)
    {
        Customer customer = customerRepository.findOne(customerId);
        if(customer !=null){

            Customer customerUpdate = new Customer.Builder()
                    .nameVal(firstname)
                    .surnameVal(lastname)
                    .phoneNumVal(cellphone)
                    .emailVal(email)
                    .ageVal(age)
                    .passwordVal(password)
                    .build();

            customerRepository.save(customerUpdate);
            System.out.println("your details updated successfully updated Successfully\n");
        }
        else{
            System.out.println("failed to update record(s)\n");
        }
        return new Gson().toJson(customer);
    }
}
