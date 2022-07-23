package com.ashfak.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ashfak.training.salesmanager.repository.EmployeeRepository;
import com.ashfak.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.ashfak.training.salesmanager.service.EmployeeService;
import com.ashfak.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.ashfak")
public class ApplicationConfiguration {

	@Bean(name = "employeeService")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
//		employeeServiceImpl.setEmployeeRepository(getEmployeeRepository());
		
		return new EmployeeServiceImpl();
	}
	
//	@Bean(name = "employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}
	
}
