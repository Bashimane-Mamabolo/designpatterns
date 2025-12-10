package com.bash.vm;

public enum Product {
    COKE(20, "Coke"),
    CANDY(5, "Candy"),
    WATER(10, "Water"),
    PEPSI(18, "Pepsi"),
    CHIPS(30, "Chips");

    private final int price;
    private final String displayName;

    Product(int price, String displayName) {
        this.price = price;
        this.displayName = displayName;
    }
    public int getPrice() {
        return price;
    }
    public String getDisplayName() {
        return displayName;
    }
}
