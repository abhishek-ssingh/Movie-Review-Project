package dev.abhishek.movies.service;

import dev.abhishek.movies.entity.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;


public interface MovieService {
    List<Movie> getAllMovies();

    //if movie doesn't exist java will know it is null
    Optional<Movie> getMovieByImdbId(String imdbId);

}

