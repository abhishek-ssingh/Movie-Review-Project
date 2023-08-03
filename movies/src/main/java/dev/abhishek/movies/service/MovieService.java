package dev.abhishek.movies.service;

import dev.abhishek.movies.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MovieService {
    List<Movie> getAllMovies();

}

