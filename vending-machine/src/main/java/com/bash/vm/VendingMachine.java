package com.bash.vm;

import java.util.EnumMap;
import java.util.Map;

/// Vending machine session with a customer interacting it.
/// currentAmount, state and inventory (A list of the products and quantity, hashmap using EnumMap.)
public class VendingMachine {

    private MachineState currentState;
    private int currentAmount;
    private final Map<Product, Integer> productsInventory;

    // initialize the values, or create them. data must exist first before we can work with or use it.
    public VendingMachine() {
        this.currentState = MachineState.IDLE;
        this.currentAmount = 0;
        this.productsInventory = new EnumMap<Product, Integer>(Product.class);
        for (Product product : Product.values()) {
            productsInventory.put(product, 8);
        }
    }

    /// Actions that this object can perform. insertMoney/acceptMoney, SelectProduct, DisplayInventory, Refund, Cancel
    public boolean insertMoney(int amount) {
        // I should expect a valid amount. validate user-input, do let it get this far
//        if (amount <= 0) {
//            return false;
//        }
        if (currentState.canAcceptMoney()) {
            System.out.println("Can't insert money in state: " + currentState);
            return false;
        }

        currentAmount += amount;
        currentState = MachineState.ACCEPTING_MONEY;
        System.out.println("Current amount is: " + currentAmount + " .");
        return true;

    }

    /// Refund money
    public void refundMoney() {
        // check correct state
        if (currentState.canAcceptMoney()) {
            System.out.println("Can't refund money in state: " + currentState);
        }
        // refund and reset currentAmount to 0
        if (currentAmount > 0) {
            System.out.println("Refunding money: R"  + currentAmount + " .");
            currentAmount = 0;
        }
        currentState = MachineState.IDLE;
        System.out.println("Current amount is: " + currentAmount + " .");
    }

    /// Select product
    public boolean selectProduct(Product product) {
        // Check vending machine status
        if (!currentState.canDispenseProduct()) {
            System.out.println("Can't dispense product in state: " + currentState);
            return false;
        }

        // Check inventory for product availability
        if (productsInventory.get(product) == 0) {
            System.out.println(product.getDisplayName() + " is out of stock.");
            return false;
        }

        // Check sufficient money to get the product
        if (product.getPrice() > currentAmount) {
            System.out.println("Insufficient amount. Need R" + (product.getPrice() - currentAmount) + " more.");
            return false;
        }

        // Dispense product
        dispenseProduct(product);
        return true;
    }

    private void dispenseProduct(Product product) {
        currentState = MachineState.DISPENSING_PRODUCT;
        productsInventory.put(product, productsInventory.get(product) - 1);
        int change = currentAmount - product.getPrice();
        currentAmount = 0;
        System.out.println("Dispensing product " + product.getDisplayName());
        if (change > 0) {
            returnChange(change);
        }
        currentState = MachineState.IDLE;
    }

    private void returnChange(int change) {
        currentState = MachineState.RETURNING_CHANGE;
        System.out.println("Returning change R" + change + " .");
    }

    public void displayProductInventory() {
        System.out.println("=== Inventory ===");
        for (Product p : productsInventory.keySet()) {
            System.out.println(p.getDisplayName() + " (R" + p.getPrice() + ")");
        }
        System.out.println("=== Inventory ===");
        System.out.println();
    }
}
