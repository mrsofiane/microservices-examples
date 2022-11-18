package me.mrsofiane.movieservice.movies;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
@Log4j2
public class MoviesService {

    private final OmdbApiHttpClient omdbApiHttpClient = OmdbApiHttpClient.getInstance();

    public String getMoviesByImdbID(String imdbId) {
        try {
            return omdbApiHttpClient.getMovieByImdbId(imdbId);
        }catch (IOException e) {
            log.error(e.getMessage());
        }
        return "not found";
    }
}
