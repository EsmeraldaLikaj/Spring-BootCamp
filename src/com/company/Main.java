package com.company;

//    1. Create a Coin class. The class should have 2 constants heads and tails evaluated to
//        0 and 1 and a face instance variable which will be used to store the value of the coin(heads/tail)
//        a.Create a flip method which will flip the coin in a random way (using the face variable)
/////     b. Add an instance method totalNumberOfFlipsForThisCoin which returns the total number of times the method flip
////              has been called so far for each coin separately.(you may use additional helper variables)
////      c. Add a class method totalNumberOfFlipsForAllCoins which returns the total number of times the method flip
//                has been called for all the coins. (you may use additional helper variables)
///       d. Test the methods in a Test class and explain the difference between the method in b and in c

import static com.company.Coin.totalNumberOfFlipsOfAllCoins;

public class Main {

    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();

        coin1.flip();
        coin2.flip();
        coin2.flip();
        coin2.flip();
        coin3.flip();
        coin1.flip();

        System.out.println("Coin 1 flip " + coin1.totalNumberOfFlipsForThisCoin() + " times");
        System.out.println("Coin 2 flip " + coin2.totalNumberOfFlipsForThisCoin() + " Times");
        System.out.println("Coin 3 flip " + coin3.totalNumberOfFlipsForThisCoin() + " Times");

        System.out.println("Total number of flips " + totalNumberOfFlipsOfAllCoins());

        // Metoda e pikes b (totalNumberOfFlipsForThisCoin) e cila ka nje variabel instance i cili jeton per sa koh jeton objekti, pra kur ne krijojm nje objekt te ri
        //    ne krijojme edhe nje variabel i cili do te mbaje nje te dhene te caktuar per kete objekt per sa kohe qe objekti do te ekzistoje e njejta gje vlen edhe per metoden.
        // Ndersa metoda e pikes c (totalNumberOfFlipsForAllCoins) ka nje variabel static i cili i perket klases dhe jo objekteve te saj. Po ashtu metoda vet eshte static
        //    dhe mund te aksesohet pa patur nevojen e nje objekti konkret te klases. Pra ky variabel dhe kjo metod static nuk ndikohen nga jeta e objektit.
    }
}
