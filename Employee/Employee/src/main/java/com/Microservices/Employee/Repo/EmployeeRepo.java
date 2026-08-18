package com.Microservices.Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Microservices.Employee.Entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
