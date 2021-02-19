package coin;

import java.util.Random;

public class Coin {
	
	final int heads=0;
	final int tails=1;
	
	private int face;
	
	private int countOfFlipsForThisCoin;
	private static int countOfFlipsForAllCoins;
	
	public void flipTheCoin()
	{
		Random r= new Random();
		
		if(r.nextInt(2)==1){
			
			face= tails ;
		}
		else{
			face=heads;
		}
		countOfFlipsForThisCoin++;
		countOfFlipsForAllCoins++;
	}
	
	public int totalNumberOfFlipsForThisCoin()
	{
		return countOfFlipsForThisCoin;
	}
	public static int totalNumberOfFlipsForAllCoins()
	{
		return countOfFlipsForAllCoins;
	}
	
	@Override
	public String toString()
	{
		if (face==1)
			return "Tails";
		else
			return "Heads";
	}

}
