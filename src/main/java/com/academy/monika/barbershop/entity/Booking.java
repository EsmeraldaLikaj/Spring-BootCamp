package com.academy.monika.barbershop.entity;

import com.academy.monika.barbershop.enums.Service;

import java.util.List;
import java.util.Map;

public class Booking {
    private String id;
    private User client;
    private User employee;
    private Service service;
    //if a client can book several services at once
    //private Map<User, List<Service>> servicesPerUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
