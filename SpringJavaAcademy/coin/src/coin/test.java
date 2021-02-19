package coin;

import java.util.Random;

public class test {
public static void main(String[] args) {
		
		Coin coin1= new Coin();
		Coin coin2= new Coin();
		
		Random r=new Random();
		
		System.out.println("Random flips for coin1:");
		for(int i=0;i< r.nextInt(10); i++) {
			System.out.println(coin1.flip());
		}
		
		System.out.println("Random flips for coin2:");
		for(int i=0; i<r.nextInt(10); i++) {
			System.out.println(coin2.flip());
		}
		
            System.out.println("Number of flips for Coin 1 : " + coin1.totalNumberOfFlipsForThisCoin());
            System.out.println("Number of flips for Coin 2 : " + coin2.totalNumberOfFlipsForThisCoin());
            System.out.println("Total Number Of Flips For All Coins : " + Coin.totalNumberOfFlipsForAllCoins());
            
 
	}

}
