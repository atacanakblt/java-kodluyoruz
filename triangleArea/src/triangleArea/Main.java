package triangleArea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first side : ");
		int a = scanner.nextInt();

		System.out.print("Enter the second side : ");
		int b = scanner.nextInt();

		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hypotenuse : " + c);

		double trianglePerimeter = ((a + b + c) / 2) * 2;
		System.out.println("Perimeter : " + trianglePerimeter);

		double u = (a + b + c) / 2;
		System.out.println(u);

		double triangleArea = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Area : " + triangleArea);

	}

}
