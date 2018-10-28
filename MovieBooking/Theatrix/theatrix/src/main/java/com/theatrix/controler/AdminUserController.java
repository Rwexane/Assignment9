package com.theatrix.controler;


import com.google.gson.Gson;
import com.theatrix.domain.*;
import com.theatrix.factory.*;
import com.theatrix.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/adminUser")
public class AdminUserController {

    @Autowired
    private AdminUserRepository adminUserRepository;
    private CustomerRepository customerRepository;
    private MovieRepository movieRepository;
    private SeatRepository seatRepository;
    private BookingRepository bookRepository;

    //inserts new admin user
    @GetMapping(path ="/addAdmin/{firstname}/{lastname}/{password}")
    public @ResponseBody String addAdminUser(@RequestParam String firstname, @RequestParam String lastname,
                                             @RequestParam String password)
    {
        AdminUser admin = AdminUserFactory.buildAdminUser(firstname,lastname,password);
        adminUserRepository.save(admin);
        System.out.println("admin Record Added Successfully\n");
        return new Gson().toJson(admin);
    }
    //reads single admin user
    @GetMapping(path ="/readSingleUser/{userIdentity}")
    public @ResponseBody String readSingleUser(@RequestParam Long userIdentity)
    {
        AdminUser admin = adminUserRepository.findOne(userIdentity);
        System.out.println("display single admin user record Successfully\n");
        return new Gson().toJson(admin);
    }
    //reads all admin users
    @GetMapping(path ="/readAllUsers")
    public @ResponseBody Iterable<AdminUser> getAllAdminUsers()
    {
        System.out.println("displaying all admin members \n");
        return adminUserRepository.findAll();
    }
    //delete single user
    @GetMapping(path ="/deleteAdminUser/{userIdentity}")
    public @ResponseBody String deleteAdminUser(@RequestParam Long userIdentity)
    {
        AdminUser admin = adminUserRepository.findOne(userIdentity);
        if(admin ==null){
            System.out.println("Record does not exists");
        }
        else{
            adminUserRepository.delete(admin);
            System.out.println("admin record deleted Successfully\n");
        }
        return new Gson().toJson(admin);
    }
    //update single user admin details
    @GetMapping(path ="/updateAdmin/{userIdentity}")
    public @ResponseBody String updateAdminUser(@RequestParam Long userIdentity, @RequestParam String firstname,@RequestParam String lastname,
                                                @RequestParam String password)
    {
        AdminUser admin = adminUserRepository.findOne(userIdentity);
        if(admin !=null){

            AdminUser adminUserUpdate = new AdminUser.Builder()
                    .nameVal(firstname)
                    .surnameVal(lastname)
                    .passwordVal(password)
                    .build();

            adminUserRepository.save(adminUserUpdate);
            System.out.println("admin record updated Successfully\n");
        }
        else{
            System.out.println("admin record not updated\n");
        }
        return new Gson().toJson(admin);
    }
    //inserts seats
    @GetMapping(path ="/bookmovie/{customer_ID}/{movie_ID}/{theatre_ID}/{show_ID}/{seat_ID}/{noSesats}{date}")
    public @ResponseBody String bookmovie(@RequestParam Long customer_ID, @RequestParam Long movie_ID,@RequestParam Long theatre_ID,
                                          @RequestParam Long show_ID,@RequestParam Long seat_ID,@RequestParam int noSesats,
                                          @RequestParam String date)
    {

        Booking booking = BookingsFactory.buildBookings(customer_ID,movie_ID,theatre_ID,show_ID,seat_ID,date,noSesats);
        bookRepository.save(booking);
        System.out.println("movie Record booked Successfully\n");
        return new Gson().toJson(booking);
    }
}
