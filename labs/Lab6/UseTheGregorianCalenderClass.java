import java.util.GregorianCalendar;

public class UseTheGregorianCalenderClass {

	public static void main(String[] args) {
		GregorianCalendar calender = new GregorianCalendar();
		
		int day = calender.get(calender.MONTH);
		int month = calender.get(calender.DAY_OF_MONTH);
		int year = calender.get(calender.YEAR);
		
		System.out.print("Current year, month, and day in format Mth/Day/Year: ");
		System.out.println( day + "/" + month + "/" + year);
		
		calender.setTimeInMillis(1234567898765L);
		
		System.out.print("Elapsed time since January 1, 1970 in the format Mth/Day/Year: " + calender.get(calender.MONTH) + "/" +
				calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}

}
