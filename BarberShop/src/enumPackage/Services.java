package enumPackage;

public enum Services {
	HAIR_CUT(15), BEARD_CUT(20), MUSTACHE_TRIM(10);
	
	private int price;
	
	Services(int price){
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
}
