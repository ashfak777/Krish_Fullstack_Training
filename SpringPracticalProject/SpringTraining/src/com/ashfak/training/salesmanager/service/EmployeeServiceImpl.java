package com.ashfak.training.salesmanager.service;

import java.util.List;

import com.ashfak.training.salesmanager.model.Employee;
import com.ashfak.training.salesmanager.repository.EmployeeRepository;
import com.ashfak.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
			this.employeeRepository = employeeRepository;
			}
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
