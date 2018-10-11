package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Economy;
import TheatreTicketBookingSystem.services.Impl.EconomyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Tristan on 2017/11/05.
 */
@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/economy")
public class EconomyController {

    @Autowired
    private EconomyServiceImpl economyService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Economy> getAllEconomy()
    {
        return economyService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addEconomy(@RequestBody Economy economy){
        economyService.create(economy);
    }

    @RequestMapping(value="/find{economyID}")
    public @ResponseBody Economy findEconomy(@PathVariable Long economyID){
        return economyService.readById(economyID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateEconomy(@RequestBody Economy economy){
        economyService.update(economy);
    }

    @RequestMapping(value="/delete/{economyID}",  method = RequestMethod.DELETE)
    public void deleteEconomy(@PathVariable Economy economyID){

        economyService.delete(economyID);
    }



}
