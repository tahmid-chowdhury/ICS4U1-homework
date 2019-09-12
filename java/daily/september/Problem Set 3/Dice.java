
public class Dice {

	public static int rollDice() {
		return (int)(Math.random() * ((6 - 0) + 1)) + 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The die rolled a " + rollDice() + "!");
	}

}
