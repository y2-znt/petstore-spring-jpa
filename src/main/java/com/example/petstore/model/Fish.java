package com.example.petstore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Fish")
public class Fish extends Animal {

    @Enumerated(EnumType.STRING)
    @Column(name = "livingEnv")
    private FishLivEnv livingEnv;

    public Fish() {
    }

    public Fish(FishLivEnv livingEnv) {
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
