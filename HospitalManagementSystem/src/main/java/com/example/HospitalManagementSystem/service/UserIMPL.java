package com.example.HospitalManagementSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.HospitalManagementSystem.DTO.LoginDTO;
import com.example.HospitalManagementSystem.DTO.UserDTO;
import com.example.HospitalManagementSystem.model.User;
import com.example.HospitalManagementSystem.repository.UserRepo;

@Service
public class UserIMPL implements UserService {
	
	 @Autowired
	    private UserRepo userRepo;

	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User(
				userDTO.getUserid(),
				userDTO.getUsername(),
				userDTO.getEmail(),
				userDTO.getPassword()
				
        );userRepo.save(user);
        return user.getUsername();
	}

	@Override
	public LoginMesage loginUser(LoginDTO loginDTO) {
		String msg = "";
		 User user1 = userRepo.findByEmail(loginDTO.getEmail());
	        if (user1 != null) {
	            String password = loginDTO.getPassword();
	            String encodedPassword = user1.getPassword();
	            Boolean isPwdRight = password.matches(encodedPassword);
	            if (isPwdRight) {
	                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
	                if (user.isPresent()) {
	                    return new LoginMesage("Login Success", true);
	                } else {
	                    return new LoginMesage("Login Failed", false);
	                }
	            } else {
	                return new LoginMesage("password Not Match", false);
	            }
	        }else {
	            return new LoginMesage("Email not exits", false);
	        }
	    }
}
