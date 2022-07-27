package com.ashfak.rentcar.demoapplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashfak.rentcar.demoapplication.model.Student;
import com.ashfak.rentcar.demoapplication.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
    StudentRepository studentRepository;


	public Student save(Student student) {
		// TODO Auto-generated method stub
		return  studentRepository.save(student);
	}


	public Student fetchStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student>  student= studentRepository.findById(id);
		
		if(student.isPresent()){
	        return student.get();
	    }
	    return null;
	}
}
