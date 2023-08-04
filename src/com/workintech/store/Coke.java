package com.workintech.store;

class Coke extends ProductForSale {
    private String cokeType;

    public Coke(String type, double price, String description, String cokeType) {
        super(type, price, description);
        this.cokeType = cokeType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("com.workintech.store.Coke Type: " + cokeType);
    }
}

