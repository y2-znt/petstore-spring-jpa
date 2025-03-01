package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.petstore.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
