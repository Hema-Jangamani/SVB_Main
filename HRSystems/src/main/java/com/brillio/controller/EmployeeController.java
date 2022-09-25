package com.brillio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.model.Employee;
import com.brillio.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		 return empService.add(emp);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getEmployees(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("/get/{id}")
	public Employee getOneEmployee(@PathVariable int id) {
		return empService.getEmployee(id);
	}
	
	@PutMapping("/update/{id}")
	public Object updateEmp(@RequestBody Employee emp, @PathVariable int id) {
		Employee emps = empService.update(emp);
		if(emp.getId()==id) {
			return emp;
		}
		return "No user found";
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		empService.deleteEmployee(id);
	}
}
