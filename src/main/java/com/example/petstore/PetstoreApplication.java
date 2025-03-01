package com.example.petstore;

import com.example.petstore.model.*;
import com.example.petstore.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PetstoreApplication implements CommandLineRunner {

    private final AnimalRepository animalRepository;
	private final AddressRepository addressRepository;
	private CatRepository catRepository;
	private FishRepository fishRepository;
	private PetStoreRepository petStoreRepository;
	private ProductRepository productRepository;

	@Autowired
	public PetstoreApplication(AddressRepository addressRepository, AnimalRepository animalRepository, CatRepository catRepository, FishRepository fishRepository, PetStoreRepository petStoreRepository, ProductRepository productRepository) {
        this.animalRepository = animalRepository;
		this.catRepository = catRepository;
		this.fishRepository = fishRepository;
		this.petStoreRepository = petStoreRepository;
		this.productRepository = productRepository;
		this.addressRepository = addressRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(PetstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");

		// Création des adresses
		Address address1 = new Address("10", "rue de la paix", "Paris", "75000");
		Address address2 = new Address("20", "rue de la liberté", "Lyon", "69000");
		Address address3 = new Address("30", "rue de la fraternité", "Marseille", "13000");
		addressRepository.save(address1);
		addressRepository.save(address2);
		addressRepository.save(address3);
	}
}
