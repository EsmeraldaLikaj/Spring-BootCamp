package coin;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Coin coin1= new Coin();
		Coin coin2=new Coin();
		
		Random r= new Random();
		
		for(int i=0;i<r.nextInt(10);i++)
		{
			coin1.flipTheCoin();
			System.out.println(coin1.toString());
			
		}
		System.out.print("\n");
		for(int i=0;i<r.nextInt(10);i++)
		{
			coin2.flipTheCoin();
			System.out.println(coin1.toString());
		}
		
		System.out.println("This coin was fliped "+coin1.totalNumberOfFlipsForThisCoin()+" times");
		System.out.println("This coin was fliped "+coin2.totalNumberOfFlipsForThisCoin()+" times");
		System.out.println("Total flips "+Coin.totalNumberOfFlipsForAllCoins()+".");

	}

}
