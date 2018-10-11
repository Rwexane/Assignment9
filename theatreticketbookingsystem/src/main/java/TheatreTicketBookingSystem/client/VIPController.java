package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.VIP;
import TheatreTicketBookingSystem.services.Impl.VIPServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/vip")
public class VIPController {

    @Autowired
    private VIPServiceImpl vipService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<VIP> getAllAction()
    {
        return vipService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addVIP(@RequestBody VIP vip){
        vipService.create(vip);
    }

    @RequestMapping(value="/find{vipID}")
    public @ResponseBody VIP findVIP(@PathVariable Long vipID){
        return vipService.readById(vipID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateVIP(@RequestBody VIP vip){
        vipService.update(vip);
    }

    @RequestMapping(value="/delete/{vipID}",  method = RequestMethod.DELETE)
    public void deleteVIP(@PathVariable VIP vip){

        vipService.delete(vip);
    }



}
