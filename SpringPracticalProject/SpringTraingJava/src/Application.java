import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashfak.training.salesmanager.config.ApplicationConfiguration;
import com.ashfak.training.salesmanager.model.Employee;
import com.ashfak.training.salesmanager.service.EmployeeService;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			
			System.out.println(employee.getEmployeeName() + "at" + employee.getEmployeeLocation());
		}

	}

}
