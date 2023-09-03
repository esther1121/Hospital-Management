package com.example.HospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.HospitalManagementSystem.model.Patient;

@EnableJpaRepositories
@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{

}
