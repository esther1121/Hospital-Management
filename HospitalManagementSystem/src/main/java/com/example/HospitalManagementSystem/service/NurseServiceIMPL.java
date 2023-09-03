package com.example.HospitalManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalManagementSystem.DTO.NurseDTO;
import com.example.HospitalManagementSystem.DTO.NurseSaveDTO;
import com.example.HospitalManagementSystem.model.Nurse;
import com.example.HospitalManagementSystem.repository.NurseRepo;
@Service
public class NurseServiceIMPL implements NurseService {
	
	@Autowired
	private NurseRepo nurseRepo;


	@Override
	public String addNurse(NurseSaveDTO nurseSaveDTO) {
		 Nurse  nurse=new  Nurse(0,  nurseSaveDTO.getNursefirstname(),nurseSaveDTO.getNurselastname(),nurseSaveDTO.getNurseemail(),nurseSaveDTO.getNursemobile(),nurseSaveDTO.getNursepassword());
		 nurseRepo.save(nurse);
		return nurse.getNursefirstname();
	}

	@Override
	public List<NurseDTO> getAllNurse() {
		List<Nurse>getNurse=nurseRepo.findAll();
		List<NurseDTO>nurseDTOList=new ArrayList<>();
		for(Nurse a:getNurse)
		{
			NurseDTO nurseDTO=new NurseDTO(a.getNurseid(),a.getNursefirstname(),a.getNurselastname(),
					a.getNurseemail(),a.getNursemobile(),a.getNursepassword());
			nurseDTOList.add(nurseDTO);
		}
		
		return nurseDTOList;
	}

	

	@Override
	public boolean deleteNurse(int id) {
		if(nurseRepo.existsById(id))
		{
			nurseRepo.deleteById(id);
		}
		else
		{
			System.out.println("Nurse ID is Not found..");
		}
			return true;
		}

	@Override
	public Nurse updateNurse(Nurse nurse, int id) {
	
		Nurse existingNurse=nurseRepo.findById(id).orElseThrow(()->new ResourceNotFound("Patient","Id","id"));
		existingNurse.setNursefirstname(nurse.getNursefirstname());
		existingNurse.setNurselastname(nurse.getNurselastname());
		existingNurse.setNurseemail(nurse.getNurseemail());
		existingNurse.setNursemobile(nurse.getNursemobile());
		existingNurse.setNursepassword(nurse.getNursepassword());
		
		nurseRepo.save(existingNurse);
		
		return existingNurse;
	}

	@Override
	public Nurse getNurseById(int id) {
		// TODO Auto-generated method stub
		return nurseRepo.findById(id).orElseThrow(()-> new ResourceNotFound("Nurse","Id","id"));
	}
}
	
	
