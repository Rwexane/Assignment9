package com.theatrix.controler;

import com.google.gson.Gson;
import com.theatrix.domain.Seat;
import com.theatrix.factory.SeatFactory;
import com.theatrix.repository.SeatRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "/seat")
public class SeatController {

    private SeatRepository seatRepository;
    //inserts seats
    @GetMapping(path ="/addSeatsMovie/{seatNumber}/{category}")
    public @ResponseBody
    String addSeatsMovie(@RequestParam String seatCategory, @RequestParam int seat_qauntity)
    {
        Seat seat = SeatFactory.buildSeat(seatCategory,seat_qauntity);
        seatRepository.save(seat);
        System.out.println("seat Record Added Successfully\n");
        return new Gson().toJson(seat);
    }
    //reads single seat details
    @GetMapping(path ="/readSingleSeat/{seatId}")
    public @ResponseBody String readSingleSeat(@RequestParam Long seatId)
    {
        Seat seat = seatRepository.findOne(seatId);
        System.out.println("display single seat record\n");
        return new Gson().toJson(seatId);
    }
    //reads all movie information
    @GetMapping(path ="/readAllSeats")
    public @ResponseBody Iterable<Seat> getAllSeats()
    {
        System.out.println("displaying all seats \n");
        return seatRepository.findAll();
    }
    //delete movie
    @GetMapping(path ="/deleteSeat/{seatId}")
    public @ResponseBody String deleteSeat(@RequestParam Long seatId)
    {
        Seat seat = seatRepository.findOne(seatId);
        if(seatId ==null){
            System.out.println(" seat Record does not exists");
        }
        else{
            seatRepository.delete(seat);
            System.out.println("your record deleted successfully Successfully\n");
        }
        return new Gson().toJson(seat);
    }
    //update movie details
    @GetMapping(path ="/updateSeat/{seatIdentity}")
    public @ResponseBody String updateSeat(@RequestParam Long seatId,@RequestParam String seatNumber,
                                           @RequestParam int seat_quntity)
    {
        Seat seat = seatRepository.findOne(seatId);
        if(seat !=null){

            Seat seatUpdate = new Seat.Builder()
                    .seat_class_category(seatNumber)
                    .seat_quantity(seat_quntity)
                    .build();

            seatRepository.save(seatUpdate);
            System.out.println("seat record updated Successfully\n");
        }
        else{
            System.out.println("failed to update record(s)\n");
        }
        return new Gson().toJson(seat);
    }
}
