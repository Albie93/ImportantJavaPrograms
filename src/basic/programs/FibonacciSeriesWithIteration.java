package basic.programs;

import java.util.Scanner;

public class FibonacciSeriesWithIteration {
//Write a code for FibonacciSeriesWithIteration
	
	public static void main(String[] args) {

		System.out.println("Enter Number");
		int num = new Scanner(System.in).nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(fibonacci2(i));

		}
	}

	public static int fibonacci2(int n1) {

		if (n1 == 1 || n1 == 2) {

			return 1;
		}
		int fb1 = 1;
		int fb2 = 1;
		int fb = 0;
		for (int i = 3; i <= n1; i++) {

			fb = fb1 + fb2;
			fb1 = fb2;
			fb2 = fb;
		}
		System.out.println("To verify changes for Git Repository ");
		return fb;
		

	}
}