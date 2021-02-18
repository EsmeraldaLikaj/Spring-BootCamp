package ExerciseOne;

public class Main {
    public static void main(String[] args) {

        Coin coin_1 = new Coin();
        Coin coin_2 = new Coin();
        Coin coin_3 = new Coin();

        for (int i = 0; i < 10; i++) {
            coin_1.flip();
            coin_2.flip();
            coin_3.flip();
        }

        System.out.println("ExerciseOne.Coin 1 -> " + coin_1.totalNumberOfFlipsForThisCoin());
        System.out.println("ExerciseOne.Coin 2 -> " + coin_2.totalNumberOfFlipsForThisCoin());
        System.out.println("ExerciseOne.Coin 3 -> " + coin_3.totalNumberOfFlipsForThisCoin());
        System.out.println("Total Number Of Flips For All Coins -> " + Coin.totalNumberOfFlipsForAllCoins());

    }
}
