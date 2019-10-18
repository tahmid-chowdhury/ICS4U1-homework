/*
 * Exercises - Inheritance
 * Tahmid Chowdhury
 */
import java.lang.Math;

//declares Shapes class
public abstract class Shapes {
	
	public abstract double area();
	
	public abstract int perimeter();
	
}

//declares Rectangle class
class Rectangle extends Shapes {
	//private variables for the sides
	private static int a, b;
	//constructors
	public Rectangle(int x, int y) {
		a = x;
		b = y;
	}
	public Rectangle(int x) {
		a = x;
	}
	//calculates area
	public double area() {
		int area = a*b;
		return area;
	}
	//calculates perimeter
	public int perimeter() {
		int perimeter = (a *2) + (b * 2);
		return perimeter;
	}
	public static void main(String[] args) {
		Rectangle x = new Rectangle(a, b);
		System.out.println(x);
	}
}

//declares Triangle class
class Triangle extends Shapes {
	//private variables for the sides
	private static int a, b, c;
	//constructor
	public Triangle(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}
	//calculates area
	public double area() {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		//if area is impossible, returns 0
		if (area > 0 || area < 0) {
			return area;
		}
		else {
			return 0;
		}
	}
	//calculates perimeter
	public int perimeter() {
		int perimeter = (a + b + c);
		return perimeter;
	}
	public static void main(String[] args) {
		Triangle x = new Triangle(a, b, c);
		System.out.println(x);
	}
}

//declares Square class
class Square extends Rectangle {
	//private variable for side
	private static int a;
	//constructor
	public Square(int x) {
		super(x);
		a =x;
	}
	//calculates area
	public double area() {
		double area = a*a;
		return area;
	}
	//calculates perimeter
	public int perimeter() {
		int perimeter = a*4;
		return perimeter;
	}
	public static void main(String[] args) {
		Square x = new Square(a);
		System.out.println(x);
	}  
}
