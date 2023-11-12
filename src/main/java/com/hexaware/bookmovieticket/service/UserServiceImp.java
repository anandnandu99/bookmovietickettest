package com.hexaware.bookmovieticket.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.bookmovieticket.entities.User;


	public class UserServiceImp implements IUserService {

		@Override
		public int insertUser(User user) {
			// TODO Auto-generated method stub
			return 5;
		}

		@Override
		public int updateUser(User user) {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		public int deleteUser(int userId) {
			// TODO Auto-generated method stub
			return 20;
		}

		@Override
		public User getByUserId(int userId) {
			// TODO Auto-generated method stub
			User user=new User(20,"anand","anand@123");
			return user;
		}

		@Override
		public List<User> getAllUser() {
			// TODO Auto-generated method stub
			User user=new User(20,"anand","anand@123");
			User user1=new User(21,"kumar","kumar@123");
			List<User> users=new ArrayList<User>();
			users.add(user);
			users.add(user1);
			return users;
		}

	}
