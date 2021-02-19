package coin;

public class Coin {
	
	private static final int head= 0;
	private static final int tail= 1;
	private int face;
	private int totalNumberOfFlipsForThisCoin;
	private static int totalNumberOfFlipsForAllCoins=0;

	public Coin() {
		totalNumberOfFlipsForThisCoin=0;
		
	}
	
	public int flip() {
	     this.face=(int) Math.random()*2;
	     face=totalNumberOfFlipsForThisCoin++;
	     totalNumberOfFlipsForAllCoins++;
	     
	     if(this.face==0) {
	    	 return Coin.head;
	     }else {
	    	 return Coin.tail;
	     }
	}
	
	public int totalNumberOfFlipsForThisCoin(){
		return totalNumberOfFlipsForThisCoin;
	}
	
	public static int totalNumberOfFlipsForAllCoins() {
		return totalNumberOfFlipsForAllCoins;
	}



}

