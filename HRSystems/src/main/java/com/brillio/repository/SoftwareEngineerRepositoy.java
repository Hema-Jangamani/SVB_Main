package com.brillio.repository;

import org.springframework.data.repository.CrudRepository;

import com.brillio.model.Employee;
import com.brillio.model.SoftwareEngineer;

public interface SoftwareEngineerRepositoy extends CrudRepository<Employee, Integer>{

}
