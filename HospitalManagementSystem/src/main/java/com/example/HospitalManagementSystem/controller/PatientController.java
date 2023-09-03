package com.example.HospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalManagementSystem.DTO.PatientDTO;
import com.example.HospitalManagementSystem.DTO.PatientSaveDTO;
import com.example.HospitalManagementSystem.DTO.PatientUpdateDTO;
import com.example.HospitalManagementSystem.model.Doctor;
import com.example.HospitalManagementSystem.model.Nurse;
import com.example.HospitalManagementSystem.model.Patient;
import com.example.HospitalManagementSystem.service.PatientService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/v1/Patient")
public class PatientController {

	
	
	@Autowired
	private PatientService patientService ;
	
	@PostMapping
	public String savePatient(@RequestBody PatientSaveDTO patientSaveDTO )
	{
		String id=patientService.addPatient(patientSaveDTO);
		return id;
	}
	
	@GetMapping
	public List<PatientDTO>getAllPatient()
	{
		List<PatientDTO>allNurse=patientService.getAllPatients();
		return allNurse;
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Patient>updatePatient(@PathVariable("id")int id,@RequestBody Patient patient)
	{
		return new ResponseEntity<Patient>(patientService.updatePatient(patient, id),HttpStatus.OK);
	}
	
	@DeleteMapping(path="{id}")
	public String deletePatient(@PathVariable(value="id")int id)
	{
		boolean deletePatient=patientService.deletePatient(id);
		return "deleted";
	}

	
	@GetMapping("{id}")
	public ResponseEntity<Patient>getPatientById(@PathVariable("id")int id)
	{
		return new  ResponseEntity<Patient>(patientService.getPatientById(id),HttpStatus.OK);
	}
}
