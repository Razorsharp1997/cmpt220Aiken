
public class ConversionsBwteenFeetAndMeters {

	public static void main(String[] args) {
		System.out.println("Feet   Meters   |   Meters      Feet");
		System.out.println("----------------------------------------");
		for (double f = 1.0, m = 20.0; f <= 10.0; f++, m += 5) {
			System.out.printf("%4.1f   ", f);
			System.out.printf("%6.3f", footToMeter(f));
			System.out.print("   |   ");
			System.out.printf("%-11.1f", m);
			System.out.printf("%7.3f/n", meterToFoot(m));
			System.out.println();
		}
	}
	
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
	
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
	
}
