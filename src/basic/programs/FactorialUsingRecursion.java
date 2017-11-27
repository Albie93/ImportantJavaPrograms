package basic.programs;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	
	public static void main(String[] args) {
		
		System.out.println("Eneter The Nuumber:");
		int num = new Scanner(System.in).nextInt();
		System.out.println("Factorial of  "+num + " is "+fact(num));
		
	}
	
	public static int fact(int n1){
		
		if(n1==0){
			
			return 1;
		}
		return n1*fact(n1-1);
		
	}

}
