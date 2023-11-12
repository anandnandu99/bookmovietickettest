package com.hexaware.bookmovieticket.entities;

import java.util.Objects;

public class Movie {
    private int movieId;
    private String movieName;
    private double movieRating;

    public Movie() {
		super();
	}

	// Constructor
    public Movie(int movieId, String movieName, double movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    // Getter methods
    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getMovieRating() {
        return movieRating;
    }

    // Setter methods
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    // toString method to represent Movie object as a string
    @Override
    public String toString() {
        return "Movie ID: " + movieId + "\nMovie Name: " + movieName + "\nMovie Rating: " + movieRating;
    }

	@Override
	public int hashCode() {
		return Objects.hash(movieId, movieName, movieRating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return movieId == other.movieId && Objects.equals(movieName, other.movieName)
				&& Double.doubleToLongBits(movieRating) == Double.doubleToLongBits(other.movieRating);
	}
}
