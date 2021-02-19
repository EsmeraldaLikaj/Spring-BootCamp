package com.academy.monika.football.enums;

public enum Role {
    REFEREE("REFEREE"), PLAYER("PLAYER"), COACH("COACH");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
