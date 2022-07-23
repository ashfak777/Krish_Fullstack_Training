package com.ashfak.training.salesmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashfak.training.salesmanager.model.Employee;

@Service("employeeService")
public interface EmployeeService {

	List<Employee> getAllEmployees();

}