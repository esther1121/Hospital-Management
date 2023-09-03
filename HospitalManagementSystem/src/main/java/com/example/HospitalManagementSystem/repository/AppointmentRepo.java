package com.example.HospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.HospitalManagementSystem.model.Appointment;

@EnableJpaRepositories
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Integer>{

}
