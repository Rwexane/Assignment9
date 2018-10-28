package com.theatrix.controller;

import com.google.gson.Gson;
import com.theatrix.domain.Theatre;
import com.theatrix.service.OnlineMovie.ImplService.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/Theatre")

public class TheatreController
{
    @Autowired
    private TheatreServiceImpl theatreService;


    @GetMapping(path="/add/{name}/{address}/{maxAdience}/{minAdience}")
    public @ResponseBody
    String addNewTheatre(@RequestParam String name, @RequestParam String address, @RequestParam String maxAdience,
                          @RequestParam String minAdience) {

        Theatre theatre = new Theatre.Builder()
                .nameVal(name)
                .addressVal(address)
                .maxAdienceVal(maxAdience)
                .minAdienceVal(minAdience)
                .build();

        theatreService.save(theatre);
        return new Gson().toJson(theatre);
    }

    @GetMapping(path="/readOne/{id}")
    public @ResponseBody
    String readOneTheatre(@RequestParam Long id) {

        Theatre theatre = theatreService.findById(id);
        return new Gson().toJson(theatre);
    }


    @GetMapping(path="/update/{id}/{name}/{address}/{maxAdience}/{minAdience}")
    public @ResponseBody
    String updateTheatre(@RequestParam long id, @RequestParam String name, @RequestParam String address,
                         @RequestParam String maxAdience, @RequestParam String minAdience) {

        Theatre theatre = new Theatre.Builder()
                .id(id)
                .nameVal(name)
                .addressVal(address)
                .maxAdienceVal(maxAdience)
                .minAdienceVal(minAdience)
                .build();

        theatreService.save(theatre);
        return new Gson().toJson(theatre);
    }


    @GetMapping(path="/delete/{id}")
    public @ResponseBody String deleteTheatre (@RequestParam Long id) {

        Theatre theatre =  theatreService.findById(id);
        theatreService.delete(theatre);

        return new Gson().toJson(theatre);
    }




}
