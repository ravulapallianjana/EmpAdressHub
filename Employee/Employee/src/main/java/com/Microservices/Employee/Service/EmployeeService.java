package com.Microservices.Employee.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Microservices.Employee.Entity.Employee;
import com.Microservices.Employee.Repo.EmployeeRepo;
import com.Microservices.Employee.Response.AdressResponse;
import com.Microservices.Employee.Response.EmployeeResponse;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	ModelMapper modelMapper;
	@Autowired
	RestTemplate restTemplate;

	public List<Employee> getemployeeList() {
		return employeeRepo.findAll();

	}

//	public Employee getEmployeeById(Integer id) {
//		return employeeRepo.findById(id).orElseThrow();
//		
//	}
	public EmployeeResponse getEmployeeById(Integer id) {
		Employee emp = employeeRepo.findById(id).orElseThrow();
		EmployeeResponse employeeResponse = modelMapper.map(emp, EmployeeResponse.class);
		AdressResponse adressresponse = restTemplate.getForObject("http://localhost:8899/api/v1/address/{id}",
				AdressResponse.class, id);
		employeeResponse.setAdressresponse(adressresponse);
		return employeeResponse;

	}

}
