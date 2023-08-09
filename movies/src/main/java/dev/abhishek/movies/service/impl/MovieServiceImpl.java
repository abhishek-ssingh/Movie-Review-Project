package dev.abhishek.movies.service.impl;

import dev.abhishek.movies.entity.Movie;
import dev.abhishek.movies.repository.MovieRepo;
import dev.abhishek.movies.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }

    @Override
    public Optional<Movie> getMovieByImdbId(String imdbId){
        return movieRepo.findMovieByImdbId(imdbId);
    }
}
