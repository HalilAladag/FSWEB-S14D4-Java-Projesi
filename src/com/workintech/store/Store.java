package com.workintech.store;

class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("Sales Price for 5: $" + product.getSalesPrice(5));
            System.out.println("-------------");
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Milk com.workintech.store.Chocolate", 2.5, "Creamy milk chocolate bar", "Milk"),
                new Coke("Carbonated Beverage", 1.0, "Refreshing cola drink", "Regular"),
                new Bread("Loaf com.workintech.store.Bread", 3.0, "Freshly baked loaf of bread", "Whole Wheat")
        };

        listProducts(products);
    }
}