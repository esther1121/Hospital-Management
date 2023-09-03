package com.example.HospitalManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.HospitalManagementSystem.model.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

	Optional<User> findOneByEmailAndPassword(String email, String password);
	User findByEmail(String email);
	
	
}
