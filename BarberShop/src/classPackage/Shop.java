package classPackage;

import java.util.List;

import enumPackage.Days;
import enumPackage.Products;

public class Shop {
	private List<Days> days;
	private List<Products> products;
	public List<Days> getDays() {
		return days;
	}
	public void setDays(List<Days> days) {
		this.days = days;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Shop [days=" + days + ", products=" + products + "]";
	}
	
}
