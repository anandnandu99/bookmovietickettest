package com.hexaware.bookmovieticket.service;

import java.util.List;

import com.hexaware.bookmovieticket.entities.Movie;

public interface IMovieService {
	
	public int insertMovie(Movie movie);
	public int updateMovie(Movie ticket);
	public int deleteMovie(int movieId);
	public Movie getByMovieId(int movieId);
	public List<Movie> getAllMovie();


}
