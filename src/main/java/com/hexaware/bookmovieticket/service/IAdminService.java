package com.hexaware.bookmovieticket.service;


import java.util.List;

import com.hexaware.bookmovieticket.entities.Admin;
public interface IAdminService {
	public int insertAdmin(Admin admin);
	public int updateAdmin(Admin admin);
	public int deleteAdmin(int adminId);
	public Admin getAdminById(int adminId);
	public List<Admin> getAllAdmin();
	
	

}

