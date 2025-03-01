package com.example.petstore.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Fish")
public class Fish extends Animal {

    @Enumerated(EnumType.STRING)
    @Column(name = "livingEnv")
    private FishLivEnv livingEnv;

    public Fish() {
        super();
    }

    public Fish(Date birth, String color, PetStore petStore, FishLivEnv livingEnv) {
        super(birth, color, petStore);
        this.livingEnv = livingEnv;
    }

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "id=" + getId() +
                ", birth=" + getBirth() +
                ", color='" + getColor() + '\'' +
                ", petStore=" + getPetStore() +
                ", livingEnv=" + livingEnv +
                '}';
    }
}
