/*
 * OOP Assignment 1 - Fraction
 * Tahmid Chowdhury
 * 09/23/2019
 */

public class TestFraction {

	public static void main(String[] args) {
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(4, 6);
		Fraction c = new Fraction(5, 4);
		
		System.out.println(a.toString());
		
	    System.out.println(b.toString());
	    b.reduce();
	    System.out.println(b.toString());
	    
	    System.out.println(c.toString());
	    c.reciprocal();
	    System.out.println(c.toString());
	    System.out.println(c.toMixed());
	    
	    a.add(b);
	    System.out.println(a.toString());
	    
	    b.subtract(c);
	    System.out.println(b.toString());
	    b.value();
	    System.out.println(b.toString());
	    
	    
	}
	
}
