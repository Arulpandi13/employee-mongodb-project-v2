package com.example.TechLambdas.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.TechLambdas.Entity.Employee;

public interface EmployeeRepository extends MongoRepository <Employee , String>{

}
