package com.tbp.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.crud.entity.Employee;
import com.tbp.crud.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee employee) {
	return employeeService.addEmployee(employee);
    }
	
	@PostMapping("/addEmps")
	public List<Employee> addEmployees(@RequestBody List<Employee> employees){
		return employeeService.addEmployees(employees);
	}
	
	@GetMapping("/getEmp/{id}")
	 public Employee getEmployeeById(@PathVariable int id) {
		 return employeeService.getEmployeeById(id);
	 }
	
	@GetMapping("/getAllEmps")
	public List<Employee> getAllEmployees(){
		return employeeService.getEmployees();
	}
	 
	@PutMapping("/updateEmp")
	 public Employee updateEmployee(@RequestBody Employee employee){
		 return employeeService.updateEmployee(employee);
	 }
	 
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmpById(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}
	
	@GetMapping("/getEmpByEmail/{email}/{password}")
	public Employee getEmployeeByEmail(@PathVariable String email, @PathVariable String password) {
		return employeeService.getEmployeeByEmailAndPassword(email, password);
		 
	}
	 
	 
	 
}
