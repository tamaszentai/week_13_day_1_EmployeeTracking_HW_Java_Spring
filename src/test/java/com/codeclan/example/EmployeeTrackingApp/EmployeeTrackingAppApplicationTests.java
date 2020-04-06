package com.codeclan.example.EmployeeTrackingApp;

import com.codeclan.example.EmployeeTrackingApp.models.Employee;
import com.codeclan.example.EmployeeTrackingApp.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackingAppApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee michaelEnglish = new Employee("Michael English", 23, 12345, "michaelenglish@gmail.com");
		employeeRepository.save(michaelEnglish);
		Employee lauraAlexander = new Employee("Laura Alexander", 30, 54321, "lauraalexander@gmail.com");
		employeeRepository.save(lauraAlexander);
	}

}
