package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop, Integer> {
}
