package basic.programs;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static int temp,num1,result=0;

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		checkArmstrongNumber(number);
		
	}
	public static void checkArmstrongNumber(int number){
		 
		int num = number;
		while(number!=0){
			temp = number%10;
			System.out.println("TEmp "+temp);
			result = result+temp*temp*temp;
			System.out.println("Result: "+result);
			number /= 10;	
			System.out.println("Number: " +number);
		}
		
		if(result==num){
			System.out.println("its Armstrong Number");
			
		}
		else {
			
			System.out.println("Its not Armstrong Number");
		}
		
		
	}

}
