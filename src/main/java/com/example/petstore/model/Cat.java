package com.example.petstore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cat")
public class Cat extends Animal {

    @Column(name = "chipId")
    private String chipId;

    public Cat() {
    }

    public Cat(String chipId) {
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
