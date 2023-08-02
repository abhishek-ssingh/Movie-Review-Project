package dev.abhishek.movies.service.impl;

import dev.abhishek.movies.entity.Movie;
import dev.abhishek.movies.repository.MovieRepo;
import dev.abhishek.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class MovieServiceImpl{
    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }
}
