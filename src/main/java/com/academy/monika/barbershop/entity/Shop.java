package com.academy.monika.barbershop.entity;

import com.academy.monika.barbershop.enums.Day;
import com.academy.monika.barbershop.enums.Product;
import com.academy.monika.barbershop.enums.Service;

import java.util.List;

public class Shop {
    private String id;
    private User owner;
    List<User> employees;
    List<Service> services;
    List<Product> products;
    List<Day> workingDays;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Day> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(List<Day> workingDays) {
        this.workingDays = workingDays;
    }
}
