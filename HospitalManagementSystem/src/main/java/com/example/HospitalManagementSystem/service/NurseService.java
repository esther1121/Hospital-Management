package com.example.HospitalManagementSystem.service;

import java.util.List;

import com.example.HospitalManagementSystem.DTO.NurseDTO;
import com.example.HospitalManagementSystem.DTO.NurseSaveDTO;
import com.example.HospitalManagementSystem.DTO.updateNurse;
import com.example.HospitalManagementSystem.model.Nurse;



public interface NurseService {
	
	String addNurse(NurseSaveDTO nurseSaveDTO );
	List<NurseDTO>getAllNurse();
	boolean deleteNurse(int id);
	Nurse updateNurse(Nurse nurse, int id);
	Nurse getNurseById(int id);

}
