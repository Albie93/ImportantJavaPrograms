package basic.programs;

import java.util.Scanner;

public class FibonacciWithRecursion {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		int num = new Scanner(System.in).nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(fibonacci(i));

		}

		
	}
	
	public static int fibonacci(int number)
	{ 
		if(number == 1 || number == 2)
		{ return 1; 
		}
		return fibonacci(number-1) + fibonacci(number -2); 
		}
	}

	

