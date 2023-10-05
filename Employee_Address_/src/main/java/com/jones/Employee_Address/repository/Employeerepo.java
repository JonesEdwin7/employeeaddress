package com.jones.Employee_Address.repository;

import com.jones.Employee_Address.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends JpaRepository<Employee,Long> {
}
