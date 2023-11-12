package com.hexaware.bookmovieticket.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.bookmovieticket.entities.User;

class UserServiceImpTest {
	UserServiceImp service=new UserServiceImp();

	@Test
	void testInsertUser() {
         User user=new User();
         int actual=service.insertUser(user);
		assertEquals(5,actual);
	}

	@Test
	void testUpdateUser() {
		User user=new User();
		int actual=service.updateUser(user);
		assertEquals(10,actual);
	}

	@Test
	void testDeleteUser() {
		int actual=service.deleteUser(2);
		assertEquals(20,actual);
	}

	@Test
	void testGetUserById() {
		User actual=service.getByUserId(5);
		User expected=new User(20,"anand","anand@123");

				assertEquals(expected,actual);
	}

	@Test
	void testGetAllUser() {
		List<User> expected=new ArrayList<User>();
		expected.add(new User(20,"anand","anand@123"));

		expected.add(new User(21,"kumar","kumar@123"));
		List<User> actual=service.getAllUser();
		assertEquals(expected,actual);
	}


}
