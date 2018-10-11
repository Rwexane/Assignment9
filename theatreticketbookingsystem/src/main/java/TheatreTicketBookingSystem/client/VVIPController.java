package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.VVIP;
import TheatreTicketBookingSystem.services.Impl.VVIPServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/vvip")
public class VVIPController {

    @Autowired
    private VVIPServiceImpl vvipService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<VVIP> getAllAction()
    {
        return vvipService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addVVIP(@RequestBody VVIP vvip){
        vvipService.create(vvip);
    }

    @RequestMapping(value="/find{vvipID}")
    public @ResponseBody VVIP findVVIP(@PathVariable Long vvipID){
        return vvipService.readById(vvipID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateVVIP(@RequestBody VVIP vvip){
        vvipService.update(vvip);
    }

    @RequestMapping(value="/delete/{vvipID}",  method = RequestMethod.DELETE)
    public void deleteVVIP(@PathVariable VVIP vvip){

        vvipService.delete(vvip);
    }

}
