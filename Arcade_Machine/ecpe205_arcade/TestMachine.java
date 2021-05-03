package ecpe205_arcade;

public class TestMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		ArcadeMachine arcadeMachine = new ArcadeMachine();
		Person person = new Person(4);
		
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		

	}

}
