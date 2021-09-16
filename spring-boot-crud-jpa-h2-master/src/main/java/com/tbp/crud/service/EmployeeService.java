package com.tbp.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbp.crud.dao.EmployeeRepository;
import com.tbp.crud.entity.Employee;

public interface EmployeeService{
	 
	 public Employee addEmployee(Employee emp);
	 
	 public List<Employee> addEmployees(List<Employee> employee);
	 
	 public Employee getEmployeeById(int id);
	 
	 public List<Employee> getEmployees();
	 
	 public Employee updateEmployee(Employee employee);
	 
	 public String deleteEmployeeById(int id);

	Employee getEmployeeByEmailAndPassword(String email, String password);

	Employee findByEmpId(int id);
	 
	 
}
