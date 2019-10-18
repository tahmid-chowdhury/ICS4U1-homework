/*
 * Assignment - Recursive Algorithms
 * Tahmid Chowdhury
 * 09/17/2019
 */

import java.util.Scanner;

public class question3 {

	//isPalindrome method takes a String and checks whether or not it's a palindrome
	public static boolean isPalindrome(String s) {
		//checks to see if the string is 1 or less characters, in which case it returns the same thing
		if (s.length() <= 1) {
			return true;
		}
		//runs normal recursive algorithm
		else if (s.charAt(0) == s.charAt(s.length()-1)) {
			return isPalindrome(s.substring(1, s.length()-1));
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		//initializes Scanner class
		Scanner sc = new Scanner (System.in);
		
		//asks user for a String and stores it in input
		System.out.println("Please enter a string to check if it is a palindrome: ");
		String input = sc.nextLine();
		
		//prints true or false after running it through isPalindrome method
		System.out.println(isPalindrome(input));
		
		//closes Scanner class
		sc.close();
	}

}
