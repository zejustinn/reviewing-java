package com.lambdas.calculate;

public class Product {
    private final String name;
    private final double price;
    private final double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    private Double getFinalPrice(){
        return this.getPrice() * (1 - this.getDiscount());
    }

    @Override
    public String toString() {
        return this.getName() + " custa R$ "
                + String.format("%.2f", this.getFinalPrice());
    }
}
