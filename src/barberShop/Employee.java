package barberShop;

import java.time.LocalDate;
import java.util.List;

public class Employee {
	
	private String name;
	private String surname;
	private int age;
	private String address;
	private Shop barberShop;
	private List <Service> employeeServices;
	private List <LocalDate> employeeWorkingDays;
	private List <Holidays> employeeHolidays;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Shop getBarberShop() {
		return barberShop;
	}

	public void setBarberShop(Shop barberShop) {
		this.barberShop = barberShop;
	}
	
	public List<Service> getEmployeeServices() {
		return employeeServices;
	}
	
	public void setEmployeeServices(List<Service> employeeServices) {
		this.employeeServices = employeeServices;
	}
	
	public List<LocalDate> getemployeeWorkingDays() {
		return employeeWorkingDays;
	}

	public void employeeWorkingDays(LocalDate workingDay) {
		
		if(barberShop.getShopWorkingDays().contains(workingDay))
		{
			employeeWorkingDays.add(workingDay);
		}
		
	}

	public List<Holidays> getEmployeeHolidays() {
		return employeeHolidays;
	}

	public void setEmployeeHolidays(List<Holidays> employeeHolidays) {
		this.employeeHolidays = employeeHolidays;
	}
	
}
