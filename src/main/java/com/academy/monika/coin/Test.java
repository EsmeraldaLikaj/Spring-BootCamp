package com.academy.monika.coin;

import com.academy.monika.coin.entity.Coin;

public class Test {
    public static void main(String[] args) {
        Coin coin1=new Coin();
        coin1.flip();
        System.out.println("First Coin was flipped : "+ coin1.totalNumberOfFlipsForThisCoin()+ " time/s.");
        System.out.println("All coins are flipped "+Coin.totalNumberOfFlipsForAllCoins()+" time/s. ");
        Coin coin2=new Coin();
        coin2.flip();
        coin2.flip();
        System.out.println("Second Coin was flipped : "+coin2.totalNumberOfFlipsForThisCoin()+ " time/s.");
        System.out.println("All coins are flipped "+Coin.totalNumberOfFlipsForAllCoins()+" time/s. ");
    }
}
