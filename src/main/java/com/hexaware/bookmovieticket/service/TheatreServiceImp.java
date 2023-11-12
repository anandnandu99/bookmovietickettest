package com.hexaware.bookmovieticket.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.bookmovieticket.entities.Theatre;

public class TheatreServiceImp implements ITheatreService {

	@Override
	public int insertTheatre(Theatre theatre) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateTheatre(Theatre theatre) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int deleteTheatre(int theatreId) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Theatre getByTheatreId(int theatreId) {
		// TODO Auto-generated method stub
		Theatre theatre=new Theatre(301, "PVR", "Chennai");
		return theatre;
	}

	@Override
	public List<Theatre> getAllTheatres() {
		// TODO Auto-generated method stub
		List<Theatre> theatres=new ArrayList<Theatre>();
		Theatre theatre=new Theatre(301, "PVR", "Chennai");
		Theatre theatre1=new Theatre(302, "PVR", "Hyderabad");
		theatres.add(theatre);
		theatres.add(theatre1);

		return theatres;
	}

}
