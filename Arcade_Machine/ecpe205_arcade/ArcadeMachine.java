package ecpe205_arcade;

public class ArcadeMachine implements Coinable, Dispensable {
	int coins;
	
	public ArcadeMachine(){
		this.coins = 0;
	}
	{
		System.out.println( "Please Insert Coin");
		System.out.println( "Coin(s) Inserted");
	}
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Ready to PLAY");
		System.out.println("playing.......");
		System.out.println("GAME ENDED");
		coins++;
	}

	@Override
	public void reload(int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertCoin() {
		// TODO Auto-generated method stub
		this.dispense();
		return false;
	}
	

}
