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

import com.example.HospitalManagementSystem.DTO.NurseDTO;
import com.example.HospitalManagementSystem.DTO.NurseSaveDTO;
import com.example.HospitalManagementSystem.DTO.updateNurse;
import com.example.HospitalManagementSystem.model.Doctor;
import com.example.HospitalManagementSystem.model.Nurse;
import com.example.HospitalManagementSystem.service.NurseService;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/v1/Nurse")
public class NurseContoller {
	
	
	@Autowired
	private NurseService nurseService ;
	
	@PostMapping
	public String saveNurse(@RequestBody NurseSaveDTO nurserSaveDTO )
	{
		String id=nurseService.addNurse(nurserSaveDTO);
		return id;
	}
	
	@GetMapping
	public List<NurseDTO>getAllNurse()
	{
		List<NurseDTO>allNurse=nurseService.getAllNurse();
		return allNurse;
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Nurse>updateNurse(@PathVariable("id")int id,@RequestBody Nurse nurse)
	{
		return new ResponseEntity<Nurse>(nurseService.updateNurse(nurse, id),HttpStatus.OK);
	}
	
	@DeleteMapping(path="{id}")
	public String deleteNurse(@PathVariable(value="id")int id)
	{
		boolean deleteNurse=nurseService.deleteNurse(id);
		return "deleted";
	}


	@GetMapping("{id}")
	public ResponseEntity<Nurse>getNurseById(@PathVariable("id")int id)
	{
		return new  ResponseEntity<Nurse>(nurseService.getNurseById(id),HttpStatus.OK);
	}

}
