package com.jones.Employee_Address.controller;

import com.jones.Employee_Address.service.Emp_address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    Emp_address empaddress;

    @PostMapping("addresses")
    public String addAddresses(@RequestBody com.jones.Employee_Address.model.Address address){
        return this.empaddress.addAddresses(address);
    }

    @GetMapping("addresses/{addressId}")
    public com.jones.Employee_Address.model.Address getAddressesById(@PathVariable Long addressId){
        return empaddress.getAddressesById(addressId);
    }

    @GetMapping("addresses")
    public List<com.jones.Employee_Address.model.Address> getAllAddresses(){
        return empaddress.getAllAddresses();
    }

    @PutMapping("addresses/{addressId}")
    public String updateAddresses(@PathVariable Long addressId,@RequestBody com.jones.Employee_Address.model.Address address){
        return this.empaddress.updateAddresses(addressId,address);
    }

    @DeleteMapping("addresses/{addressId}")
    public String deleteAddresses(@PathVariable Long addressId){
        return empaddress.deleteAddressesById(addressId);
    }
}
