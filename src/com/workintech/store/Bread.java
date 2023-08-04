package com.workintech.store;

class Bread extends ProductForSale {
    private String breadType;

    public Bread(String type, double price, String description, String breadType) {
        super(type, price, description);
        this.breadType = breadType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("com.workintech.store.Bread Type: " + breadType);
    }
}

