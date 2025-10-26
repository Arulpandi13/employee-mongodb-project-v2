package com.example.TechLambdas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TechLambdas.Entity.Employee;
import com.example.TechLambdas.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpli implements EmployeeService {
	
	
	 @Autowired
	    private EmployeeRepository employeeRepository;

	    @Override
	    public Employee addEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    @Override
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	    
	    @Override
	    public List<Employee> addMultipleEmployees(List<Employee> employees) {
	        return employeeRepository.saveAll(employees);
	        
	    }

	    @Override
	    public Employee getEmployeeById(String id) {
	        return employeeRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Employee updateEmployee(String id, Employee employee) {
	        Employee existing = employeeRepository.findById(id).orElse(null);
	        if (existing != null) {
	            existing.setEmployeeId(employee.getEmployeeId());
	            existing.setEmployeeName(employee.getEmployeeName());
	            existing.setGender(employee.getGender());
	            existing.setDesignation(employee.getDesignation());
	            existing.setEmailId(employee.getEmailId());
	            existing.setMobileNumber(employee.getMobileNumber());
	            existing.setDateOfBirth(employee.getDateOfBirth());
	            existing.setCity(employee.getCity());
	            existing.setAddress(employee.getAddress());
	            return employeeRepository.save(existing);
	        }
	        return null;
	    }

	    @Override
	    public void deleteEmployee(String id) {
	        employeeRepository.deleteById(id);
	    }
	

}
