
import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int[] input = new int[20];
		int total = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Please enter a value for integer #" + (i + 1) + ": ");
			input[i] = sc.nextInt();
			total = total + input[i];
		}
		System.out.println("\nThe average of the integers you have entered is " + (total / 20));
		sc.close();
	}

}
