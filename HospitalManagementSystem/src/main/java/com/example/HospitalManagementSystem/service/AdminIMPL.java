package com.example.HospitalManagementSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalManagementSystem.DTO.AdminDTO;
import com.example.HospitalManagementSystem.DTO.LoginDTO;
import com.example.HospitalManagementSystem.model.Admin;
import com.example.HospitalManagementSystem.repository.AdminRepo;

@Service
public class AdminIMPL implements AdminService {

	 @Autowired
	    private AdminRepo adminRepo;
	 
	
	
	
	
	@Override
	public String addAdmin(AdminDTO adminDTO) {
		Admin admin = new Admin(
				adminDTO.getAdminid(),
				adminDTO.getAdminname(),
				adminDTO.getEmail(),
				adminDTO.getPassword()
        );
		adminRepo.save(admin);
        return admin.getAdminname();
	}

	@Override
	public LoginMesage loginAdmin(LoginDTO loginDTO) {
		 String msg = "";
		 Admin admin1 = adminRepo.findByEmail(loginDTO.getEmail());
	        if (admin1 != null) {
	            String password = loginDTO.getPassword();
	            String encodedPassword = admin1.getPassword();
	            Boolean isPwdRight = password.matches(encodedPassword);
	            if (isPwdRight) {
	                Optional<Admin> admin = adminRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
	                if (admin.isPresent()) {
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
	
