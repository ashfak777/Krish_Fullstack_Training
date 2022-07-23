package com.ashfak.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashfak.training.salesmanager.model.Employee;
import com.ashfak.training.salesmanager.repository.EmployeeRepository;
import com.ashfak.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

//	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		
		System.out.println("overloaded cosutructor executed");
		this.employeeRepository = employeeRepository;
		
	}
	
	public EmployeeServiceImpl() {
		System.out.println("default cosutructor executed");
		
	}
	
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter executed");
			this.employeeRepository = employeeRepository;
			}
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
