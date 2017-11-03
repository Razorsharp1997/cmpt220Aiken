public class TheCourseClass {
	public static void main(String[] args) {
		Course course1 = new Course("Software Development One");
		Course course2 = new Course("System and Software Analysis");

		course1.addStudent("Raislan Aiken");
		course1.addStudent("Preston DeMarco");
		course1.addStudent("Mark Miller");
		course1.addStudent("Julia Solin");
		course1.addStudent("Holly Shea");
		course1.addStudent("Ian Grant");

		course2.addStudent("Raislan Aiken");
		course2.addStudent("Preston DeMarco");
		course2.addStudent("Mark Miller");
		course2.addStudent("Julia Solin");
		course2.addStudent("Holly Shea");
		course2.addStudent("Ian Grant");

		System.out.println("The number of students in course 1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();

		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.println(students[i] + " ");
		
		System.out.println();
		System.out.println("The number of students in course 2: "
			+ course2.getNumberOfStudents());
		String[] student = course2.getStudents();
		
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.println(students[i] + " ");
	}
}