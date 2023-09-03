package com.example.HospitalManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalManagementSystem.DTO.AdminDTO;
import com.example.HospitalManagementSystem.DTO.LoginDTO;
import com.example.HospitalManagementSystem.DTO.UserDTO;
import com.example.HospitalManagementSystem.service.AdminService;
import com.example.HospitalManagementSystem.service.LoginMesage;
import com.example.HospitalManagementSystem.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
	
	 @Autowired
	    private UserService userService;
	    @PostMapping(path = "/save")
	    public String saveUser(@RequestBody UserDTO userDTO)
	    {
	        String id = userService.addUser(userDTO);
	        return id;
	    }
	    @PostMapping(path = "/login")
	    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
	    {
	        LoginMesage loginResponse = userService.loginUser(loginDTO);
	        return ResponseEntity.ok(loginResponse);
	    }

}





















