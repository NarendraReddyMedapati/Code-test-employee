package com.employee.test.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_employee")
public class Employee {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
	private Integer employeeId;

	@Column(name = "first_name")  
	private String firstName;
	
	@Column(name = "last_name") 
	private String lastName;
	
	private String email;
	
	@Column(name="phone_Number")
	private Integer phoneNumber;
	
	
	@Column(name="DOJ")
	private Date DOJ;
	
	
	@Column(name="salary")
	private Integer salary;
	
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Date getDOJ() {
		return DOJ;
	}


	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public Employee() {}
	
	public Employee(String firstName, String lastName, String email, Integer phoneNumber, Date DOJ, Integer salary) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.DOJ = DOJ;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", DOJ=" + DOJ + ", salary=" + salary + "]";
	}
	
}
