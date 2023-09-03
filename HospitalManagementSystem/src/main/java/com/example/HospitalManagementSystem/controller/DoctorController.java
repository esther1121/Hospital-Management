package com.example.HospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalManagementSystem.DTO.DoctorDTO;
import com.example.HospitalManagementSystem.DTO.DoctorSaveDTO;
import com.example.HospitalManagementSystem.DTO.DoctorUpdateDTO;
import com.example.HospitalManagementSystem.DTO.DctorLoginDTO;
import com.example.HospitalManagementSystem.model.Doctor;
import com.example.HospitalManagementSystem.model.Nurse;
import com.example.HospitalManagementSystem.service.DoctorService;






@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/v1/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService ;
	
	@PostMapping 
	public String saveDoctor(@RequestBody DoctorSaveDTO doctorSaveDTO )
	{
		String id=doctorService.addDoctor(doctorSaveDTO);
		return id;
	}
	
	@GetMapping
	public List<DoctorDTO>getAllDoctors()
	{
		List<DoctorDTO>allDoctors=doctorService.getAllDoctors();
		return allDoctors;
	}
	

	@PutMapping("{id}")
	public ResponseEntity<Doctor>updateDoctor(@PathVariable("id")int id,@RequestBody Doctor doctor)
	{
		return new ResponseEntity<Doctor>(doctorService.updateDoctor(doctor, id),HttpStatus.OK);
	}
	
	
	
	
	@DeleteMapping(path="{id}")
	public String deleteDoctor(@PathVariable(value="id")int id)
	{
		boolean deleteDoctor=doctorService.deleteDoctor(id);
		return "deleted";
	}
	
	
	
	
	@GetMapping("{id}")
	public ResponseEntity<Doctor>getDoctorById(@PathVariable("id")int id)
	{
		return new  ResponseEntity<Doctor>(doctorService.getDoctorById(id),HttpStatus.OK);
	}

}
