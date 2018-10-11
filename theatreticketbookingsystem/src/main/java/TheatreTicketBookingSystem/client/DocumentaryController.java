package TheatreTicketBookingSystem.client;

import TheatreTicketBookingSystem.domain.Documentary;
import TheatreTicketBookingSystem.services.Impl.DocumentaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/documentary")
public class DocumentaryController {

    @Autowired
    private DocumentaryServiceImpl documentaryService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Documentary> getAllDocumentary()
    {
        return documentaryService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addDocumentary(@RequestBody Documentary documentary){
        documentaryService.create(documentary);
    }

    @RequestMapping(value="/find{documentaryID}")
    public @ResponseBody Documentary findDocumentary(@PathVariable Long documentaryID){
        return documentaryService.readById(documentaryID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateDocumentary(@RequestBody Documentary documentary){
        documentaryService.update(documentary);
    }

    @RequestMapping(value="/delete/{actionID}",  method = RequestMethod.DELETE)
    public void deleteDocumentary(@PathVariable Documentary documentaryID){

        documentaryService.delete(documentaryID);
    }



}
