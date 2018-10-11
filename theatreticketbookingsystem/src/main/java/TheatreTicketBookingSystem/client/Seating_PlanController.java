package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Seating_Plan;
import TheatreTicketBookingSystem.services.Impl.Seating_PlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Tristan on 2017/11/05.
 */
@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/seating_plan")
public class Seating_PlanController {

    @Autowired
    private Seating_PlanServiceImpl seating_planService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Seating_Plan> getAllAction()
    {
        return seating_planService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addSeating_Plan(@RequestBody Seating_Plan action){
        seating_planService.create(action);
    }

    @RequestMapping(value="/find{seating_PlanID}")
    public @ResponseBody Seating_Plan findAction(@PathVariable Long seatingPlanID){
        return seating_planService.readById(seatingPlanID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateSeatingPlan(@RequestBody Seating_Plan seating_plan){
        seating_planService.update(seating_plan);
    }

    @RequestMapping(value="/delete/{seating_PlanID}",  method = RequestMethod.DELETE)
    public void deleteAction(@PathVariable Seating_Plan seating_plan){

        seating_planService.delete(seating_plan);
    }



}
