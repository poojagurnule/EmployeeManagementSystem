package com.example.EmployeeManagementSystem.repo;

import com.example.EmployeeManagementSystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee, Long>{

}
