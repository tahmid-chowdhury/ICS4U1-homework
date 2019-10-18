/*
 * Assignment - Recursive Algorithms
 * Tahmid Chowdhury
 * 09/17/2019
 */

import java.util.Scanner;

public class question1 {
	
	//fib method takes an integer and returns it's Fibonacci number
	public static int fib(int n) {
		//checks to see if the integer is 1, in which case it returns 1
		if (n == 1) {
			return 1;
		}
		//checks to see if the integer is 0, in which case it returns 0
		else if (n == 0 ) {
			return 0;
		}
		//runs normal recursive algorithm
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		//initializes Scanner class
		Scanner sc = new Scanner (System.in);
		
		//asks user for an integer and stores it in input
		System.out.println("Enter a number to calculate the nth Fibonacci term: ");
		int input = sc.nextInt();
		
		//prints Fibonacci after running it through fib method
		System.out.println("Fibonacci number = " + fib(input));
		
		//closes Scanner class
		sc.close();
	}

}
