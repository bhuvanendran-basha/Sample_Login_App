package com.example.template.activemq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.template.activemq.Model.ApplicationUser;

public interface ApplicationUserRespository extends JpaRepository<ApplicationUser, String>{
	
	

}
