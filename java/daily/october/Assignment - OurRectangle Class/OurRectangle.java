/*
 * Assignment - OurRectangle Class
 * Tahmid Chowdhury
 * 10/01/2019
 */

public class OurRectangle {

	//Attributes
	private int x, y, width, height;
	//Constructors
	//Ensures that all parameters are positive
    //If the height and width are negative then the results are 0
	public OurRectangle(int a, int b, int c, int d) {
		x = a;
		y = b;
		if (c < 0) {
			c = 0;
		}
		else {
			width = c;
		}
		if (d < 0) {
			d = 0;
		}
		else {
			height = d;
		}
	}

	//Accessors
	
	//Mutators
	
	//Methods
	//Converts the rectangle to a String
	public String toString() {
		return "base: (" + x + "," + y + ") w:" + width + " h:" + height;
	}
	
	//Calculates the area of the rectangle
	public int area() {
		int area = width*height;
		return area;
	}
	
	//Calculates the perimeter of the rectangle
	public int perimeter() {
		int perimeter = (width*2) + (height*2);
		return perimeter;
	}
	
	//Determines the coordinates and measurements of the rectangle formed by the two declared intersecting
	public static OurRectangle intersection(OurRectangle a, OurRectangle b) {
		if (a.x > (b.x + b.width) || b.x > (a.x + a.width)) {
			OurRectangle c = new OurRectangle(0, 0, 0, 0);
			return c;
		}
		else if ((a.y + a.height) < b.y || (b.y + b.height) < a.y) {
			OurRectangle c = new OurRectangle(0, 0, 0, 0);
			return c;
		}
		else {
			int x1 = Math.max(a.x, b.x);
			int y1 = Math.max(a.y, b.y);
			int x2 = Math.min((a.x + a.width), (b.x + b.width));
			int y2 = Math.min((a.y + a.height), (b.y + b.height));
			OurRectangle c = new OurRectangle(x1, y1, (x2 - x1), (y2 - y1));
			return c;
		}
	}
	
	//Calculates the perimeter of two intersecting rectangles
	public static int totalPerimeter(OurRectangle a, OurRectangle b) {
		OurRectangle c = OurRectangle.intersection(a,  b);
		return a.perimeter() + b.perimeter() - c.perimeter();
	}
	
	//Checks whether or not one rectangle engulfs the other
	public boolean contains(OurRectangle r) {
		if (r.x >= x && r.y >= y && r.width <= width && r.height <= height && (r.y + r.height) <= (y + height) && (r.x + r.width) <= (x + width)) {
			return true;
		}
		else {
			return false;
		}
	}
}
