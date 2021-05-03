package ecpe205;

public class Person {
	private int coins;
	
	public Person(int coins) {
		this.coins = coins;
	}

	public void insertCoin( Coinable coinable) {
		System.out.println("Coin Inserted");
		coins--;
		if(!coinable.insertCoin()) {
			coins++;
			System.out.println("Coin Refunded");
		}
		
		System.out.println("Coin count : " + coins);
	}
}
