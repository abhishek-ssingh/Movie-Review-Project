package dev.abhishek.movies.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import dev.abhishek.movies.entity.Review;
import org.bson.types.ObjectId;

public interface ReviewRepo extends MongoRepository<Review, ObjectId> {
}
