package com.andrew.movies.service;

import com.andrew.movies.model.Movie;
import com.andrew.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singelMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
