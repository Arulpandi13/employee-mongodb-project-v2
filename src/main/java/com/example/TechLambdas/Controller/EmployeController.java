package com.example.TechLambdas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TechLambdas.Entity.Employee;
import com.example.TechLambdas.Service.EmployeeService;

@RestController
@RequestMapping("/api/employees")

public class EmployeController {
	

	    @Autowired
	    private EmployeeService employeeService;

	    @PostMapping
	    public Employee addEmployee(@RequestBody Employee employee) {
	        return employeeService.addEmployee(employee);
	    }

	    @GetMapping
	    public List<Employee> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }
	    
	    @PostMapping("/bulk")
	    public List<Employee> addMultipleEmployees(@RequestBody List<Employee> employees) {
	        return employeeService.addMultipleEmployees(employees);
	    }

	    @GetMapping("/{id}")
	    public Employee getEmployeeById(@PathVariable String id) {
	        return employeeService.getEmployeeById(id);
	    }

	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
	        return employeeService.updateEmployee(id, employee);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteEmployee(@PathVariable String id) {
	        employeeService.deleteEmployee(id);
	        return "Employee deleted successfully!";
	    }

	
	
}
