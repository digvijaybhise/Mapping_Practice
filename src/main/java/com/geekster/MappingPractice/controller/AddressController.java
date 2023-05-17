package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Address;
import com.geekster.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping()
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @GetMapping()
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("{id}")
    public Address getAddress(@PathVariable Integer id){
        return addressService.getAddress(id);
    }

    @PutMapping()
    public void updateAddress(@RequestBody Address address){
        addressService.updateAddress(address);
    }

    @DeleteMapping("{id}")
    public void deleteAddress(@PathVariable Integer id){
        addressService.deleteAddress(id);
    }
}
