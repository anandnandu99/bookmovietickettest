package com.hexaware.bookmovieticket.service;

import java.util.List;

import com.hexaware.bookmovieticket.entities.Show;


public interface IShowService {
	public int insertShow(Show show);
	public int updateShow(Show show);
	public int deleteShow(int showId);
	public Show getByShowId(int showId);
	public List<Show> getAllShow();

}
