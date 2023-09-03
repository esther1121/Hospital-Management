package com.example.HospitalManagementSystem.service;

import java.util.List;

import com.example.HospitalManagementSystem.DTO.PatientDTO;
import com.example.HospitalManagementSystem.DTO.PatientSaveDTO;
import com.example.HospitalManagementSystem.DTO.PatientUpdateDTO;
import com.example.HospitalManagementSystem.model.Nurse;
import com.example.HospitalManagementSystem.model.Patient;

public interface PatientService {
	
	String addPatient(PatientSaveDTO patientSaveDTO );
	List<PatientDTO>getAllPatients();
	Patient updatePatient(Patient patient, int id);
	boolean deletePatient(int id);
	Patient getPatientById(int id);

}
