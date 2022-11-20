package me.mrsofiane.movieservice.movies;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping(path = "api/v1/movies")
@Log4j2
public class MoviesController {

    private final MoviesService moviesService;


    public MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("{imdbId}")
    public String getMovieByImdbID(@PathVariable String imdbId ){
        log.info("looking for movie by imdb id : "+ imdbId);
        return moviesService.getMoviesByImdbID(imdbId);
    }

}
