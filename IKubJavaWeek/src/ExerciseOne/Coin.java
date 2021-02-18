package ExerciseOne;

//1. Create a Coin class. The class should have 2 constants heads and tails evaluated to
//   0 and 1 and a face instance variable which will be used to store the value of the coin(heads/tail)
//   a.Create a flip method which will flip the coin in a random way (using the face variable)
//   b. Add an instance method totalNumberOfFlipsForThisCoin which returns the total number of times the method flip has been called so far for each coin separately.(you may use additional helper variables)
//   c. Add a class method totalNumberOfFlipsForAllCoins which returns the total number of times the method flip has been called for all the coins. (you may use additional helper variables)
//   d. Test the methods in a Test class and explain the difference between the method in b and in c

public class Coin {

    private int heads;
    private int tails;
    private int face;
    private int totalNumberOfFlipsForThisCoin;
    private static int totalNumberOfFlipsForAllCoins;

    public Coin() {
        this.heads = 0;
        this.tails = 1;
        totalNumberOfFlipsForThisCoin = 0;
    }

    public void flip() {
        this.face = (int) Math.floor(Math.random() * 2);
        this.totalNumberOfFlipsForThisCoin++;
        totalNumberOfFlipsForAllCoins++;
    }

    public int totalNumberOfFlipsForThisCoin() {
        return this.totalNumberOfFlipsForThisCoin;
    }

    public static int totalNumberOfFlipsForAllCoins() {
        return totalNumberOfFlipsForAllCoins;
    }

}
