package ushtrimi1;
public class Main {
	
	public static void main(String[] args) {
		
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		Coin coin3 = new Coin();
		
		for(int i=0; i<5 ;i++) {
			coin1.flip();
			coin2.flip();
			coin3.flip();
		}
		System.out.println("Coin 1 => " +coin1.totalNumberOfFlipsForThisCoin());
        System.out.println("Coin 2 => " +coin2.totalNumberOfFlipsForThisCoin());
        System.out.println("Coin 3 => " +coin3.totalNumberOfFlipsForThisCoin());
        System.out.println("Total coin =>" +Coin.totalNumberOfFlipsForAllCoins());
	}
}
