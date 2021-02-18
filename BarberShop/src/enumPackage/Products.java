package enumPackage;

public enum Products {
	OIL(20.00),AFTER_SHAVE(15.00),HAIR_GEL(15.00);
	
	private double price;
	
	Products(double price){
		this.setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
