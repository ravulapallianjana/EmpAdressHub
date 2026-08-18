package com.Microservices.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices.Employee.Entity.Employee;
import com.Microservices.Employee.Response.EmployeeResponse;
import com.Microservices.Employee.Service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService ;
	
	@GetMapping("emplist")
	List<Employee> getEmployees(){
		return employeeService.getemployeeList();
	}

	@GetMapping("emp/{id}")
	EmployeeResponse getEmployee(@PathVariable Integer id) {
		return employeeService.getEmployeeById(id);
	}
}
