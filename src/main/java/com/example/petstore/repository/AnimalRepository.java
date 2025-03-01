package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.petstore.model.Animal;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    // Extraire la liste des animaux d'un petstore
    List<Animal> findByPetStoreId(Long petStoreId);
}
