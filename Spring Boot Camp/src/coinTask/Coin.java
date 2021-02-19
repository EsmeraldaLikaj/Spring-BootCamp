package coinTask;

import java.util.Random;

public class Coin {
	private final int heads=0;
	private final int tail=1;
	private static int globalCounter=0;
	private  int localCounter;
	private int face;
	
	public Coin() {
		localCounter=0;
	}
	public void flip() {
		globalCounter=globalCounter+1;
		localCounter=localCounter+1;
		Random rand=new Random();
		face=rand.nextInt(2);
		
	}
	public int getTotalNumberOfFlipsForThisCoin() {
		
		return localCounter;
	}
	public int getTotalNumberOfFlipsForAllCoins() {
		return globalCounter;
	}
	public int getFace() {
		return face;
	}
	
}
