package com.hexaware.bookmovieticket.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.bookmovieticket.entities.Show;

class ShowServiceImpTest {

	ShowServiceImp service=new ShowServiceImp();

	@Test
	void testInsertShow() {

		Show show=new Show();
		int actual=service.insertShow(show);
		assertEquals(1,actual);
	}

	@Test
	void testUpdateShow() {
		Show show=new Show();
		int actual=service.updateShow(show);
		assertEquals(2,actual);
	}

	@Test
	void testDeleteShow() {
		int actual=service.deleteShow(201);
		assertEquals(3,actual);
	}

	@Test
	void testGetShowById() {
		Show actual=service.getByShowId(202);
		Show expected=new Show(201, "Morning Show", LocalTime.of(11,30));
				assertEquals(expected,actual);
	}

	@Test
	void testGetAllShow() {
		List<Show> expected=new ArrayList<Show>();
		expected.add(new Show(201, "Morning Show", LocalTime.of(11,30)));
		expected.add(new Show(202, "Afternoon Show", LocalTime.of(2,30)));
		expected.add(new Show(203, "Evening Show", LocalTime.of(6,30)));

		List<Show> actual=service.getAllShow();
		assertEquals(expected,actual);
	}



	}


