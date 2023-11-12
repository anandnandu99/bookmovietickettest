package com.hexaware.bookmovieticket.service;

import java.util.List;

import com.hexaware.bookmovieticket.entities.User;


public interface IUserService {
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(int userId);
	public User getByUserId(int userId);
	public List<User> getAllUser();
	
	

}
