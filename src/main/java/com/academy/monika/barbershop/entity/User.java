package com.academy.monika.barbershop.entity;

import com.academy.monika.barbershop.enums.Day;
import com.academy.monika.barbershop.enums.Product;
import com.academy.monika.barbershop.enums.Role;
import com.academy.monika.barbershop.enums.Service;

import java.util.List;
import java.util.Map;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private Map<Service, Double> pricePerEmployeeService;
    private List<Day> workingEmployeeDays;
    private List<Product> boughtProducts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Map<Service, Double> getPricePerEmployeeService() {
        return pricePerEmployeeService;
    }

    public void setPricePerEmployeeService(Map<Service, Double> pricePerEmployeeService) {
        this.pricePerEmployeeService = pricePerEmployeeService;
    }

    public List<Day> getWorkingEmployeeDays() {
        return workingEmployeeDays;
    }

    public void setWorkingEmployeeDays(List<Day> workingEmployeeDays) {
        this.workingEmployeeDays = workingEmployeeDays;
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(List<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }
}
