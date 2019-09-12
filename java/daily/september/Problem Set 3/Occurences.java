
import java.util.Scanner;

public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] cardValues = new int[7];
		String[] cardSuits = new String[7];
		
		for (int i = 0; i < 7; i++) {
			cardValues[i] = (int)(Math.random() * ((13 - 0) + 1)) + 0;
			if (cardValues[i] == 1) {
				cardSuits[i] = "Ace";
			}
			else if (cardValues[i] == 2) {
				cardSuits[i] = "2";
			}
			else if (cardValues[i] == 3) {
				cardSuits[i] = "3";
			}
			else if (cardValues[i] == 4) {
				cardSuits[i] = "4";
			}
			else if (cardValues[i] == 5) {
				cardSuits[i] = "5";
			}
			else if (cardValues[i] == 6) {
				cardSuits[i] = "6";
			}
			else if (cardValues[i] == 7) {
				cardSuits[i] = "7";
			}
			else if (cardValues[i] == 8) {
				cardSuits[i] = "8";
			}
			else if (cardValues[i] == 9) {
				cardSuits[i] = "9";
			}
			else if (cardValues[i] == 10) {
				cardSuits[i] = "10";
			}
			else if (cardValues[i] == 11) {
				cardSuits[i] = "Jack";
			}
			else if (cardValues[i] == 12) {
				cardSuits[i] = "Queen";
			}
			else if (cardValues[i] == 13) {
				cardSuits[i] = "King";
			}
		}
		
		System.out.println("Please enter a number associated with a card (Ace is 1, Jack is 11, Queen is 12, King is 13: ");
		int guess = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < 7; i++) {
			System.out.println(cardSuits[i]);
			if (cardValues[guess] != cardValues[i]) {
			}
			else {
				count++;
			}
		}
		
		System.out.println(guess + " appears " + count + " time(s)");
		
		sc.close();
	}

}
