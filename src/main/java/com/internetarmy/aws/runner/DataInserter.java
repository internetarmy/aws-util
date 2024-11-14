package com.internetarmy.aws.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.internetarmy.aws.model.Employee;
import com.internetarmy.aws.service.impl.EmployeeService;

@Component
public class DataInserter implements CommandLineRunner{

	@Autowired
	EmployeeService empService;
	
	@Override
	public void run(String... args) throws Exception {
		empService.saveEmployee(Employee.builder().employeeName("Siva").department("DEV").build());
		empService.saveEmployee(Employee.builder().employeeName("Sai").department("DevOps").build());
		empService.saveEmployee(Employee.builder().employeeName("Maheedar").department("TESTER").build());
		empService.saveEmployee(Employee.builder().employeeName("Savio").department("HR").build());
		empService.saveEmployee(Employee.builder().employeeName("Sahil").department("LEAD").build());
		empService.saveEmployee(Employee.builder().employeeName("Pradeep").department("MANAGER").build());
	}

}
