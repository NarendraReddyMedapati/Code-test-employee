package com.employee.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.test.dao.EmployeeDao;
import com.employee.test.model.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	//Create Ticket
	
	public Employee createTicket(Employee inputObj) {
		return employeeDao.save(inputObj);
		
		
	}
	
	//Retrieve All Tickets
		public Iterable<Employee> getAllTickets(){
			
			return employeeDao.findAll();
			
		}
		
		
		
		//Retrieve Single Ticket
		public Employee getTicket(Integer employeeId) {
			return employeeDao.findById(employeeId)  
							.orElse(new Employee());
					
		}
		
		
		
		//Update Ticket
		
		public Employee updateTicket(Integer employeeId,String newEmail) {
			
			Employee dbTicketObj=getTicket(employeeId);
			dbTicketObj.setEmail(newEmail);
			return employeeDao.save(dbTicketObj); 
			
		}
		
		
		
		//Delete Ticket
		public void deleteTicket(Integer employeeId) {
			employeeDao.deleteById(employeeId);
		}


}
