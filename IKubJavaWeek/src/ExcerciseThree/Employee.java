package ExcerciseThree;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Employee extends Person{

    private Role role;
    private Shop shop;
    private HashMap<String, Service> services;
    private HashMap<String, Date> workingDays;
    private HashMap<String, Date> holidays;

    public Employee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Employee(String firstName, String lastName, int age, HashMap<String, Date> workingDays, HashMap<String, Date> holidays) {
        super(firstName, lastName, age);
        this.workingDays = workingDays;
        this.holidays = holidays;
    }

    public void addService(Service service) {
        if (shop.getServices().contains(service)) {
            services.putIfAbsent(service.getService(), service);
        }
    }

    public void addWorkingDays(Date date) {
        if(this.shop.getWorkingDays().containsKey(date.toString())) {
            this.workingDays.putIfAbsent(date.toString(), date);
        }
    }

    public void addHolidayDate(Date date) {
        if(this.shop.getHolidays().containsKey(date.toString())) {
            this.holidays.putIfAbsent(date.toString(), date);
        }
    }

    public Date removeHolidayDate(Date date) {
        return this.holidays.remove(date.toString());
    }

    public Date removeWorkingDays(Date date) {
        return this.workingDays.putIfAbsent(date.toString(), date);
    }

    public Service removeService(Service service) {
        return this.services.remove(service.getService());
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Service> getServices() {
        return (List<Service>) services.values();
    }

    public void setServices(HashMap<String, Service> services) {
        this.services = services;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
