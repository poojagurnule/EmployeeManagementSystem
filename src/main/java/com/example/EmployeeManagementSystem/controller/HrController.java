package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.models.Employee;
import com.example.EmployeeManagementSystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("hr")

public class HrController {


        @Autowired
        EmployeeService employeeService;

        @PostMapping("addEmployee")
        public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
            return employeeService.createEmployee(employee);
        }

        @GetMapping("getAllEmployee")
        public Iterable getAllEmployee(){
            return employeeService.getAllEmployee();
        }

        @PutMapping("updateEmployee/{id}")
        public ResponseEntity<String> updatefullInformation(@PathVariable Long id,@RequestBody Employee employee){
            Optional<Employee> updatedEmployee = employeeService.updateEmployeeByHR(id, employee);

            if (updatedEmployee != null) {
                return ResponseEntity.ok("Employee updated successfully");
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
            employeeService.deleteEmployee(id);
            return ResponseEntity.ok().build();
        }


    }

