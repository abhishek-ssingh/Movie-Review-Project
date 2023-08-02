package dev.abhishek.movies.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data  //this take cares of all getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "movies")
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String tailorLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    /*
    prop of mongo db, so we can use
    this will cause database to store only ids and view will be in a separate collection
    called Manual Reference Relationship
     */
    private List<Review> reviewIds;
}
