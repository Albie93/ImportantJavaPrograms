package basic.programs;

import java.util.Scanner;

public class CheckIntegerPalindrome {

	public static void main(String[] args) {

		System.out.println("Eneter The Nuumber:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		isPalindrome(number);
		sc.close();
       
	}

	public static boolean isPalindrome(int number1) {
		int palidrome = reverse(number1);
		if (number1 == palidrome) {
			System.out.println("Number is Palindrome");
			return true;
		}
		System.out.println("Number is not Palindrome");

		return false;

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
