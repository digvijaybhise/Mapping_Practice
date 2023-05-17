package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("laptop")
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping()
    public void addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
    }

    @GetMapping()
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }

    @GetMapping("{id}")
    public Laptop getLaptop(@PathVariable Integer id){
        return laptopService.getLaptop(id);
    }

    @PutMapping()
    public void updateLaptop(@RequestBody Laptop laptop){
        laptopService.updateLaptop(laptop);
    }

    @DeleteMapping("{id}")
    public void deleteLaptop(@PathVariable Integer id){
        laptopService.deleteLaptop(id);
    }
}
