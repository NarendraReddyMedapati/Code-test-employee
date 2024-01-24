package com.employee.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.test.model.Employee;
import com.employee.test.service.EmployeeService;



@SpringBootApplication
public class EmployeeApplication {
	
	@Autowired
	private EmployeeService employeeService;


	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	
		
	}

}
