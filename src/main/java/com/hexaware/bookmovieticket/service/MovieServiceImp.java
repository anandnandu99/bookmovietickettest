package com.hexaware.bookmovieticket.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.bookmovieticket.entities.Movie;

public class MovieServiceImp implements IMovieService {

	@Override
	public int insertMovie(Movie movie) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return 2;
	}
      @Override
  	public int deleteMovie(int movieId) {
		return 3;
	}
	

	@Override
	public Movie getByMovieId(int movieId) {
		// TODO Auto-generated method stub
		Movie movie=new Movie(101, "Leo", 4.2);
		return movie ;
	}

	@Override
	public List<Movie> getAllMovie() {
		List<Movie> movies=new ArrayList<Movie>();
		
		// TODO Auto-generated method stub
		movies.add(new Movie(101, "Leo", 4.2));
		movies.add(new Movie(102, "Vikram", 4.0));
		
		
		

		return movies;
	}

}
