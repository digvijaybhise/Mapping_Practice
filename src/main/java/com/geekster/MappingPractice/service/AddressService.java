package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Address;
import com.geekster.MappingPractice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddress(Integer id) {
        return addressRepo.getById(id);
    }

    public void updateAddress(Address address) {
        addressRepo.save(address);
    }

    public void deleteAddress(Integer id) {
        addressRepo.deleteById(id);
    }
}
