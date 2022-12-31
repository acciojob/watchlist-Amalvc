package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void addMovieService(Movie movie){
        movieRepository.addMovDb(movie);
    }
    public void addDirectorService(Director director){
        movieRepository.addDirDb(director);
    }
    public void addMdPair(String movie,String director){
        movieRepository.addMdPairDb(movie,director);
    }
    public Movie getMovie(String name){
        Movie movie=movieRepository.getMovieDb(name);
        return movie;
    }
    public Director getDirector(String directorName){
        return movieRepository.getDirectorDb(directorName);
    }

    public List<String> getMoviesFromDirector(String director){
        return movieRepository.findMoviesFromDirector(director);
    }

    public List<String> getAllMovies(){
        return movieRepository.findAllMovies();
    }

    public void deleteDirector(String director){

        movieRepository.deleteDirector(director);
    }

    public void deleteAllDirector(){

        movieRepository.deleteAllDirector();
    }

}
