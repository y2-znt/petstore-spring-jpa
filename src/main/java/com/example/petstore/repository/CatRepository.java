package com.example.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.petstore.model.Cat;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
}
