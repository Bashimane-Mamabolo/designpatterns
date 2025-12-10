package com.bash;

public class Cat extends Animal implements Pet {

    private String furColor;

    public Cat(String name, int age, String furColor, PetType petType) {
        super(name, age, petType);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void meow() {
        System.out.println("meow");
    }


    @Override
    public void play() {
        System.out.println("Cat playing...");
    }
}
