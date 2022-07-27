package com.ashfak.rentcar.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashfak.rentcar.demoapplication.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	

}
