package com.jones.Employee_Address.repository;

import com.jones.Employee_Address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Addressrepo extends JpaRepository<Address,Long> {
}
