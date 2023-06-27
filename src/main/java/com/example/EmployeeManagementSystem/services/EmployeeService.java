package com.example.EmployeeManagementSystem.services;

import com.example.EmployeeManagementSystem.models.Employee;
import com.example.EmployeeManagementSystem.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public ResponseEntity<String> createEmployee(Employee employee) {
        employee.setSalary(-1);
        employee.setJobRole("");
        employeeRepo.save(employee);
        return null;
    }


    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public ResponseEntity<String> updateEmployee(long id, Employee employee) {
        employee.setSalary(-1);
        employee.setJobRole("");
        Employee details=employeeRepo.findById(id).get();
        if(details==null){
            return new ResponseEntity<>("id does not exist", HttpStatus.NOT_FOUND);
        }
        details.setFirstName(employee.getFirstName());
        details.setLastName(employee.getLastName());
        details.setPhoneNumber(employee.getPhoneNumber());
        details.setEmail(employee.getEmail());
        employeeRepo.save(employee);
        return new ResponseEntity<>("successfully updated", HttpStatus.OK);
    }


    public Optional<Employee> updateEmployeeByHR(Long id, Employee employeeDetails) {
        Optional<Employee> employeeOptional = getEmployeeById(id);

        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setFirstName(employeeDetails.getFirstName());
            employee.setLastName(employeeDetails.getLastName());
            employee.setJobRole(employeeDetails.getJobRole());
            employee.setSalary(employeeDetails.getSalary());

            return Optional.of(employeeRepo.save(employee));
        } else {
            return Optional.empty();
        }
    }

    private Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }


    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}