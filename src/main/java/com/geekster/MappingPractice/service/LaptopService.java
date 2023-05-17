package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop getLaptop(Integer id) {
        return laptopRepo.getById(id);
    }

    public void updateLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public void deleteLaptop(Integer id) {
        laptopRepo.deleteById(id);
    }
}
