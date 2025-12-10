package com.bash;

public class Person {

    private final String name;
    private int age;
    private Address address;
    private Phone phone;

    public Person(String name, int age, Address address, Phone phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }


    public void adoptPet(Pet pet) {
        ///  Only adopt dog pet
        if (pet != null && pet.getPetType() == PetType.DOG) {
            System.out.println("Dog pet adopted.");
        } else  {
            System.out.println("Pet is not dog, therefore not adopted.");
        }


    }

}
