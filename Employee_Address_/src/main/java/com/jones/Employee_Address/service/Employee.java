package com.jones.Employee_Address.service;

import com.jones.Employee_Address.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee {

    @Autowired
    Employeerepo employeerepo;

    // Add Employee
    public String addEmployee(com.jones.Employee_Address.model.Employee employee) {
        employeerepo.save(employee);
        return "Employee added";
    }

    // Get Employee By I'd
    public com.jones.Employee_Address.model.Employee getEmployeeById(Long employeeId) {
        return employeerepo.findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
    }

    // Get All Employees
    public List<com.jones.Employee_Address.model.Employee> getAllEmployee() {
        return employeerepo.findAll();
    }

    // Update Employee by I'd
    public String updateEmployee(Long employeeId, com.jones.Employee_Address.model.Employee employee) {
        com.jones.Employee_Address.model.Employee existingEmployee = employeerepo.findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setAddress(employee.getAddress());

        employeerepo.save(existingEmployee);

        return "Employee updated";
    }

    // Delete Employee by I'd
    public String deleteEmployee(Long employeeId) {
        employeerepo.deleteById(employeeId);
        return "Employee deleted";
    }
}
