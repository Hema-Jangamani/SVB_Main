package com.brillio.repository;

import org.springframework.data.repository.CrudRepository;

import com.brillio.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
