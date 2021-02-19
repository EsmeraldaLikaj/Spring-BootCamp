package ushtrimi1;
import java.util.Random;

public class Coin {
	
	private final int heads=0;
	private final int tails=1;
	
	private int face;
	private int numberFlips;
	private static int totalNumberOfFlips;
	
	public Coin() {
		totalNumberOfFlips=0;
	}
	
	public void flip() {
		Random random=new Random();
		face = random.nextInt(2);
		numberFlips ++;
		totalNumberOfFlips ++;
	}
	
	public int totalNumberOfFlipsForThisCoin() {
		return numberFlips;
	}
	
	public static int totalNumberOfFlipsForAllCoins() {
		return totalNumberOfFlips;
	}
	
}
