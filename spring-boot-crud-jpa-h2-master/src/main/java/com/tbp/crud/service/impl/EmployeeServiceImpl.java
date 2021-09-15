package com.tbp.crud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbp.crud.dao.EmployeeRepository;
import com.tbp.crud.entity.Employee;
import com.tbp.crud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	 @Autowired 
	 private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee emp) {
		return employeeRepository.save(emp) ;
	}

	@Override
	public List<Employee> addEmployees(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		return emp.get();
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> emp = employeeRepository.findById(employee.getId());
		if(emp.isPresent()) {
			employeeRepository.save(employee);
		}
		else {
			System.out.println("Employee not found");
		}
		return emp.get();
	}

	@Override
	public String deleteEmployeeById(int id) {
		 employeeRepository.deleteById(id);
	     return "Employee sucessfully deleted";
	}

	@Override
	public Employee getEmployeeByEmailAndPassword(String email, String password) {
		Optional<Employee> emp = employeeRepository.findByEmailAndPassword(email, password);
		if(!emp.get().getEmail().equals(email) && !emp.get().getPassword().equals(password)) {
		  System.out.println("Incorrect email or password");	
		}else {
			return emp.get();
		}
		return null;
		
		
	}

}
