/*
 * Exercises - Inheritance
 * Tahmid Chowdhury
 */
public class ShapesTest {

	public static void main(String[] args) {
		//declares predetermined variables
		int j = 3;
		int k = 4;
		int l = 5;
		
		//outputs area and perimeter if shape is a rectangle
		Rectangle r = new Rectangle(j, k);
		System.out.println("Rectangle\nArea: " + r.area() + " units\nPerimeter: " + r.perimeter() + " units");
		
		//outputs area and perimeter if shape is a triangle
		Triangle t = new Triangle(j, k, l);
		System.out.print("\nTriangle\nArea: ");
		//if area is impossible, returns 'not possible'
		if (t.area() == 0.0) {
			System.out.print("Not possible");
		}
		else {
			System.out.print(t.area() + " units");
		}
		System.out.println("\nPerimeter: " + t.perimeter() + " units");
		
		//outputs area and perimeter if shape is a square
		Square s = new Square(j);
		System.out.println("\nSquare\nArea: " + s.area() + " units\nPerimeter: " + s.perimeter() + " units");

	}

}
