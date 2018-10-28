package com.theatrix.controller;

import com.google.gson.Gson;
import com.theatrix.domain.Show;
import com.theatrix.service.OnlineMovie.ImplService.ShowServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/show")
public class ShowController
{
    @Autowired
    private ShowServicesImpl showService;


    @GetMapping(path="/add/{showDate}/{startTime}/{endTime}/{MovieId}")
    public @ResponseBody
    String addNewShow(@RequestParam String showDate, @RequestParam String startTime, @RequestParam String endTime,
                         @RequestParam Long MovieId) {

        Show show = new Show.Builder()
                .showDate(showDate)
                .startTimeVal(startTime)
                .endTimeVal(endTime)
                .movieVal(MovieId)
                .build();

        showService.save(show);
        return new Gson().toJson(show);
    }


    @GetMapping(path="/readOne/{id}")
    public @ResponseBody
    String readOneShow (@RequestParam Long id) {

        Show show =showService.findById(id);
        return new Gson().toJson(show);
    }

    @GetMapping(path="/update/{id}/{showDate}/{startTime}/{endTime}/{MovieId}")
    public @ResponseBody
    String updateShow(@RequestParam Long id, @RequestParam String showDate, @RequestParam String startTime,
                      @RequestParam String endTime, @RequestParam Long MovieId) {

        Show show = new Show.Builder()
                .id(id)
                .showDate(showDate)
                .startTimeVal(startTime)
                .endTimeVal(endTime)
                .movieVal(MovieId)
                .build();

        showService.save(show);
        return new Gson().toJson(show);
    }

    @GetMapping(path="/delete/{id}")
    public @ResponseBody String deleteShow (@RequestParam Long id) {

        Show show = showService.findById(id);
        showService.delete(show);

        return new Gson().toJson(show);
    }

}
