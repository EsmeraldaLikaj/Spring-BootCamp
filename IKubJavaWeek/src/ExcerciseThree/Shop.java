package ExcerciseThree;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Shop {

    private Owner owner;
    private Set<Employee> employees;
    private Set<Product> products;
    private HashMap<String, Service> services;
    private HashMap<String, Date> workingDays;
    private HashMap<String, Date> holidays;

    public Shop() {

    }

    public Shop(Owner owner, Set<Employee> employees, Set<Product> products, HashMap<String, Service> services, HashMap<String, Date> workingDays, HashMap<String, Date> holidays) {
        this.owner = owner;
        this.employees = employees;
        this.products = products;
        this.services = services;
        this.workingDays = workingDays;
        this.holidays = holidays;
    }

    public void addWorkingDate(Date date) {
        workingDays.putIfAbsent(date.toString(), date);
    }

    public void addHolidayDate(Date date) {
        holidays.putIfAbsent(date.toString(), date);
    }

    public Date deleteWorkingDay (Date date) {
        return workingDays.remove(date.toString());
    }

    public Date deleteHolidayDate (Date date) {
        return holidays.remove(date.toString());
    }

    public HashMap<String, Date> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(HashMap<String, Date> workingDays) {
        this.workingDays = workingDays;
    }

    public HashMap<String, Date> getHolidays() {
        return holidays;
    }

    public void setHolidays(HashMap<String, Date> holidays) {
        this.holidays = holidays;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addService(Service service) {
        services.putIfAbsent(service.getService(), service);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public List<Service> getServices() {
        return (List<Service>) services.values();
    }

    public void setServices(HashMap<String, Service> services) {
        this.services = services;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
