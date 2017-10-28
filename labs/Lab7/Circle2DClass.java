
public class Circle2DClass {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(10, 4.5, 22);

		System.out.println("Circle1 area: " + c1.getArea()); 
		System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
		System.out.println("Does circle1 contain the point (7, 14)? " + c1.contains(7, 14)); 
		System.out.println("Does circle1 contain the circle centered at (1, 6) and radius 8.5? " 
				+ c1.contains(new Circle2D(1, 6, 8.5)));
		System.out.println("Does circle1 overlap the circle centered at (18, 21) and radius 3.1? " 
			+ c1.overlaps(new Circle2D(18, 21, 3.1)));
	}
}