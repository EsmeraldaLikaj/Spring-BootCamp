package com.academy.monika.barbershop.enums;

public enum Product {
    OIL("Oil",15.59d),
    SHAMPOO("Hair Shampoo",14.99d),
    CONDITIONER("Hair Conditioner",19.99d),
    AFTERSHAVE("AfterShave",12.99d);

    private String productName;
    private Double price;
    Product(String productName,Double price) {
        this.productName=productName;
        this.price=price;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }
}
