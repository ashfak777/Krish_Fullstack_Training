package com.ashfak.rentcar.demoapplication.service;

import com.ashfak.rentcar.demoapplication.model.Student;

public interface StudentService {
	
	   Student save(Student student);

	    Student fetchStudentById(int id);

}
