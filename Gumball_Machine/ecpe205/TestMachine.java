package ecpe205;

public class TestMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person (7);
		
		person.insertCoin(gumballMachine);
		person.insertCoin(gumballMachine);
		person.insertCoin(gumballMachine);
		person.insertCoin(gumballMachine);
		person.insertCoin(gumballMachine);
		person.insertCoin(gumballMachine);
	    person.insertCoin(gumballMachine);

	}

}
