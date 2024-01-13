package com.internetarmy.aws.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internetarmy.aws.model.Employee;
import com.internetarmy.aws.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeRepo empRepo;
	
	public Employee saveEmployee(Employee emp) {
		return empRepo.saveEmployee(emp);
	}
	
	public List<Employee> findEmployee(Integer id, String name){
		return empRepo.findAllEmployees(id, name);
	}
}
