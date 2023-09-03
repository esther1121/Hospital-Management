package com.example.HospitalManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.HospitalManagementSystem.model.Doctor;


@EnableJpaRepositories
@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Integer>{

	

}
