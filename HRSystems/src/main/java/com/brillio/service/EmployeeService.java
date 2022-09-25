package com.brillio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Employee;
import com.brillio.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public Employee add(Employee emp) {
		return empRepository.save(emp);
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		empRepository.findAll().forEach(list::add);
		return list;
	}
	
	public Employee getEmployee(int id) {
		return empRepository.findById(id).get();
	}
	
	public Employee update(Employee emp) {
		Employee emps = empRepository.save(emp);
		if(emps != null) {
			return emps;
		}
		return null;
	}
	
	public void deleteEmployee(int id) {
		empRepository.deleteById(id);
	}

}
