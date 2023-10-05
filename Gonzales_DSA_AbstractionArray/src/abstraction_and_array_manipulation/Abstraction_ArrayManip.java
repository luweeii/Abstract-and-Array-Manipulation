package abstraction_and_array_manipulation;

import java.util.Scanner;
public class Abstraction_ArrayManip {

	public static void main(String[] args) {

		//USER INPUT VALUES
		Scanner sc = new Scanner(System.in);
		int [] inputGrades = new int[10];

		System.out.println("Enter student's Grades or [Q] to exit");
		for (int i = 0; i < 10; i++) {
			System.out.print("Grade #[" + (i+1) + "]: ");
			String input = sc.nextLine();

			if (input.equalsIgnoreCase("q")) {
				break;
			}

			try {
				int num = Integer.parseInt(input);
				inputGrades[i] = num;
			} catch (NumberFormatException e){
				System.out.println("\nInvalid Input! Enter only numbers.");
				i--;
			}
		}

		System.out.println("\n~~Student's Grades~~");
		for (int i = 0; i < 10 && inputGrades[i] != 0; i++) {
			System.out.print(inputGrades[i]);
			if (i < 9 && inputGrades [i+1] != 0) {
				System.out.print(", ");
			}
		}

		//Calculate average
		double sum = 0;
		for (int value : inputGrades) {
			sum += value;
		}
		double average = sum / 	inputGrades.length;

		System.out.println("\n\nAverage of the student's grades: " + average);
		//Calculate maximum value
		int max = inputGrades[0];
		for (int value : inputGrades) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println("Maximum value: " + max);

		//Calculate minimum value
		int min = inputGrades[0];
		for (int value : inputGrades) {
			if (value < min ) {
				max = value;
			}
		}
		System.out.println("Minimum value: " + min);


		//PRE-DEFINED VALUES
/*		int [] studentGrades = {85, 92, 78, 88, 95, 89, 76, 98, 71, 91};

		//Calculate average
		double sum = 0;
		for (int value : studentGrades) {
			sum += value;
		}
		double average = sum / 	studentGrades.length;

		System.out.println("Average of the student's grades: " + average);

		//Calculate maximum value
		int max = studentGrades[0];
		for (int value : studentGrades) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println("Maximum value: " + max);

		//Calculate minimum value
		int min = studentGrades[0];
		for (int value : studentGrades) {
			if (value < min ) {
				max = value;
			}
		}
		System.out.println("Minimum value: " + min); */


	}

}
