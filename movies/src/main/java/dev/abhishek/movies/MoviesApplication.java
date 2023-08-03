package dev.abhishek.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"dev.abhishek.movies.service.MovieService", "dev.abhishek.movies.controller",
//		"dev.abhishek.movies.entity", "dev.abhishek.movies.repository",
//})
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
