
public class CourseClass {
	public static void main(String[] args) {
		Course disMath = new Course("Discrete Math");

		disMath.addStudent("Mark Miller");
		disMath.addStudent("\nRaislan Aiken");
		disMath.addStudent("Preston DeMarco");
		disMath.addStudent("Julia Solin");
		disMath.addStudent("Holly Shea");

		disMath.dropStudent("Preston DeMarco");
		disMath.dropStudent("Julia Solin");
		disMath.dropStudent("Holly Shea");

		System.out.println("\nThe students in the course " + 

			disMath.getCourseName() + ":");

		String[] students = disMath.getStudents();

		for (int i = 0; i < disMath.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}

		System.out.println();
	}
}
