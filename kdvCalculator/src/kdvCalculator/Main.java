package kdvCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double vatRatio = 0.18;
		double vatRatio2 = 0.08;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the fee amount : ");
		double amount = scanner.nextDouble();

		double totalVat = (amount >= 1000) ? vatRatio : vatRatio2;
		double vatAmount = amount * totalVat;
		double vatAddedAmount = amount + vatAmount;

		System.out.println("VAT free amount : " + amount);
		System.out.println("VAT amount : " + vatAmount);
		System.out.println("VAT added amount : " + vatAddedAmount);
	}

}
