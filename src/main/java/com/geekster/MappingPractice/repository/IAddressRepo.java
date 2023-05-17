package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
