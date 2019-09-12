
import java.util.Scanner;

public class Average1 {

	public static int getAverage(int a, int b, int c, int d) {
		return (a + b + c + d)/4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your grade for course 1: ");
		int a = sc.nextInt();
		System.out.println("Please enter your grade for course 2: ");
		int b = sc.nextInt();
		System.out.println("Please enter your grade for course 3: ");
		int c = sc.nextInt();
		System.out.println("Please enter your grade for course 4: ");
		int d = sc.nextInt();
		System.out.println("\nYour average is " + getAverage(a, b, c, d));
		sc.close();
	}

}
