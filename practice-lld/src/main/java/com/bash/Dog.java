package com.bash;

public class Dog extends Animal implements Pet {

    private String breed;

    public Dog(String name, int age, String breed, PetType petType) {
        super(name, age, petType);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void bark() {
        System.out.println("Barking...");
    }

    @Override
    public void play() {
        System.out.println("Dog playing...");
    }

}
