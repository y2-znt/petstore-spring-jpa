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

		// Création des PetStore (reliés a une adresse)
		PetStore petStore1 = new PetStore("PetStore1", "John Doe", address1);
		PetStore petStore2 = new PetStore("PetStore2", "Jane Doe", address2);
		PetStore petStore3 = new PetStore("PetStore3", "Jack Doe", address3);
		petStoreRepository.save(petStore1);
		petStoreRepository.save(petStore2);
		petStoreRepository.save(petStore3);

		// Création des produits (reliés a un PetStore)
		Product product1 = new Product("Croquettes", "Croquettes label", ProdType.FOOD, 10.0, petStore1);
		Product product2 = new Product("Litière", "Litière label", ProdType.ACCESSORY, 5.0, petStore1);
		Product product3 = new Product("Poisson rouge", "Poisson rouge label", ProdType.CLEANING, 2.0, petStore2);
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);

		// Création des animaux (reliés a un PetStore)
		Animal animal1 = new Animal(new Date(), "Rouge", petStore1);
		Animal animal2 = new Animal(new Date(), "Bleu", petStore1);
		Animal animal3 = new Animal(new Date(), "Vert", petStore2);
		animalRepository.save(animal1);
		animalRepository.save(animal2);
		animalRepository.save(animal3);

		// Création des fish (héritant de Animal)
		Fish fish1 = new Fish(new Date(), "Rouge", petStore1, FishLivEnv.FRESH_WATER);
		Fish fish2 = new Fish(new Date(), "Bleu", petStore1, FishLivEnv.SEA_WATER);
		Fish fish3 = new Fish(new Date(), "Vert", petStore2, FishLivEnv.FRESH_WATER);
		fishRepository.save(fish1);
		fishRepository.save(fish2);
		fishRepository.save(fish3);

		// Création des cat (héritant de Animal)
		Cat cat1 = new Cat(new Date(), "Rouge", petStore1, "1");
		Cat cat2 = new Cat(new Date(), "Bleu", petStore1, "2");
		Cat cat3 = new Cat(new Date(), "Vert", petStore2, "3");
		catRepository.save(cat1);
		catRepository.save(cat2);
		catRepository.save(cat3);

	}
}
