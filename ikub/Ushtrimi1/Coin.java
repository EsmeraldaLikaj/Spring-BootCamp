/*
 1. Create a Coin class. The class should have 2 constants heads and tails evaluated to
0 and 1 and a face instance variable which will be used to store the value of the coin(heads/tail) 
a.Create a flip method which will flip the coin in a random way (using the face variable)
b. Add an instance method totalNumberOfFlipsForThisCoin which returns the total number of times the method flip has been 
called so far for each coin separately.(you may use additional helper variables)
c. Add a class method totalNumberOfFlipsForAllCoins which returns the total number of times the method flip has been 
called for all the coins. (you may use additional helper variables) 
d. Test the methods in a Test class and explain the difference between the method in b and in c 
 */
package Ushtrimi1;
public class Coin {
	
	//constants
	private static final int heads = 0;
	private static final int tails = 1;
	//cntb - per piken b te ushtrimit
	private int cntb = 0;
	//cntc - per piken c te ushtrimit
	private static int cntc = 0;
	//instance variable
	private int face;
	
	public void flip() {
		cntb ++;
		cntc ++;
		face = (int) (Math.random() * 2);
	}
	
	public int totalNumberOfFlipsForThisCoin() {
		return cntb;
	}
	
	public static int totalNumberOfFlipsForAllCoins() {
		return cntc;//kthen statikun
	}
	
}
