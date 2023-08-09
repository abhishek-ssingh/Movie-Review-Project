package dev.abhishek.movies.service.impl;

import dev.abhishek.movies.entity.Movie;
import dev.abhishek.movies.entity.Review;
import dev.abhishek.movies.repository.ReviewRepo;
import dev.abhishek.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    /*
    sometimes using dynamic query via repo just isn't enough
    that's where we can use mongoTemplate where without using repo we can
    easily create a custom query
     */

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public Review createReview(String reviewBody, String imdbId){

        Review review = reviewRepo.insert(new Review(reviewBody));

        //update movie
        //by a matching custom criteria
        //and apply new object? into custom part of database
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }


}
