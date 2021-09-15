package com.tbp.crud.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbp.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


	public Optional<Employee> findByEmailAndPassword(String email, String password);

}
