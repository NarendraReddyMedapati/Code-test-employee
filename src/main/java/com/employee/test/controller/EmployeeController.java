package com.employee.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.test.model.Employee;
import com.employee.test.service.EmployeeService;



@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//Create Ticket
	
		@PostMapping(value="/create") //@PostMapping==> @Post + @RequestMapping
		public Employee createTicket(@RequestBody Employee employeeInput) {
			
			return employeeService.createTicket(employeeInput);
			
		}
		
		//Retrieve All employee
		@GetMapping(value="/all") //http://localhost:8080/employee/all
		public Iterable<Employee> getAllTickets(){
			return employeeService.getAllTickets();
		}
		
		
		@GetMapping(value="/{employeeId}")
		public Employee getTicket( @PathVariable("employeeId") Integer employeeId) {
			return employeeService.getTicket(employeeId);
		}
		
		//Update Ticket
		
		@PutMapping(value="/{employeeId}/{newEmail}")
		public Employee updateTicket(@PathVariable("employeeId") Integer employeeId,
								   @PathVariable("newEmail") String newEmail) {
			
			return employeeService.updateTicket(employeeId, newEmail);
			
		}
		
		
		//Delete Ticket
		@DeleteMapping(value="/{employeeId}")
		public void deleteTicket(@PathVariable("employeeId") Integer employeeId) {
			employeeService.deleteTicket(employeeId);
		}
	}
