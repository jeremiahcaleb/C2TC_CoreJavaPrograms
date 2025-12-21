package DataTypeandVariables;

public class dataType {
	
	public static void main(String[] args) {

		int age = 21;

		double salary = 50000.00;

		boolean isPassed = true;

		char grade = 'A';

		String name = "Jeremiah";

		float height = 5.9f;

		long phoneNumber = 9876543210L;

		byte experienceYears = 3;

		short employeeId = 1023;

		int roundSalary = (int) salary;

		// Arithmetic operation
		int increment = 5000;
		int total = roundSalary + increment;

		// Output
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Rounded Salary: " + roundSalary);
		System.out.println("Total Salary: " + total);
		System.out.println("Passed: " + isPassed);
		System.out.println("Grade: " + grade);
		System.out.println("Height: " + height);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Experience (Years): " + experienceYears);
		System.out.println("Employee ID: " + employeeId);
	}

}

