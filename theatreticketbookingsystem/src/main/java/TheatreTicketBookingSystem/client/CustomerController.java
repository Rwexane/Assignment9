package TheatreTicketBookingSystem.client;


import TheatreTicketBookingSystem.domain.Customer;
import TheatreTicketBookingSystem.services.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.json.Json;
import java.util.Set;

/**
 * Created by Tristan on 2017/11/05.
 */
@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Customer> getAllCustomer()
    {
        return customerService.readAll();
    }

    @RequestMapping( method = RequestMethod.POST, value="/add")
    public String addCustomer(@RequestBody Customer customer){

   //     Customer customer = (Customer)obj;
        customerService.create(customer);
//Json x = obj;
        return customer.getName().toString() + " has SuccessFully registered";
    }

    @RequestMapping(value="/login/{email}/{password}")
    public @ResponseBody Customer findCustomer(@PathVariable String email, @PathVariable String password){
        Customer cust = customerService.login(email, password);
        return cust;
    }

    @RequestMapping(value="/find/{customerID}")
    public @ResponseBody Customer findCustomer(@PathVariable Long customerID){
        return customerService.readById(customerID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer){
        customerService.update(customer);
    }

    @RequestMapping(value="/delete/{customerID}",  method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable Customer customerID){

        customerService.delete(customerID);
    }



}
