package dev.abhishek.movies.service;

import dev.abhishek.movies.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import dev.abhishek.movies.entity.Review;

public interface ReviewService {

    Review createReview(String reviewBody, String imdbId);
}
