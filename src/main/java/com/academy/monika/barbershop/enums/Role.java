package com.academy.monika.barbershop.enums;

public enum Role {
    OWNER("Owner"), ADMINISTRATOR("Administrator"), EMPLOYEE("Employee"), CLIENT("Client");
    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
