package coinTask;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Coin coin1= new Coin();
		coin1.flip();
		coin1.flip();
		coin1.flip();
		System.out.println("Eshte hedhur "+coin1.getTotalNumberOfFlipsForThisCoin());
		Coin coin2=new Coin();
		coin2.flip();
		coin2.flip();
		System.out.println("Eshte hedhur "+coin2.getTotalNumberOfFlipsForThisCoin());
		System.out.println("Gjithsej eshte hedhur "+coin2.getTotalNumberOfFlipsForAllCoins());
	}

}
