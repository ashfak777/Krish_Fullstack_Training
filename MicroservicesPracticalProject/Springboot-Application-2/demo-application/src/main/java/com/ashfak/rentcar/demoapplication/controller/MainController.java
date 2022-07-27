package com.ashfak.rentcar.demoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashfak.rentcar.demoapplication.model.Student;
import com.ashfak.rentcar.demoapplication.service.StudentService;

@RestController
public class MainController {
	
	 @Autowired
	  StudentService studentService;
	
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting() {
        return "Hello SpringBoot from GET";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2() {
        return "Hello SpringBoot from POST";
    }
    
    @RequestMapping(value = "/student", method = RequestMethod.POST )
    public Student save(@RequestBody Student student){

        return studentService.save(student);

    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id) {

        Student student= studentService.fetchStudentById(id);

        if(student == null) {
           return ResponseEntity.notFound().build(); //dont have a student
        }else {
           return ResponseEntity.ok().body(student); //have a student
        }
    }


}
