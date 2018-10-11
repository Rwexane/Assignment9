package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Viewing;
import TheatreTicketBookingSystem.services.Impl.ShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/show")
public class ShowController {

    @Autowired
    private ShowServiceImpl showService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Viewing> getAllAction()
    {
        return showService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addShow(@RequestBody Viewing show){
        showService.create(show);
    }

    @RequestMapping(value="/find{showID}")
    public @ResponseBody
    Viewing findShow(@PathVariable Long showID){
        return showService.readById(showID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateShow(@RequestBody Viewing show){
        showService.update(show);
    }

    @RequestMapping(value="/delete/{showID}",  method = RequestMethod.DELETE)
    public void deleteShow(@PathVariable Viewing show){

        showService.delete(show);
    }



}
