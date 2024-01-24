package com.employee.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.test.model.Employee;


@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
