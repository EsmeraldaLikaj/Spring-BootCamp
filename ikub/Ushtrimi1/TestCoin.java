package Ushtrimi1;

public class TestCoin {

	public static void main(String[] args) {

		Coin litecoin = new Coin();
		for (int i = 0; i < 7; i++) {
			litecoin.flip();
		}
		Coin bitcoin = new Coin();
		bitcoin.flip();
		System.out.println(litecoin.totalNumberOfFlipsForThisCoin());
		System.out.println(bitcoin.totalNumberOfFlipsForThisCoin());
		System.out.println(Coin.totalNumberOfFlipsForAllCoins());
	}

}

/*
 - Pika b kam deklaruar nje variabel cntb i cili ruan sa here therritet metoda flip() per
 cdo monedhe , duke qene se eshte variabel jostatik varet nga objektet e instances dhe eshte
 i ndryshem per cdo objekt qe krijohet.
 - Pika c kam deklaruar nje variabel klase(statik) i cili e ruan informacionin per te gjithe
 objektet e klases ne nje hapesire unike te kujteses
 */
