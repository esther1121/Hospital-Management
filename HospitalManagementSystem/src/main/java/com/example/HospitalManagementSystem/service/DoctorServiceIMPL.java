package com.example.HospitalManagementSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalManagementSystem.DTO.DctorLoginDTO;
import com.example.HospitalManagementSystem.DTO.DoctorDTO;
import com.example.HospitalManagementSystem.DTO.DoctorSaveDTO;
import com.example.HospitalManagementSystem.DTO.DoctorUpdateDTO;
import com.example.HospitalManagementSystem.model.Doctor;
import com.example.HospitalManagementSystem.model.Nurse;
import com.example.HospitalManagementSystem.repository.DoctorRepo;








@Service
public class DoctorServiceIMPL implements DoctorService {
	@Autowired
	private DoctorRepo doctorRepo;
	
	
	@Override
	public String addDoctor(DoctorSaveDTO doctorSaveDTO) {
		Doctor doctor=new Doctor(0, doctorSaveDTO.getDoctorfirstname(),doctorSaveDTO.getDoctorlastname(),doctorSaveDTO.getDoctoremail(),doctorSaveDTO.getDoctormobile(),doctorSaveDTO.getDoctorpassword());
		doctorRepo.save(doctor);
		return doctor.getDoctorfirstname();
	}

	@Override
	public List<DoctorDTO> getAllDoctors() {
		List<Doctor>getDoctor=doctorRepo.findAll();
		List<DoctorDTO>DoctorDTOList=new ArrayList<>();
		for(Doctor a:getDoctor)
		{
			DoctorDTO doctorDTO=new DoctorDTO(a.getDoctorid(),a.getDoctorfirstname(),a.getDoctorlastname(),
					a.getDoctoremail(),a.getDoctormobile(),a.getDoctorpassword());
			DoctorDTOList.add(doctorDTO);
		}
		
		return DoctorDTOList;
	}

	@Override
	public boolean deleteDoctor(int id) {
		
		if(doctorRepo.existsById(id))
		{
			doctorRepo.deleteById(id);
		}
		else
		{
			System.out.println("Doctor ID is Not found..");
		}
			return true;
		}

	@Override
	public Doctor updateDoctor(Doctor doctor, int id) {
		Doctor existingDoctor=doctorRepo.findById(id).orElseThrow(()->new ResourceNotFound("Patient","Id","id"));
		existingDoctor.setDoctorfirstname(doctor.getDoctorfirstname());
		existingDoctor.setDoctorlastname(doctor.getDoctorlastname());
		existingDoctor.setDoctoremail(doctor.getDoctoremail());
		existingDoctor.setDoctormobile(doctor.getDoctormobile());
		existingDoctor.setDoctorpassword(doctor.getDoctorpassword());
		
		doctorRepo.save(existingDoctor);
		
		return existingDoctor;
	}

	

	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		return doctorRepo.findById(id).orElseThrow(()-> new ResourceNotFound("Doctor","Id","id")); 
	}

}
