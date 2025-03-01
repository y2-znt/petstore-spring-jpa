package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.petstore.model.PetStore;

@Repository
public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
}
