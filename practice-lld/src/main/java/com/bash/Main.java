package com.bash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ///  no inputs, just a hardcoded flow.
        ///  Instantiate and do. Objects Tell, Don't ask. We tell the person object what to do.

        Phone phone = new Phone("12345", PhoneType.MOBILE);
        Address address = new Address("styen", "alberton", "4019", Province.GAUTENG);

        Person me = new Person("Shimmy", 31, address, phone);

        Dog dog = new Dog("Spinach", 5, "Boerboel", PetType.DOG);
        Cat cat = new Cat("boots", 10, "Orange", PetType.CAT);

        me.adoptPet(dog);


    }
}