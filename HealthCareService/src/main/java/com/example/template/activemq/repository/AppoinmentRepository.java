package com.example.template.activemq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.template.activemq.Model.Appoinment;

public interface AppoinmentRepository extends JpaRepository<Appoinment, String> {

}
