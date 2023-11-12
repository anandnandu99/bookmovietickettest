package com.hexaware.bookmovieticket.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.bookmovieticket.entities.Admin;


	public class AdminServiceImp implements IAdminService {

		@Override
		public int insertAdmin(Admin admin) {
			// TODO Auto-generated method stub
			return 5;
		}

		@Override
		public int updateAdmin(Admin admin) {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		public int deleteAdmin(int adminId) {
			// TODO Auto-generated method stub
			return 20;
		}

		@Override
		public Admin getAdminById(int adminId) {
			// TODO Auto-generated method stub
			Admin admin=new Admin(20,"anand","anand@123");
			return admin;
		}

		@Override
		public List<Admin> getAllAdmin() {
			// TODO Auto-generated method stub
			Admin admin=new Admin(20,"anand","anand@123");
			Admin admin1=new Admin(30,"kumar","kiran@123");
			Admin admin2=new Admin(40,"ram","ram@123");
			List<Admin> adminls=new ArrayList<Admin>();
			adminls.add(admin);
			adminls.add(admin1);
			adminls.add(admin2);
			return adminls;
		}

	}
