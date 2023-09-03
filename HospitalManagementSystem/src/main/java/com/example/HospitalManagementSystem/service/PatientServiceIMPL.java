package com.example.HospitalManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.HospitalManagementSystem.DTO.PatientDTO;
import com.example.HospitalManagementSystem.DTO.PatientSaveDTO;
import com.example.HospitalManagementSystem.DTO.PatientUpdateDTO;
import com.example.HospitalManagementSystem.model.Nurse;
import com.example.HospitalManagementSystem.model.Patient;
import com.example.HospitalManagementSystem.repository.PatientRepo;

@Service
public class PatientServiceIMPL implements PatientService{
	
	@Autowired
	private PatientRepo patientRepo;

	@Override
	public String addPatient(PatientSaveDTO patientSaveDTO) {
		Patient  patient=new  Patient(0,  patientSaveDTO.getPatientfirstname(),patientSaveDTO.getPatientlastname(),patientSaveDTO.getPatientemail(),patientSaveDTO.getPatientmobile(),patientSaveDTO.getPatientpassword());
		patientRepo.save(patient);
		return patient.getPatientfirstname();
	}

	@Override
	public List<PatientDTO> getAllPatients() {
		List<Patient>getPatient=patientRepo.findAll();
		List<PatientDTO>patientDTOList=new ArrayList<>();
		for(Patient a:getPatient)
		{
			PatientDTO patientDTO=new PatientDTO(a.getPatientid(),a.getPatientfirstname(),a.getPatientlastname(),
					a.getPatientemail(),a.getPatientmobile(),a.getPatientpassword());
			patientDTOList.add(patientDTO);
		}
		
		return patientDTOList;
	}


	@Override
	public boolean deletePatient(int id) {
		if(patientRepo.existsById(id))
		{
			patientRepo.deleteById(id);
		}
		else
		{
			System.out.println("Patient ID is Not found..");
		}
			return true;
		}

	@Override
	public Patient updatePatient(Patient patient, int id) {
		Patient existingPatient=patientRepo.findById(id).orElseThrow(()->new ResourceNotFound("Patient","Id","id"));
		existingPatient.setPatientfirstname(patient.getPatientfirstname());
		existingPatient.setPatientlastname(patient.getPatientlastname());
		existingPatient.setPatientemail(patient.getPatientemail());
		existingPatient.setPatientmobile(patient.getPatientmobile());
		existingPatient.setPatientpassword(patient.getPatientpassword());
		
		patientRepo.save(existingPatient);
		
		return existingPatient;
	}

	@Override
	public Patient getPatientById(int id) {
		// TODO Auto-generated method stub
		return patientRepo.findById(id).orElseThrow(()-> new ResourceNotFound("patient","Id","id"));
	}
}


