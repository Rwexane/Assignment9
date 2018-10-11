package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Horror;
import TheatreTicketBookingSystem.services.Impl.HorrorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Tristan on 2017/11/05.
 */
@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/horror")
public class HorrorController {

    @Autowired
    private HorrorServiceImpl horrorService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Horror> getAllHorror()
    {
        return horrorService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addHorror(@RequestBody Horror horror){

        horrorService.create(horror);
    }

    @RequestMapping(value="/find{horrorID}")
    public @ResponseBody Horror findHorror(@PathVariable Long horrorID){
        return horrorService.readById(horrorID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateHorror(@RequestBody Horror horror){
        horrorService.update(horror);
    }

    @RequestMapping(value="/delete/{horrorID}",  method = RequestMethod.DELETE)
    public void deleteHoror(@PathVariable Horror horrorID){

        horrorService.delete(horrorID);
    }



}
