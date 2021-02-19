package barberShop;

public enum Product {

	OILS(20), 
	AFTER_SHAVES(30);
	
	private int price;
	
	private Product(int price)
	{
		this.price=price;
	}

	public int getPrice() {
		return price;
	}

}
