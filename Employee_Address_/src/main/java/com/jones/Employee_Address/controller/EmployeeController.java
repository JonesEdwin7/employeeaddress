package com.jones.Employee_Address.controller;

import com.jones.Employee_Address.service.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    Employee employee;

    @PostMapping("employee")
    public String addEmployee(@RequestBody com.jones.Employee_Address.model.Employee employee){
        return this.employee.addEmployee(employee);
    }

    @GetMapping("employee/{employeeId}")
    public com.jones.Employee_Address.model.Employee getEmployeeById(@PathVariable Long employeeId){
        return employee.getEmployeeById(employeeId);
    }

    @GetMapping("employee")
    public List<com.jones.Employee_Address.model.Employee> getAllEmployee(){
        return employee.getAllEmployee();
    }

    @PutMapping("employee/{employeeId}")
    public String updateEmployee(@PathVariable Long employeeId,@RequestBody com.jones.Employee_Address.model.Employee employee){
        return this.employee.updateEmployee(employeeId,employee);
    }

    @DeleteMapping("employee/{employeeId}")
    public String deleteEmployee(@PathVariable Long employeeId){
        return employee.deleteEmployee(employeeId);
    }
}
