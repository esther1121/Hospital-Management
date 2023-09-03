package com.example.HospitalManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalManagementSystem.DTO.AdminDTO;
import com.example.HospitalManagementSystem.DTO.AppointmentDTO;
import com.example.HospitalManagementSystem.service.AdminService;
import com.example.HospitalManagementSystem.service.AppointmentService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/appointment")
public class AppointmentController {
	
	
	@Autowired
    private AppointmentService appointmentService;
    @PostMapping(path = "/save")
    public String saveAppointment(@RequestBody AppointmentDTO appointmentDTO)
    {
        String id = appointmentService.addAppointment(appointmentDTO);
        return id;
    }

}
