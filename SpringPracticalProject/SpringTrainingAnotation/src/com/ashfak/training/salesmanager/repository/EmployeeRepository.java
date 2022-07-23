package com.ashfak.training.salesmanager.repository;

import java.util.List;

import com.ashfak.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}