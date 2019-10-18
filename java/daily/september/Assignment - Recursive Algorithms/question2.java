/*
 * Assignment - Recursive Algorithms
 * Tahmid Chowdhury
 * 09/17/2019
 */

import java.util.Scanner;

public class question2 {

	//reverse method takes a String and returns it in reverse
	public static String reverse(String s) {
		//checks to see if the string is 1 or less characters, in which case it returns the same thing
		if (s.length() <= 1) {
			return s;
		}
		//runs normal recursive algorithm
		else {
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}

	public static void main(String[] args) {
		//initializes Scanner class
		Scanner sc = new Scanner(System.in);

		//asks user for a String and stores it in input
		System.out.println("Please enter a string to reverse: ");
		String input = sc.nextLine();
		
		//prints reversed String after running it through reverse method
		System.out.println(reverse(input));
		
		//closes Scanner class
		sc.close();
	}

}
