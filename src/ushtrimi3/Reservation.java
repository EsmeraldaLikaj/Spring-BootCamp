package ushtrimi3;

import java.sql.Date;
import java.util.ArrayList;

public class Reservation {
	private ArrayList<Service> services;
	private ArrayList<Product> products;
	private Date createdAt;
	
	public Reservation(ArrayList<Service> services, ArrayList<Product> products, Date createdAt) {
		this.services = services;
		this.products = products;
		this.createdAt = createdAt;
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
