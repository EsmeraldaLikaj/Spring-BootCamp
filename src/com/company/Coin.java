package com.company;

public class Coin {
    final int heads = 0;
    final int tails = 1;
    private int face;
    private int coinCount = 0;
    private static int coinsCounter = 0;

    public int flip() {
        this.face = (int) (Math.random() * 2);
        coinCount++;
        coinsCounter++;
        if ( face == 0 ) {
            System.out.println("Head");
            return heads;
        } else {
            System.out.println("Tail");
            return tails;
        }

    }

    public int totalNumberOfFlipsForThisCoin() {
        return coinCount;
    }

    public static int totalNumberOfFlipsOfAllCoins() {
        return coinsCounter;
    }
}
