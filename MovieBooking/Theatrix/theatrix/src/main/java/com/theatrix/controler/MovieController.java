package com.theatrix.controler;

import com.google.gson.Gson;
import com.theatrix.domain.Movie;
import com.theatrix.factory.MoviesFactory;
import com.theatrix.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "/movie")
public class MovieController {

    private MovieRepository movieRepository;
    //inserts new movie
    @GetMapping(path ="/addNewMovie/{movieTitle}/{category}/{duration}/{yearReleased}/{ageRestriction}")
    public @ResponseBody
    String addNewMovie(@RequestParam String movieTitle, @RequestParam String category,
                       @RequestParam String duration, @RequestParam String yearReleased,
                       @RequestParam String ageRestriction)
    {
        Movie movie = MoviesFactory.buildMovie(movieTitle,category,duration,yearReleased,ageRestriction);
        movieRepository.save(movie);
        System.out.println("movie Record Added Successfully\n");
        return new Gson().toJson(movie);
    }
    //reads single movie details
    @GetMapping(path ="/readSingleMovie/{movieId}")
    public @ResponseBody String readSingleMovie(@RequestParam Long movieId)
    {
        Movie movie = movieRepository.findOne(movieId);
        System.out.println("display single movie record\n");
        return new Gson().toJson(movie);
    }
    //reads all movie information
    @GetMapping(path ="/readAllMovies")
    public @ResponseBody Iterable<Movie> getAllMovies()
    {
        System.out.println("displaying customers \n");
        return movieRepository.findAll();
    }
    //delete movie
    @GetMapping(path ="/deleteMovie/{movieId}")
    public @ResponseBody String deleteMovie(@RequestParam Long movieId)
    {
        Movie movie = movieRepository.findOne(movieId);
        if(movieId ==null){
            System.out.println(" movie Record does not exists");
        }
        else{
            movieRepository.delete(movie);
            System.out.println("your record deleted successfully Successfully\n");
        }
        return new Gson().toJson(movie);
    }
    //update movie details
    @GetMapping(path ="/updateMovie/{userIdentity}")
    public @ResponseBody String updateMovie(@RequestParam Long movieId,@RequestParam String movieTitle,
                                            @RequestParam String category,@RequestParam String duration,
                                            @RequestParam String yearReleased,
                                            @RequestParam String ageRestriction)
    {
        Movie movie = movieRepository.findOne(movieId);
        if(movie !=null){

            Movie movieUpdate = new Movie.Builder()
                    .nameVal(movieTitle)
                    .categoryVal(category)
                    .durationVal(duration)
                    .yearReleaseVal(yearReleased)
                    .ageRestrictionVal(ageRestriction)
                    .build();

            movieRepository.save(movieUpdate);
            System.out.println("movie record updated Successfully\n");
        }
        else{
            System.out.println("failed to update record(s)\n");
        }
        return new Gson().toJson(movie);
    }
}
