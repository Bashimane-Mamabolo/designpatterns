package com.bash;

public enum PetType {

    CAT,
    DOG,
    FISH,
    PIG,
    RABBIT,
    BIRD;

    public boolean  isDog() {
        return this == DOG;
    }
}
