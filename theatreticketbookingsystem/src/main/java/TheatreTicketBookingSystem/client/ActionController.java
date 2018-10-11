package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Action;
import TheatreTicketBookingSystem.services.Impl.ActionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Tristan on 2017/11/05.
 */
@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/action")
public class ActionController {

    @Autowired
    private ActionServiceImpl actionService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Action> getAllAction()
    {
        return actionService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addAction(@RequestBody Action action){
        actionService.create(action);

       /* Action a = (Action)action;

        Action x = a;*/
    }

    @RequestMapping(value="/find{actionID}")
    public @ResponseBody Action findAction(@PathVariable Long actionID){
        return actionService.readById(actionID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateAction(@RequestBody Action action){
        actionService.update(action);
    }

    @RequestMapping(value="/delete/{actionID}",  method = RequestMethod.DELETE)
    public void deleteAction(@PathVariable Action actionID){

        actionService.delete(actionID);
    }



}
