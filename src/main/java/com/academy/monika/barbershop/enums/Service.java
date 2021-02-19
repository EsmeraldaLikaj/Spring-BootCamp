package com.academy.monika.barbershop.enums;

public enum Service {
    HAIRCUT("Haircut"),BEARD("Beard"),MUSTACHE_TRIM("Mustache trim");
    private String service;

    Service(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
