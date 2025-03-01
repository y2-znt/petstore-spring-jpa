package com.example.petstore.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Cat")
public class Cat extends Animal {

    @Column(name = "chipId")
    private String chipId;

    public Cat() {
        super();
    }

    public Cat(Date birth, String color, PetStore petStore, String chipId) {
        super(birth, color, petStore);
        this.chipId = chipId;
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + getId() +
                ", birth=" + getBirth() +
                ", color='" + getColor() + '\'' +
                ", petStore=" + getPetStore() +
                ", chipId='" + chipId + '\'' +
                '}';
    }
}
