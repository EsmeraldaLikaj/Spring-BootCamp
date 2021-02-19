package barberShop;

import java.time.LocalDate;
import java.util.List;

public class Shop {
	
	private String shopName;
	private List <Employee> emplopyees;
	private List <Service> shopServices;
	private List <Product> shopProducts;
	private List <Holidays> shopHolidays;
	private List <LocalDate> shopWorkingDays;
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public List<Employee> getEmplopyees() {
		return emplopyees;
	}
	
	public void setEmplopyees(List<Employee> emplopyees) {
		this.emplopyees = emplopyees;
	}
	
	public List<Service> getShopServices() {
		return shopServices;
	}
	
	public void setShopServices(List<Service> shopServices) {
		this.shopServices = shopServices;
	}
	
	public List<Product> getShopProducts() {
		return shopProducts;
	}
	
	public void setShopProducts(List<Product> shopProducts) {
		this.shopProducts = shopProducts;
	}
	
	public List<Holidays> getShopHolidays() {
		return shopHolidays;
	}
	
	public void setShopHolidays(List<Holidays> shopHolidays) {
		this.shopHolidays = shopHolidays;
	}
	
	public List<LocalDate> getShopWorkingDays() {
		return shopWorkingDays;
	}
	
	public void setShopWorkingDays(List<LocalDate> shopWorkingDays) {
		this.shopWorkingDays = shopWorkingDays;
	}
}
