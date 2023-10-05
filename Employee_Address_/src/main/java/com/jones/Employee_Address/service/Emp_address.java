package com.jones.Employee_Address.service;

import com.jones.Employee_Address.repository.Addressrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Emp_address {

    @Autowired
    Addressrepo addressrepo;

    // Add Address
    public String addAddresses(com.jones.Employee_Address.model.Address address) {
        addressrepo.save(address);
        return "Address added";
    }

    // Get Address By I'd
    public com.jones.Employee_Address.model.Address getAddressesById(Long addressId) {
        return addressrepo.findById(addressId)
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));
    }

    // Get All Address
    public List<com.jones.Employee_Address.model.Address> getAllAddresses() {
        return addressrepo.findAll();
    }

    // Update Address by I'd
    public String updateAddresses(Long addressId, com.jones.Employee_Address.model.Address address) {
        com.jones.Employee_Address.model.Address existingAddress = addressrepo.findById(addressId)
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));

        existingAddress.setStreet(address.getStreet());
        existingAddress.setCity(address.getCity());
        existingAddress.setState(address.getState());
        existingAddress.setZipcode(address.getZipcode());

        addressrepo.save(existingAddress);

        return "Address updated";
    }

    // Delete Address by I'd
    public String deleteAddressesById(Long addressId) {
        addressrepo.deleteById(addressId);
        return "Address deleted";
    }
}
