package com.example.HospitalManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalManagementSystem.DTO.AppointmentDTO;

import com.example.HospitalManagementSystem.model.Appointment;

import com.example.HospitalManagementSystem.repository.AppointmentRepo;

@Service
public class AppointmentIMPL implements AppointmentService{
@Autowired
private AppointmentRepo appointmentRepo;	
	
	
	
	@Override
	public String addAppointment(AppointmentDTO appointmentDTO) {
	Appointment appointment = new Appointment(
			appointmentDTO.getAppointmentid(),
			appointmentDTO.getFirstname(),
			appointmentDTO.getLastname(),
			appointmentDTO.getAppointmentdate(),
			appointmentDTO.getReson()
    );
	appointmentRepo.save(appointment);
    return appointment.getFirstname();
	}
	
	
	
	
	
}
