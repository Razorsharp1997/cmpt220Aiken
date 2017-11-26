// JA: Where is the test class for this?
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) 
			throws IllegalTriangleException {
		if (side1 + side2 <= side3 || 
				side1 + side3 <= side2 || 
				side2 + side3 <= side1) 
			throw new IllegalTriangleException(side1, side2, side3);

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double a = (side1 + side2 + side3) / 2;
		return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: Side 1 = " + side1 + ", " + " Side 2 = " + side2 
				+ ", " + " Side 3 = " + side3;
	}
}