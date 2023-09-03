package com.example.HospitalManagementSystem.service;

import java.util.List;

import com.example.HospitalManagementSystem.DTO.DctorLoginDTO;
import com.example.HospitalManagementSystem.DTO.DoctorDTO;
import com.example.HospitalManagementSystem.DTO.DoctorSaveDTO;
import com.example.HospitalManagementSystem.DTO.DoctorUpdateDTO;
import com.example.HospitalManagementSystem.model.Doctor;
import com.example.HospitalManagementSystem.model.Nurse;


public interface DoctorService {
	
	String addDoctor(DoctorSaveDTO doctorSaveDTO );
	List<DoctorDTO>getAllDoctors();
	Doctor updateDoctor(Doctor doctor, int id);
	boolean deleteDoctor(int id);
	Doctor getDoctorById(int id);
	

}
