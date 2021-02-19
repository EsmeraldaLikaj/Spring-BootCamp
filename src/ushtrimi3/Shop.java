package ushtrimi3;

import java.util.ArrayList;

public class Shop {
	private ArrayList<Employee> employees;
	private ArrayList<Service> services;
	private ArrayList<Day> workDays;
	private ArrayList<Day> DaysOff;
	private ArrayList<Product> products;
	private Owner owner;
	
	public Shop(ArrayList<Employee> employees, ArrayList<Service> services, ArrayList<Day> workDays,
			ArrayList<Day> daysOff, ArrayList<Product> products, Owner owner) {
		
		this.employees = employees;
		this.services = services;
		this.workDays = workDays;
		DaysOff = daysOff;
		this.products = products;
		this.owner = owner;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public ArrayList<Service> getServices() {
		return services;
	}
	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}
	public ArrayList<Day> getWorkDays() {
		return workDays;
	}
	public void setWorkDays(ArrayList<Day> workDays) {
		this.workDays = workDays;
	}
	public ArrayList<Day> getDaysOff() {
		return DaysOff;
	}
	public void setDaysOff(ArrayList<Day> daysOff) {
		DaysOff = daysOff;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
