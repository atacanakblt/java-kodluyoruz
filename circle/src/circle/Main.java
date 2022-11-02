package circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double pi =3.14;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle : ");
		double r = scanner.nextInt();
		
		System.out.print("Enter the center angle of the circle : ");
		double a = scanner.nextInt();
		
		double area = pi*r*r;
		System.out.println("Circle area : " + area);

		double perimeter = 2*pi*r;
		System.out.println("Circle perimeter : " + perimeter);

		double circleSliceArea = (pi*(r*r)*a)/360;
		System.out.println("Circle slice area : " + circleSliceArea);
		
	}

}
