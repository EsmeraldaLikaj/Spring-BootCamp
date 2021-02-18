package classPackage;

import java.util.Date;

import enumPackage.Services;

public class Booking {
	private Date date;
	private User employee;
	private User client;
	private Services services;
	
	
	@Override
	public String toString() {
		return "Booking [date=" + date + ", services=" + services + "]";
	}
	
	
	public Date getDate() {
		return this.date;
	}
	public User getEmployee() {
		return this.employee;
	}
	public User getClient() {
		return this.client;
	}
	public Services getServices() {
		return this.services;
	}
	public void setDate(Date date) {
		this.date=date;
	}
	public void setEmployee(User employee) {
		this.employee=employee;
	}
	public void setClient(User client) {
		this.client=client;
	}
	public void setServices(Services services) {
		this.services=services;
	}
	
}
