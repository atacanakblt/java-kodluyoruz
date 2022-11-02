package noteCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your math note : ");
		int math = scanner.nextInt();

		System.out.print("Enter your physics note : ");
		int physics = scanner.nextInt();

		System.out.print("Enter your chemistry note : ");
		int chemistry = scanner.nextInt();

		System.out.print("Enter your turkish note : ");
		int turkish = scanner.nextInt();

		System.out.print("Enter your history note : ");
		int history = scanner.nextInt();

		System.out.print("Enter your music note : ");
		int music = scanner.nextInt();

		int total = (math + physics + chemistry + turkish + history + music);
		double average = total / 6;
		System.out.println("Your average : " + average);
		System.out.println(average > 60 ? "Passed the class" : "Failed the class");

	}

}
