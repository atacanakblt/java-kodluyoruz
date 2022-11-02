package greengrocerCashTill;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double pear = 2.14;
		double apple = 3.67;
		double tomato = 1.11;
		double banana = 0.95;
		double aubergine = 5;

		Scanner scanner = new Scanner(System.in);

		System.out.print("How many kilograms of pears : ");
		double kgPear = scanner.nextInt();
		double pearPrice = kgPear * pear;
		System.out.println("Price of pear" + pearPrice);

		System.out.print("How many kilograms of apples : ");
		double kgApple = scanner.nextInt();
		double applePrice = kgApple * apple;
		System.out.println("Price of apple" + applePrice);

		System.out.print("How many kilograms of tomatoes : ");
		double kgTomato = scanner.nextInt();
		double tomatoPrice = kgTomato * tomato;
		System.out.println("Price of tomato" + tomatoPrice);

		System.out.print("How many kilograms of bananas : ");
		double kgBanana = scanner.nextInt();
		double bananaPrice = kgBanana * banana;
		System.out.println("Price of banana" + bananaPrice);

		System.out.print("How many kilograms of aubergines : ");
		double kgAubergine = scanner.nextInt();
		double auberginePrice = kgAubergine * aubergine;
		System.out.println("Price of aubergine" + auberginePrice);

		double totalAmount = (pearPrice + applePrice + tomatoPrice + bananaPrice + auberginePrice);
		System.out.println("Total amount : " + totalAmount + " TL");

	}

}
