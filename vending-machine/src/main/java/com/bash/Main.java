package com.bash;

import com.bash.vm.Product;
import com.bash.vm.VendingMachine;

public class Main {
    public static void main(String[] args) {
        // Vending machine version 1.0.0 is now ready and available to use
        // Arrange, act, assert
        VendingMachine vendingMachine = new VendingMachine();
        boolean actionResult;

        // Customer buy chips from the vm session;
        // show me the inventory which I'm going to make a selection from
        vendingMachine.displayProductInventory();
        // insert money
        actionResult = vendingMachine.insertMoney(40);
        // select chips product
        if (actionResult) {
            actionResult = vendingMachine.selectProduct(Product.CHIPS);
        }
        if (actionResult) {
            System.out.println("The product has been dispensed.");
        } else  {
            System.out.println("Something went wrong. Please try again.");
        }

    }
}