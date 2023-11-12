package com.hexaware.bookmovieticket.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.bookmovieticket.entities.Movie;


class MovieServiceImpTest {
	MovieServiceImp service=new MovieServiceImp();

	@Test
	void testInsertMovie() {
		Movie movie=new Movie();
		int actual=service.insertMovie(movie);
		assertEquals(1,actual);
	}

	@Test
	void testUpdateMovie() {
		Movie movie=new Movie();
		int actual=service.updateMovie(movie);
		assertEquals(2,actual);
	}

	@Test
	void testDeleteFlight() {
		int actual=service.deleteMovie(2);
		assertEquals(3,actual);
	}

	@Test
	void testGetFlightById() {
		Movie actual=service.getByMovieId(5);
		Movie expected=new Movie(101, "Leo", 4.2);
				assertEquals(expected,actual);
	}

	@Test
	void testGetAllMovie() {
		List<Movie> expected=new ArrayList<Movie>();
		expected.add(new Movie(101, "Leo", 4.2));
		expected.add(new Movie(102, "Vikram", 4.0));
		List<Movie> actual=service.getAllMovie();
		assertEquals(expected,actual);
	}

}
