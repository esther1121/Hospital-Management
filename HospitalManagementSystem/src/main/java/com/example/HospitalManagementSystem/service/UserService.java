package com.example.HospitalManagementSystem.service;


import com.example.HospitalManagementSystem.DTO.LoginDTO;
import com.example.HospitalManagementSystem.DTO.UserDTO;

public interface UserService {
	
	String addUser(UserDTO userDTO);
    LoginMesage loginUser(LoginDTO loginDTO);

}
