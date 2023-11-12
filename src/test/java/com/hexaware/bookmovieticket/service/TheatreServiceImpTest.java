package com.hexaware.bookmovieticket.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.bookmovieticket.entities.Theatre;

class TheatreServiceImpTest {

	TheatreServiceImp service=new TheatreServiceImp();
	
	@Test
	void testInsertTheatre() {
Theatre theatre=new Theatre();
int actual=service.insertTheatre(theatre);
		assertEquals(1,actual);
	}

	@Test
	void testUpdateTheatre() {
		Theatre theatre=new Theatre();
		int actual=service.updateTheatre(theatre);
		assertEquals(2,actual);
	}

	@Test
	void testDeleteTheatre() {
		int actual=service.deleteTheatre(2);
		assertEquals(3,actual);
	}

	@Test
	void testGetTheatreById() {
		Theatre actual=service.getByTheatreId(5);
		Theatre expected=new Theatre(301, "PVR", "Chennai");
				assertEquals(expected,actual);
	}

	@Test
	void testGetAllTheatre() {
		List<Theatre> expected=new ArrayList<Theatre>();
		expected.add(new Theatre(301, "PVR", "Chennai"));
		expected.add(new Theatre(302, "PVR", "Hyderabad"));
		List<Theatre> actual=service.getAllTheatres();
		assertEquals(expected,actual);
	}

	

}
