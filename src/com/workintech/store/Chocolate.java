package com.workintech.store;

class Chocolate extends ProductForSale {
    private String chocolateType;

    public Chocolate(String type, double price, String description, String chocolateType) {
        super(type, price, description);
        this.chocolateType = chocolateType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("com.workintech.store.Chocolate Type: " + chocolateType);
    }
}