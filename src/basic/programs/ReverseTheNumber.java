package basic.programs;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {

		System.out.println("Eneter The Nuumber:");
		int number = new Scanner(System.in).nextInt();

		int reverse = reverse(number);
		System.out.println("Reverse of this Number " + number + " is " + reverse);

	}

	public static int reverse(int number) {

		int reverse = 0;
		int remainder = 0;
		do {
			remainder = number % 10;
			System.out.println("remainder:" + remainder);
			reverse = reverse * 10 + remainder;
			System.out.println("Reverse:" + reverse);
			number = number / 10;
			System.out.println("Number:" + number);

		} while (number > 0);
		return reverse;

	}

}
