
import java.util.Scanner;

public class MakingChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		for (;;) {
			System.out.println("Please enter a positive integer value between 1 and 1000: ");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Thanks for coming out!");
				break;
			}
			else if (input > 0 && input <= 1000) {
				System.out.println(input + " cents in coins is: ");
				int quarters = input / 25;
				input -= quarters * 25;
				System.out.println(quarters + " quarters");
				int dimes = input / 10;
				input -= dimes * 10;
				System.out.println(dimes + " dimes");
				int nickels = input / 5;
				input -= nickels * 5;
				System.out.println(nickels + " nickels and\n" + input + " pennies\n");
			}
			else {
				System.out.println("Sorry, that’s not a valid input.\n");
			}
		}
		sc.close();
	}

}
