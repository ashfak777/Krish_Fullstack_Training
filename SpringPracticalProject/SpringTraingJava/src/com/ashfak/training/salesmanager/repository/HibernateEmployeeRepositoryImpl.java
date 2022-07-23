package com.ashfak.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ashfak.training.salesmanager.model.Employee;

@Repository("ashfak")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public List<Employee> getAllEmployees(){
		
List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Ashfak");
		employee.setEmployeeLocation("Beruwala");
		employees.add(employee);
		return employees;
		
		
	}
}
