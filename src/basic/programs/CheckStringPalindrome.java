package basic.programs;

import java.util.Scanner;

public class CheckStringPalindrome {
	
	
	public static void main(String[] args) {
		
		String a,b;
		StringBuffer sb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		a = sc.nextLine();
		sb = new StringBuffer(a);
		b = sb.reverse().toString();
		if(a.equalsIgnoreCase(b)){
			System.out.println("String Is palindrome");
			
		}
		else {
			System.out.println("String is not Palindrome");
		}
	sc.close();	
	}

}
