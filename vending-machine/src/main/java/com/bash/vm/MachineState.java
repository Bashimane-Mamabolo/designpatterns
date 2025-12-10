package com.bash.vm;

public enum MachineState {
    IDLE,
    ACCEPTING_MONEY,
    DISPENSING_PRODUCT,
    RETURNING_CHANGE,
    OUT_OF_ORDER;

    public boolean canAcceptMoney() {
        return this != IDLE && this != ACCEPTING_MONEY;
    }

    public boolean canDispenseProduct() {
        return this == ACCEPTING_MONEY;
    }
}
