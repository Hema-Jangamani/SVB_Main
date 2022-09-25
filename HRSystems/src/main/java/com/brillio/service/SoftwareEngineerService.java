package com.brillio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Employee;
import com.brillio.model.SoftwareEngineer;
import com.brillio.repository.EmployeeRepository;
import com.brillio.repository.SoftwareEngineerRepositoy;

@Service
public class SoftwareEngineerService {


	@Autowired
	SoftwareEngineerRepositoy softRepository;
	
	public SoftwareEngineer add(SoftwareEngineer emp) {
		return softRepository.save(emp);
	}
	
	public List<SoftwareEngineer> getAllEmployees() {
		List<SoftwareEngineer> list = new ArrayList<>();
		softRepository.findAll();
		return list;
	}
	
	public SoftwareEngineer getEmployee(int id) {
		return (SoftwareEngineer) softRepository.findById(id).get();
	}
	
	public SoftwareEngineer update(SoftwareEngineer emp) {
		SoftwareEngineer emps = softRepository.save(emp);
		if(emps != null) {
			return emps;
		}
		return null;
	}
	
	public void deleteEmployee(int id) {
		softRepository.deleteById(id);
	}

}
