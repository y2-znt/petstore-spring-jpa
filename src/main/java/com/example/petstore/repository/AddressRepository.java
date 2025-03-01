package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.petstore.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
