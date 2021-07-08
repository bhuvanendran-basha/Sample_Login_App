package com.example.template.activemq.repository;

import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.security.access.method.P;

import com.example.template.activemq.Model.Patient;

import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String>{
	

}
