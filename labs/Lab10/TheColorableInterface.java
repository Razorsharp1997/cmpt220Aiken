public class TheColorableInterface {
	public static void main(String[] args) {
		GeometricObject[] squares = {new Square(2.2), new Square(14), 
			new Square(11.3), new Square(20), new Square(9.8)};

		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
		 } 
	}
}