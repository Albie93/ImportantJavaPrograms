package basic.programs;

import java.util.Scanner;

public class FactorailWithIteration {
    //Write a code For FactorialWithIteration
	
	public static void main(String[] args) {
		
		System.out.println("Eneter The Nuumber:");
		int num = new Scanner(System.in).nextInt();
		System.out.println("Factorial of  "+num + " is "+factorial(num));
		
	}
	
	public static int factorial(int n1){
		
		int result = 1;
		while(n1!=0){
			result = result*n1;
			n1--;
			
		}
		return result;
	}
	
	
}
