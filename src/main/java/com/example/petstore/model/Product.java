package com.example.petstore.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "label")
    private String label;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ProdType type;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "petstore_id")
    private PetStore petStore;

    public Product() {
    }

    public Product(String name, String label, ProdType type, Double price, PetStore petStore) {
        this.name = name;
        this.label = label;
        this.type = type;
        this.price = price;
        this.petStore = petStore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ProdType getType() {
        return type;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PetStore getPetstore() {
        return petStore;
    }

    public void setPetstore(PetStore petStore) {
        this.petStore = petStore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", petStore=" + petStore +
                '}';
    }
}
