package com.hexaware.bookmovieticket.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.bookmovieticket.entities.Show;

public class ShowServiceImp implements IShowService {

	@Override
	public int insertShow(Show show) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateShow(Show show) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int deleteShow(int showId) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Show getByShowId(int showId) {
		// TODO Auto-generated method stub
		Show show=new Show(201, "Morning Show", LocalTime.of(11,30));
		return show;
	}

	@Override
	public List<Show> getAllShow() {
		List<Show> shows=new ArrayList<Show>();

		Show show=new Show(201, "Morning Show", LocalTime.of(11,30));
		Show show1=new Show(202, "Afternoon Show", LocalTime.of(2,30));
		Show show2=new Show(203, "Evening Show", LocalTime.of(6,30));
		shows.add(show);
		shows.add(show1);
		shows.add(show2);

		
		return shows;
	}

}
