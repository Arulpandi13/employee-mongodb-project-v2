package com.example.TechLambdas.Service;

import java.util.List;

import com.example.TechLambdas.Entity.Employee;

public interface EmployeeService {
	
	 Employee addEmployee(Employee employee);
	 
	    List<Employee> getAllEmployees();
	    
	    List<Employee> addMultipleEmployees(List<Employee> employees);
	    
	    Employee getEmployeeById(String id);
	    
	    Employee updateEmployee(String id, Employee employee);
	    
	    void deleteEmployee(String id);

}
