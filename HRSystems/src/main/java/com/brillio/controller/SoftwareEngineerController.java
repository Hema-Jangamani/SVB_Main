package com.brillio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.model.Employee;
import com.brillio.model.SoftwareEngineer;
import com.brillio.service.EmployeeService;
import com.brillio.service.SoftwareEngineerService;

@RestController
@RequestMapping("/soft")
public class SoftwareEngineerController {
	
	@Autowired
	SoftwareEngineerService softService;
	
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody SoftwareEngineer emp)
	{
		 return softService.add(emp);
	}
	
	@GetMapping("/getAll")
	public List<SoftwareEngineer> getEmployees(){
		return softService.getAllEmployees();
	}
	
	@GetMapping("/get/{id}")
	public SoftwareEngineer getOneEmployee(@PathVariable int id) {
		return softService.getEmployee(id);
	}
	
	@PutMapping("/update/{id}")
	public Object updateEmp(@RequestBody SoftwareEngineer emp, @PathVariable int id) {
		Employee emps = softService.update(emp);
		if(emp.getId()==id) {
			return emp;
		}
		return "No user found";
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		softService.deleteEmployee(id);
	}

}
