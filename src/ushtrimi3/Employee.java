package ushtrimi3;

import java.util.ArrayList;

public class Employee extends User{
	private ArrayList<EmployeeService> services;
	private ArrayList<Day> workDays;
	private ArrayList<Day> DaysOff;
	
	public Employee(String name, String lastname, int age, ArrayList<EmployeeService> services, ArrayList<Day> workDays,
			ArrayList<Day> daysOff) {
		super(name, lastname, age);
		this.services = services;
		this.workDays = workDays;
		DaysOff = daysOff;
	}
	public Employee() {
		this.services=null;
		this.workDays=null;
		this.DaysOff=null;
	}
	public ArrayList<EmployeeService> getServices() {
		return services;
	}
	public void setServices(ArrayList<EmployeeService> services) {
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
}
