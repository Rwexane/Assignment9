package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Admin;
import TheatreTicketBookingSystem.services.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Admin> getAllAdmin()
    {
        return adminService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addAdmin(@RequestBody Admin admin){
        adminService.create(admin);
    }

    @RequestMapping(value="/find{adminID}")
    public @ResponseBody Admin findAudioClip(@PathVariable Long adminID){
        return adminService.readById(adminID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateAdmin(@RequestBody Admin admin){
        adminService.update(admin);
    }

    @RequestMapping(value="/delete/{adminID}",  method = RequestMethod.DELETE)
    public void deleteAdmin(@PathVariable Admin adminID){

        adminService.delete(adminID);
    }

}
