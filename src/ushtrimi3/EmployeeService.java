package ushtrimi3;

public class EmployeeService extends Service{

	private double price;
	
	public EmployeeService(String name, double price) {
		this.price = price;
	}
	
	public EmployeeService() {
		this.price=0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
