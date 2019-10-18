/*
 * OOP Assignment 1 - Fraction
 * Tahmid Chowdhury
 * 09/23/2019
 */

public class Fraction {
	
	//Attributes
	private int numerator, denominator;

	//Constructors
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	
	//Accessors
	
	//Mutators
	
	//Methods
	//Reduces the instance
	public void reduce() {
		int n = numerator;
		int d = denominator;
		int largest = 0;
		if (numerator < 0) {
			n = --numerator;
		}
		else if (n > d) {
			largest = n;
		}
		else {
			largest = d;
		}
		int gcd = 0;
		for (int i = largest; i >= 2; i--) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
				break;
			}
		}
		if (gcd != 0) {
			numerator /= gcd;
			denominator /= gcd;
		}
	}

	//Adds another fraction to this instance
	public void add(Fraction other) {
		reduce();
		other.reduce();
		Fraction sum = new Fraction();
		sum.denominator = denominator * other.denominator;
		sum.numerator = numerator * other.denominator + denominator * other.numerator;
		sum.reduce();
		numerator = sum.numerator;
		denominator = sum.denominator;
	}
	
	//Subtracts another fraction from this instance
	public void subtract(Fraction other) {
		reduce();
		other.reduce();
		Fraction difference = new Fraction();
		difference.denominator = denominator * other.denominator;
		difference.numerator = numerator * other.denominator - denominator * other.numerator;
		difference.reduce();
		numerator = difference.numerator;
		denominator = difference.denominator;
	}
	
	//Returns the reciprocal of the instance
	public void reciprocal() {
		Fraction reciprocal = new Fraction();
		reciprocal.denominator = numerator;
		reciprocal.numerator = denominator;
	}
	
	//Returns the decimal equivalent of the instance
	public double value() {
		double decimal = numerator / denominator;
		return decimal;
	}
	
	//Converts the instance to a String
	public String toString() {
		return numerator + "/" + denominator;
		
	}
	
	//Converts the instance to a mixed fraction
	public String toMixed() {
		int whole = numerator / denominator;
		numerator = numerator % denominator;
		return whole + " " + numerator + "/" + denominator;
	}

}
