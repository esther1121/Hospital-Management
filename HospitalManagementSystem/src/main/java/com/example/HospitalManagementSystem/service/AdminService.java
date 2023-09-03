package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.DTO.AdminDTO;
import com.example.HospitalManagementSystem.DTO.LoginDTO;


public interface AdminService {
	
	String addAdmin(AdminDTO adminDTO);
    LoginMesage loginAdmin(LoginDTO loginDTO);
	

}
